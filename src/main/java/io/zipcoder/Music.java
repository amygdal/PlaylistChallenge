package io.zipcoder;

public class Music {

    private String[] playList;

    public Music (String[] playList){

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

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
    }
}
