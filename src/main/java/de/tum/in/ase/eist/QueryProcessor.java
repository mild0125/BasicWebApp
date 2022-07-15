package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "SY2";
        } else if(query.contains("which of the following numbers is the largest")) {

            return "";
        } else {

            if(query.contains("plus")) {
                String[] strings = query.split(" ");
                int num1 = Integer.parseInt(strings[2]);
                int num2 = Integer.parseInt(strings[4]);
                String answer = num1 + num2 + "";
                return answer;
            }
            return "";
        }


    }
}
