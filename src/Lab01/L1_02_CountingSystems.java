/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab01;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda
 */
public class L1_02_CountingSystems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        convertCounting();

    }

    /**
     * @return number in different format
     */
    public static void convertCounting() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please!, enter counting number: ");
        System.out.print("From: ");
        int from = input.nextInt();

        System.out.print("To: ");
        int to = input.nextInt();

        System.out.print("Please!, Enter number: ");
        String numb = input.next();

        int num = 0;

        // switch case from
        switch (from) {
            case 16:
                try {
                    num = Integer.parseInt(numb, 16);
                    break;
                } catch (Exception e) {
                    System.out.println("Error");
                    break;
                }
            case 8:
                try {
                    num = Integer.parseInt(numb, 8);
                    break;
                } catch (Exception e) {
                    System.out.println("Error");
                    break;
                }
            case 10:
                try {
                    num = Integer.parseInt(numb, 10);
                    break;
                } catch (Exception e) {
                    System.out.println("Error");
                    break;
                }
            case 2:
                try {
                    num = Integer.parseInt(numb, 2);
                    break;
                } catch (Exception e) {
                    System.out.println("Error");
                    break;
                }
            default:
                System.out.println("Error");
                break;
        }

        System.out.print("The result is: ");

        if (to == 16) {
            System.out.println(Integer.toHexString(num));
        } else if (to == 8) {
            System.out.println(Integer.toOctalString(num));
        } else if (to == 2) {
            System.out.println(Integer.toBinaryString(num));
        } else {
            System.out.println(num);
        }

    }
}