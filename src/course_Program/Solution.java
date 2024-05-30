/****
 create the class Course with the below Attributes.

 courseId- int
 courseName- String
 courseAdmin- String
 quiz- int
 handson -int

 The above methods should be private ,write getter and
 setter and parametrized constructor as required.

 create class courseProgram with main method.

 implement two static methods-
 findAvgOfQuizByAdmin method:this method will take array
 of Course objects and a String  value as input parameters.
 This method will find out Average (as int) of Quiz questions
 for given Course Admin (String parametre passed)
 This method will return Average if found.if there is no course
 that matches then the method should return 0.

 sortCourseByHandsOn method:
 This method will take an Array of Course Objects and int
 value as input parameters.
 This methods should return an Array of Course objects in an
 ascending order of their  handson which are less than the
 given handson(int parameter passed) value. if there is no
 such course then the method should return null.

 The above mentioned static methods should be called from
 main methods.

 for findAvgOfQuizByAdmin method: The main method
 should print the average if the returned value is not 0.
 if the returned value is 0 then it should print "No Course
 found."


 for sortCourseByHandsOn method:
 the  main method should print the name
 of the Course from the returned Course object Array if the
 returned value is not null.if the returned value is null then
 it should print "No Course found with mentioned attribute."

 input1:
 111
 kubernetes
 Nisha
 40
 10
 321
 cassandra
 Roshini
 30
 15
 457
 Apache Spark
 Nisha
 30
 12
 987
 site core
 Tirth
 50
 20
 Nisha
 17

 output1:
 35
 kubernetes
 Apache Spark
 cassandra

 input2:
 111
 kubernetes
 Nisha
 40
 10
 321
 cassandra
 Roshini
 30
 15
 457
 Apache Spark
 Nisha
 30
 12
 987
 site core
 Tirth
 50
 20
 Shubhamk
 5

 output 2:
 No Course found
 No Course found with mentioned attributes.
 *****/
package course_Program;

import java.util.*;

public class Solution {
    public static void main(String[] args){
        Course[] arr = new Course[4];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            int e = sc.nextInt();

            arr[i] = new Course(a,b,c,d,e);
        }
        sc.nextLine();
        String name = sc.nextLine();
        int m = sc.nextInt();

        int ans1 = findAvgOfQuizByAdmin(arr,name);
        Course[] ans2 = sortCourseByHandsOn(arr,m);

        if(ans1==0) System.out.println("No Course Found");
        else System.out.println(ans1);

        if(ans2!=null){
            for(int i=0;i<ans2.length;i++){
                System.out.println(ans2[i].getCourseName());
            }
        }
        else System.out.println("Not foind");

    }

    public static int findAvgOfQuizByAdmin(Course[] arr, String s){
        int total_score = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getCourseAdmin().equalsIgnoreCase(s)){
                total_score+=arr[i].getQuiz();
                ++count;
            }
        }
        return total_score==0?0:total_score/count;
    }

    public static Course[] sortCourseByHandsOn(Course[] arr, int v){
        ArrayList<Course>ans = new ArrayList();
        ArrayList<Integer> ar = new ArrayList();
        for(int i=0;i<arr.length;i++){
            if(arr[i].getHandson()<v){
                ar.add(arr[i].getHandson());
            }
        }
        Collections.sort(ar);
        for(Integer i: ar){
            for(int j=0;j<arr.length;j++){
                if(i==arr[j].getHandson()){
                    Course c = arr[j];
                    ans.add(c);
                }
            }
        }
        int size = ans.size();
        Course[] anss = new Course[size];
        int i=0;
        for(Course c:ans){
            anss[i]= c;
            i++;
        }

        return ans.size()==0?null:anss;
    }
}

class Course{
    int cousreId;
    String courseName;
    String courseAdmin;
    int quiz;
    int handson;

    public Course(int cousreId, String courseName, String courseAdmin, int quiz, int handson) {
        this.cousreId = cousreId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getCousreId() {
        return cousreId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseAdmin() {
        return courseAdmin;
    }

    public int getQuiz() {
        return quiz;
    }

    public int getHandson() {
        return handson;
    }

}
