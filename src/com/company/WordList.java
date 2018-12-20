package com.company;

import java.util.ArrayList;

public class WordList {
    private ArrayList myList;

    public WordList(ArrayList list)
    {
        this.myList = list;
    }

    public int numWordsOfLength(int l)
    {
        int count = 0;
        String x = "";
        for(int i = 0; i < myList.size(); i++)
        {
            x = myList.get(i).toString();
            if(x.length() == l)
            {
                count++;
            }
        }
        return count;
    }

    public void removeWordsOfLength(int l)
    {
        for(int i = 0; i < myList.size(); i++)
        {
            if(myList.get(i).toString().length() == l)
            {
                myList.remove(i);
            }
        }
    }
}
