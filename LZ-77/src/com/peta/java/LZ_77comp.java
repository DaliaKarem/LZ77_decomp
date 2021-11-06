package com.peta.java;

import java.util.Map;
import java.util.Vector;

public class LZ_77comp {
/*
    public static boolean contains(String sb, String findString){
        return sb.indexOf(findString) > -1;
    }
    int []position=new int[1000];
    int []length=new int[1000];
    public String compression(String word)
    {    //A B A A B A
        //0  1 2 3 4 5
        String next_Symbols= new String();//to ask if it appears or not
        String next=new String() ;//adding it in tag
        int c=0;//c=0
        char []w=word.toCharArray();
        next_Symbols= String.valueOf(w[0]);//next symbol=A
        for(int i=0;i<=word.length();i++)//i=1
        { next=String.valueOf(w[c+1]);//next=A
        if(contains(next_Symbols,next))
        {
           for(int j=c+2;j<word.length();j++)//j=3
           {
               next+=w[j]; //next=AA
               if(contains(next_Symbols,next))
               {continue;}
               else{
                   next_Symbols+=next;//nextSymbol=ABAA
                   c=j+1;/////////////////////////////////////////////////////////////////
                   break;
               }
           }
        }
         else {
             next_Symbols+=next; //next Symbol=AB
             c++;//c=1
        }
        }
 return next;
    }

*/

    public static void decompression(int[] p, int[] len, char[] n) // p go to back ,len num of char
    { //<0,0,A> <0,0,B> <2,1,A> <3,2,B> <5,3,B> <2,2,B> <5,5,B> <1,1,A>
        int sum=0;
        for(int i=0;i<len.length;i++)
        {
            sum+=len[i];
        }
         char[] word = new char[sum+n.length];
         int in=1;
        for (int i = 0; i <n.length; i++)
        {
            if (p[i] == 0 && len[i] == 0)
            {
                word[i] = n[i];
                System.out.print(word[i]);

            }
            else
                {
                in++;
                    int back=in - p[i];//position in back

                    word[in] = word[back];//go to back
                    System.out.print(word[in]);
                   int c=len[i];
                   c--;

                    while(c!=0)
                    { in++;
                        back++;
                        word[in]=word[back];
                        System.out.print(word[in]);
                        c--;
                    }
                    if(c==0)
                    {
                        in++;
                        word[in]=n[i];
                        System.out.print(word[in]);
                    }
                }
                }

        }


    }


