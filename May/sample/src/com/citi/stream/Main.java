package com.citi.stream;

import java.io.Console;

public class Main {

    public  void main(String[] args) {
	// write your code here
        for (int i=0; i<=10; i++)
        {
            Frame obj = new Frame();
            obj.RollExt(0);
            obj.Score();
        }

    }

    public class Frame
    {
        public int pinsCount;
        public int rollCount;
        public int remainingPins;
        public int totalScore;
        public int frameCount;
        public int totalCountwithinFrame =1;

        public void RollExt(int pinsKnockedOff)
        {
            if(frameCount<=10)
            {
                if(rollCount == 0)
                {
                    Roll(pinsKnockedOff);
                }
                else if(pinsCount > 0)
                {
                    Roll(pinsKnockedOff);
                    frameCount++;
                    rollCount = 0;
                }
                else if(pinsCount == 10)
                {
                    frameCount++;
                }

            }
        }

        public void Roll(int pinsKnockedOff)
        {
            //if first roll subtract the pins or score from 10
            if(rollCount == 0)
            {
                pinsCount = 10-pinsKnockedOff;
                totalScore += pinsKnockedOff;
                rollCount++; // first roll has been done.
            }
            else if( pinsCount< 10) // for second roll calculate based on the remaining pins
            {
               totalScore = totalScore +  pinsKnockedOff;
            }
            else //if there are no pins left in the first roll.
            {
                return;
            }

        }

        public int Score(){
           return totalScore;
        }
    }
}
