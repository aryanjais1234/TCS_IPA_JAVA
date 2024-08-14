/**
 Electric Board Manager

 You are tasked with creating a class to manage electric boards in a city. Each electric board is identified by a unique ID and tracks power consumption readings over time. Implement the class with the following functionalities:

 1. addReading Method:
 Input: A board ID and a power consumption reading.
 Functionality:
 If the board ID already exists, append the new reading to the existing list of readings for that board.
 If the board ID does not exist, create a new entry for that board with the provided reading.
 2. getAveragePowerConsumption Method:
 Input: A board ID, a starting power consumption reading, and an ending power consumption reading.
 Functionality:
 Calculate the average power consumption for the specified board within the range of the start and end readings (inclusive).
 If no readings fall within the specified range, raise an appropriate error.
 Input Format:
 Enter the number of electric boards to manage:

 For each electric board:

 Enter the board ID:
 Enter the number of power consumption readings:
 For each reading:
 Enter the reading value.
 Calculate Average Power Consumption:

 Enter the board ID for which you want to calculate the average power consumption:
 Enter the start date power consumption reading:
 Enter the end date power consumption reading:
 Example:
 Input:

 Enter the number of electric boards to manage: 2

 Electric Board #1:
 Enter the board ID: B1
 Enter the number of power consumption readings: 3
 Enter reading 1 for board B1: 100
 Enter reading 2 for board B1: 150
 Enter reading 3 for board B1: 200

 Electric Board #2:
 Enter the board ID: B2
 Enter the number of power consumption readings: 2
 Enter reading 1 for board B2: 50
 Enter reading 2 for board B2: 75

 Calculate Average Power Consumption:
 Enter the board ID for which you want to calculate the average power consumption: B1
 Enter the start date power consumption reading: 100
 Enter the end date power consumption reading: 200
 Expected Output:


 The average power consumption is: 150.0
 **/

package ElectricBoard;

import java.util.*;

class ElectricBoardManager {
    String boardId;
    ArrayList<Integer> readings = new ArrayList<>();
    public ElectricBoardManager(String boardId) {
        this.boardId = boardId;
    }
    public void addReading(int reading) {
        this.readings.add(reading);
    }
    public double getAveragePowerConsumption(int startReading, int endReading) {
        int sum = 0;
        int count = 0;

        for (int reading : readings) {
            if (reading >= startReading && reading <= endReading) {
                sum += reading;
                count++;
            }
        }
        if (count == 0) {
            throw new IllegalArgumentException("No readings found in the specified range.");
        }
        return (double) sum / count;
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfBoards = sc.nextInt();
        sc.nextLine();
        Map<String, ElectricBoardManager> boards = new HashMap<>();
        for (int i = 1; i <= numberOfBoards; i++) {
            String boardId = sc.nextLine();
            ElectricBoardManager manager = new ElectricBoardManager(boardId);
            boards.put(boardId, manager);
            int numberOfReadings = sc.nextInt();
            for (int j = 1; j <= numberOfReadings; j++) {
                int reading = sc.nextInt();
                manager.addReading(reading);
            }
            sc.nextLine();
        }
        String boardId = sc.nextLine();
        int startReading = sc.nextInt();
        int endReading = sc.nextInt();
        try {
            ElectricBoardManager manager = boards.get(boardId);
            if (manager == null) {
                throw new IllegalArgumentException("Board ID not found.");
            }
            double averageConsumption = manager.getAveragePowerConsumption(startReading, endReading);
            System.out.println( averageConsumption);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
