import com.sun.xml.internal.ws.util.StringUtils;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import java.io.*;
/**
 * Created by Surendar on 9/18/2015.
 */
public class ctci {
    static Scanner in;
    //class for main function

    static void chap1() {

        //question 1.1
        //ArrayAndString.isUnique();

        //question 1.2
        //ArrayAndString.isPermutation();

        //question 1.3
        //ArrayAndString.changeString();

        //question 1.4
        //ArrayAndString.palindromePermutation();

        //question 1.5
        //ArrayAndString.oneWay();

        //question 1.6
        //ArrayAndString.stringCompression();

        //question 1.8
        // ArrayAndString.zeroMatrix();

        //question 1.9
        // ArrayAndString.isSubString();


        // LinkedLists.gen();

    }

//    static void chap2() {
////        Set<Integer> mySet = new HashSet<Integer>();
////        mySet.add(1);
////        mySet.add(2);
////        mySet.add(3);
////        for (Set<Integer> s : LinkedLists.powerSet(mySet)) {
////            System.out.println(s);
////        }
//
//        ArrayList<String> list = LinkedLists.getPerms("abc");
//        System.out.println("There are " + list.size() + " permutations.");
//        for (String s : list) {
//            System.out.println(s);
//        }
//
//        System.out.println("");
//        Set<String> set = new TreeSet<String>();
//        LinkedLists.permutation("", "abc", set);
//        for (String s : set) {
//            System.out.println(s);
//        }
//    }

    static void printit() {
        String str = "chillout";

        int len = str.length();
        double sqrt = ((Math.sqrt(len)));

        int row = sqrt - (double) (int) sqrt > 0.5 ? ((int) sqrt) + 1 : (int) sqrt;
        //int column = (int) Mathceil((double) len / sqrt);

        int column = 0;
        char[][] map = new char[row][column];

        int i, j;

        int n = 0;
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {

                if (n < len)
                    map[i][j] = str.charAt(n++);

            }
        }

        for (i = 0; i < column; i++) {
            for (j = 0; j < row; j++) {

                System.out.print(map[j][i]);
            }
            System.out.print(" ");
        }

    }


    static void xorCompare() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = 99;
        }

        arr[7] = 14;

        System.out.println(xorCompare(arr));
    }

    static int xorCompare(int arr[]) {
        int match = 0;
        int offset = 1;
        int ones = 0, twos = 0;
        for (int i = 0; i < arr.length; i++) {
            ones = (ones ^ arr[i]) & ~twos;
            twos = (twos ^ arr[i]) & ~ones;
        }


        return ones;
    }


    public static void arrayGG() {
        //printit();
        // ArrayGG.spiralPrint();
        // ArrayGG.countIsland();
        //ArrayGG.matCommon();
        // ArrayGG. maxSum();
        //ArrayGG.findPartiion();
        //ArrayGG.minCost();
        // ArrayGG.maxCost();
        // ArrayGG.maXContinuesSum();
        // ArrayGG.findMin();
        //ArrayGG.rearrange();

        // ArrayGG.findWater();

        // ArrayGG.printTwoOdd();
        //  ArrayGG.printNGE();
        //ArrayGG.subArray();
        // ArrayGG.sortAccording();


        // ArrayGG.stockBuySell();
        // ArrayGG.unionNIntersection();
        // ArrayGG.printKMax();
        // ArrayGG.checkDuplicatesWithinK();
        //ArrayGG.merArrays();
        //ArrayGG.get2NonRepeatingNos();
        // ArrayGG.pyList();
        //ArrayGG.count();
        // ArrayGG.countPossibilities();
        //ArrayGG.modifyMatrix();
        //ArrayGG.pivotedBinarySearch();
        //ArrayGG.majority();
        //ArrayGG.printNLE();
        //  ArrayGG.pairInSortedRotated();
    }

    public static void TreeGG() {
      //  TreeGG t = new TreeGG();
        //t.mirror();
        // t.leftView();
        // t.rightView();
     //   t.printTopView();
        ///t.printSpiral();
        //t.findLCA();
        // t.diameter();
        // t.printBoundary();
        //t.isPairPresent();
        //t.toSumTree();
        //t.isBST();
        //t.findDistance();
        //t.findHeight();
        //t.shortestBranch();
        // t.serDe();
        //t.printKDistant();
        // t.isSumProperty();
        //t.merge();
        //t.checkUtil();
        // t.printLevelOrder();
        //t.isBalanced();
        // t.isSubtree();

    }


    public static void readMail() {
        Properties props = new Properties();
        props.setProperty("mail.store.protocol", "imaps");
        try {
            Session session = Session.getInstance(props, null);
            Store store = session.getStore();
            store.connect("imap.gmail.com", "elasticcandyy@gmail.com", "master97");
            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);
            Message msg = inbox.getMessage(inbox.getMessageCount());
            Address[] in = msg.getFrom();
            for (Address address : in) {
                System.out.println("FROM:" + address.toString());
            }
            Multipart mp = (Multipart) msg.getContent();
            BodyPart bp = mp.getBodyPart(0);
            System.out.println("SENT DATE:" + msg.getSentDate());
            System.out.println("SUBJECT:" + msg.getSubject());
            System.out.println("CONTENT:" + bp.getContent());


            for (int i = 0; i < mp.getCount(); i++) {
                BodyPart bodyPart = mp.getBodyPart(i);
                if(!Part.ATTACHMENT.equalsIgnoreCase(bodyPart.getDisposition()) &&
                        (bodyPart==null) ) {
                    continue; // dealing with attachments only
                }
                if(bodyPart.getFileName()!=null) {
                    InputStream is = bodyPart.getInputStream();
                    File f = new File("C:/att/123.jpg"  );
                    FileOutputStream fos = new FileOutputStream(f);
                    byte[] buf = new byte[4096];
                    int bytesRead;
                    while ((bytesRead = is.read(buf)) != -1) {
                        fos.write(buf, 0, bytesRead);
                    }
                    fos.close();
                }
            }
        } catch (Exception mex) {
            mex.printStackTrace();
        }
    }




    public static void main(String[] args) {
        //arrayGG();
        //TreeGG();
     // System.out.print( DynamicProg.strrev("surendar"));
       // DynamicProg.per1();

        readMail();
       /* String host = "pop3.gmail.com";
        String port = "995";
        String userName = "elasticcandyy@gmail.com";
        String password = "master97";
        String saveDirectory = "C:/att";
        EmailAttachmentReceiver receiver = new EmailAttachmentReceiver();
        receiver.setSaveDirectory(saveDirectory);
        receiver.downloadEmailAttachments(host, port, userName, password);
        */
        //readMs();
    }




}
