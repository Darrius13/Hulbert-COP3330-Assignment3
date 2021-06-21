package Ex46.base;

import java.io.*;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
public class ReadLineByLineExample2 {
    public static void main(String args[])
    {
        try
        {
//the file to be opened for reading
            FileInputStream fis=new FileInputStream("exercise46_input.txt");
            Scanner sc=new Scanner(fis);    //file to be scanned
//returns true if there is another line to read
            Map<String, Integer> map= new HashMap<>();
            while(sc.hasNextLine())
            {
                computeFrequency(sc.nextLine(), map);
            }
            sc.close();     //closes the scanner
            printFrequency(map);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void computeFrequency(String line, Map<String, Integer> map){
        for(String key: line.split("\\s")){
            if(map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }else{
                map.put(key, 1);
            }
        }
    }

    private static void printFrequency(Map<String, Integer> map){
        PriorityQueue<Map.Entry<Integer,Integer>> q= new PriorityQueue<>(
                (e1,e2)-> (e2.getValue()-e1.getValue()));

        //Step3: fill the priority queue with map entries from map created in step1
        for(Map.Entry<String,Integer> m: map.entrySet()){
            q.add(m);
        }

        while(!pq.isEmpty()){
            Map.Entry<String,Integer> entry= map.poll();
            System.out.println(entry.getKey()+"   "+ "*".repeat(entry.getValue()));
        }

    }

}
