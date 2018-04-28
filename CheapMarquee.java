import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by POWERHOUSE on 4/27/2018.
 */
public class CheapMarquee {

    int cheapMarquee(String message, int width) {
        int currentCount=0;
        int max=0;
        int strindex=1, arrindex=1;
        List<Integer> window = new ArrayList<>();
        int[] arr=pixel(message.charAt(0));
        for(int i=0;i<width && strindex<message.length();i++) {
            if(arrindex==arr.length) {
                arr=pixel(message.charAt(strindex));
                arrindex=0;
                strindex++;
            }
            currentCount+=arr[arrindex];
            window.add(arr[arrindex]);
            arrindex++;
        }
        max=currentCount;
        while(strindex<message.length()) {
            if(arrindex==arr.length) {
                arr=pixel(message.charAt(strindex));
                arrindex=0;
                strindex++;
            }
            currentCount+=arr[arrindex];
            window.add(arr[arrindex]);
            currentCount-=window.remove(0);
            max=(max>=currentCount)?max:currentCount;
            arrindex++;
        }

        return max;
    }
/*
    void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]);
        System.out.println();
    }

    void printWindow(List<Integer> list) {
        int i=0;
        while(i<list.size()) {
            System.out.print(list.get(i));
            i++;
        }
        System.out.println();
    }
*/
    int[] pixel(char c) {
        int ch=c;
        if(ch >=97 && ch <=122) {
            ch=ch-32;
            c=(char)ch;
        }
        switch(c) {
            case 'A': return new int[]{0,4,2,2,4};
            case 'B':return new int[]{0,5,3,3,2};
            case 'C': return new int[]{0,3,2,2,2};
            case 'D': return new int[]{0,5,2,2,3};
            case 'E': return new int[]{0,5,3,3,2};
            case 'F': return new int[]{0,5,2,2,1};
            case 'G': return new int[]{0,3,2,2,3};
            case 'H': return new int[]{0,5,1,1,5};
            case 'I': return new int[]{0,2,5,2,2};
            case 'J': return new int[]{0,2,2,4,1};
            case 'K': return new int[]{0,5,1,2,2};
            case 'L': return new int[]{0,5,1,1,1};
            case 'M': return new int[]{0,5,2,2,5};
            case 'N': return new int[]{0,5,1,2,5};
            case 'O': return new int[]{0,3,2,2,3};
            case 'P': return new int[]{0,5,2,2,1};
            case 'Q': return new int[]{0,3,2,3,4};
            case 'R': return new int[]{0,5,3,3,2};
            case 'S': return new int[]{0,2,3,3,2};
            case 'T': return new int[]{0,1,5,1,1};
            case 'U': return new int[]{0,4,1,1,4};
            case 'V': return new int[]{0,4,1,2,2};
            case 'W': return new int[]{0,4,2,2,5};
            case 'X': return new int[]{0,3,2,2,3};
            case 'Y': return new int[]{0,2,3,1,1};
            case 'Z': return new int[]{0,3,3,3,2};
            case '0': return new int[]{0,3,4,4,3};
            case '1': return new int[]{0,2,5,1,1};
            case '2': return new int[]{0,2,3,3,2};
            case '3': return new int[]{0,3,3,3,2};
            case '4': return new int[]{0,2,2,5,1};
            case '5': return new int[]{0,4,3,3,2};
            case '6': return new int[]{0,3,3,3,2};
            case '7': return new int[]{0,2,2,2,2};
            case '8': return new int[]{0,2,3,3,2};
            case '9': return new int[]{0,2,3,3,3};
            case '.': return new int[]{0,1};
            case ',': return new int[]{0,2};
            case '!': return new int[]{0,4};
            case '?': return new int[]{0,1,3,2,1};
            case ' ': return new int[]{0};
            default: return new int[]{-1};
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the TEXT");
        String text=s.nextLine();
        System.out.println("Enter width of Marquee");
        int width=s.nextInt();

        CheapMarquee obj = new CheapMarquee();
        System.out.println("Maximum Pixels lit are "+obj.cheapMarquee(text, width));
    }

}
