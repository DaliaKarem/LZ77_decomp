package com.peta.java;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class LZ77 {

        public static void main(String []args)
        {

        int []s={0,0,2,3,5,2,5,1};
        int []k={0,0,1,2,3,2,5,1};
        char []m={'A','B','A','B','B','B','B','A'};
        LZ_77comp mo=new LZ_77comp();
        mo.decompression(s,k,m);
    }
}


