package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList) {

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        //as ref'd from staging:)

        ArrayList<String> allSongs = new ArrayList<String>(Arrays.asList(this.playList));
        int forwardCt = Math.abs(allSongs.indexOf(selection) - startIndex);
        int BackwardCt = Math.abs((allSongs.size() + startIndex) - allSongs.lastIndexOf(selection));
        return Math.min(forwardCt, BackwardCt);

    }
}



        /*
        Integer numOfMoves = 0;

        for (int i = startIndex; i <playList.length; i++){
            if (playList[i].equalsIgnoreCase(selection)){
                numOfMoves =  i - startIndex;
                break;
            }
        }
        //go to the startIndex
        //search thru the array for the name of the song we're actually looking for (if playlist[i].equals("selection")
        //do a simple math equation of that songs index - startIndex
        //return that as your answer

        return numOfMoves;

        */

