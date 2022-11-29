package com.enryption;
import java.util.Scanner;

public class Encryption 
{
    public static Scanner input = new Scanner(System.in);
    
    /*
     * Berikut merupakan function dari alpVocal
     * Dimana function ini mendeklarasi huruf mana aja yang termasuk kedalam huruf vocal
     * Jika termasuk dalam a, i, u, e, o maka akan menghasilkan nilai true
     * Jika tidak termasuk dalam huruf vokal diatas maka bernilai false
     */
    public static boolean alpVocal(char alphabet)
    {
        if(alphabet == 'a' || alphabet == 'i' || alphabet == 'u' || alphabet == 'e' || alphabet == 'o')
        {
            return true;   
        } else{
            return false;
        }
    }
    
    /* 
     * function public static int dt merupakan function yang mendeklarasi nilai dari setiap alphabet
     * alphabet tersebut adalah huruf vokal yang sudah di deklarasi pada function alpVocal
     * dan untuk hasil dari ketika program mendapatkan huruf tersebut
     * hasil dari penjumlahan sudah dihitung dan ditampilkan pada int result
    */
    public static int dt(char alphabet, int index)
    {
        int result = index + (index*index);
        
        if(alphabet == 'A')
        {
            result += 65;
        } else if(alphabet == 'I'){
            result += 73;
        } else if(alphabet == 'U'){
            result += 85;
        } else if(alphabet == 'E'){
            result += 69;
        } else if(alphabet == 'O'){
            result += 79;
        } else if(alphabet == 'a'){
            result += 97;
        } else if(alphabet == 'i'){
            result += 105;
        } else if(alphabet == 'u'){
            result += 117;
        } else if(alphabet == 'e'){
            result += 101;
        } else if(alphabet == 'o'){
            result += 111;
        }
        
        return result;
    }
    /*
     * Berikut merupakan main program yang akan menjalankan program sepenuhnya
     */
	public static void main(String[] args) {
	    System.out.print("\n => How many paragraph you want? Answer : ");
		int sumT = input.nextInt();
		input.nextLine();
		
		String[][] kataS = new String[sumT][1];

		// Diatas menggunakan 2D array
        // string[A][B] -> A = sumT (banyak paragraph yang akan diinput)
        // string[A][B] -> B = index yang digunakan untuk menampung kata-kata paragraf

		System.out.println("");
		
		for(int i=0; i<sumT; i++)
        {
		    System.out.print(" => Paragraph ("+(i+1)+") : ");
		    kataS[i][0] = input.nextLine();
		}
		
		for(int i=0; i<sumT; i++)
        {
		    kataS[i][0] = kataS[i][0].trim();
		}
		
		System.out.println("");

		int count = 1;
		int temp  = 0;

		for(int i=0; i<sumT; i++){
		    count = 1;
		    System.out.print(" => Result ("+(i+1)+") : ");
		    for(int j=0; j<kataS[i][0].length(); j++){
		        if(kataS[i][0].charAt(j) == ' ')
                {
    		        count++;
    		    }
    		    if (alpVocal(Character.toLowerCase(kataS[i][0].charAt(j))))
                {
    		        temp = dt(kataS[i][0].charAt(j), count);
    		        System.out.print(temp);
    		    } else{
    		        System.out.print(kataS[i][0].charAt(j));
    		    }
		    }
		    System.out.println("");
		}
	}
}
