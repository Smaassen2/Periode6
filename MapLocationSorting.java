import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MapLocationSorting {

    public static ArrayList<String> arrayListReadfile() {
        ArrayList<String> map_locations_list = new ArrayList<>();
        try {
            File myObj = new File("src/Homo_sapiens.gene_info");
            Scanner myReader = new Scanner(myObj);
            myReader.nextLine();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] values = data.split("\t");
                map_locations_list.add(values[7]);


                //System.out.println(values[7] + "-----" + chromosome );
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return map_locations_list;
    }

    public static ArrayList<ArrayList<String>> arrayListSortingByNumber(ArrayList<String> map_locations_list) {
        ArrayList<ArrayList<String>> notSortedlist = new ArrayList<>();
        ArrayList<String> c1 = new ArrayList<>();
        ArrayList<String> c2 = new ArrayList<>();
        ArrayList<String> c3 = new ArrayList<>();
        ArrayList<String> c4 = new ArrayList<>();
        ArrayList<String> c5 = new ArrayList<>();
        ArrayList<String> c6 = new ArrayList<>();
        ArrayList<String> c7 = new ArrayList<>();
        ArrayList<String> c8 = new ArrayList<>();
        ArrayList<String> c9 = new ArrayList<>();
        ArrayList<String> c10 = new ArrayList<>();
        ArrayList<String> c11 = new ArrayList<>();
        ArrayList<String> c12 = new ArrayList<>();
        ArrayList<String> c13 = new ArrayList<>();
        ArrayList<String> c14 = new ArrayList<>();
        ArrayList<String> c15 = new ArrayList<>();
        ArrayList<String> c16 = new ArrayList<>();
        ArrayList<String> c17 = new ArrayList<>();
        ArrayList<String> c18 = new ArrayList<>();
        ArrayList<String> c19 = new ArrayList<>();
        ArrayList<String> c20 = new ArrayList<>();
        ArrayList<String> c21 = new ArrayList<>();
        ArrayList<String> c22 = new ArrayList<>();
        ArrayList<String> cX = new ArrayList<>();
        ArrayList<String> cY = new ArrayList<>();


        for (int i=0; i<map_locations_list.size();i++) {
            String[] map_location = map_locations_list.get(i).split("p|q");
            String chromosome = map_location[0];
            switch (chromosome) {
                case "1":
                    c1.add(map_locations_list.get(i));
                    break;
                case "2":
                    c2.add(map_locations_list.get(i));
                    break;
                case "3":
                    c3.add(map_locations_list.get(i));
                    break;
                case "4":
                    c4.add(map_locations_list.get(i));
                    break;
                case "5":
                    c5.add(map_locations_list.get(i));
                    break;
                case "6":
                    c6.add(map_locations_list.get(i));
                    break;
                case "7":
                    c7.add(map_locations_list.get(i));
                    break;
                case "8":
                    c8.add(map_locations_list.get(i));
                    break;
                case "9":
                    c9.add(map_locations_list.get(i));
                    break;
                case "10":
                    c10.add(map_locations_list.get(i));
                    break;
                case "11":
                    c11.add(map_locations_list.get(i));
                    break;
                case "12":
                    c12.add(map_locations_list.get(i));
                    break;
                case "13":
                    c13.add(map_locations_list.get(i));
                    break;
                case "14":
                    c14.add(map_locations_list.get(i));
                    break;
                case "15":
                    c15.add(map_locations_list.get(i));
                    break;
                case "16":
                    c16.add(map_locations_list.get(i));
                    break;
                case "17":
                    c17.add(map_locations_list.get(i));
                    break;
                case "18":
                    c18.add(map_locations_list.get(i));
                    break;
                case "19":
                    c19.add(map_locations_list.get(i));
                    break;
                case "20":
                    c20.add(map_locations_list.get(i));
                    break;
                case "21":
                    c21.add(map_locations_list.get(i));
                    break;
                case "22":
                    c22.add(map_locations_list.get(i));
                    break;
                case "X":
                    cX.add(map_locations_list.get(i));
                    break;
                case "Y":
                    cY.add(map_locations_list.get(i));
                    break;
            }
        }
        notSortedlist.add(c1);
        notSortedlist.add(c2);
        notSortedlist.add(c3);
        notSortedlist.add(c4);
        notSortedlist.add(c5);
        notSortedlist.add(c6);
        notSortedlist.add(c7);
        notSortedlist.add(c8);
        notSortedlist.add(c9);
        notSortedlist.add(c10);
        notSortedlist.add(c11);
        notSortedlist.add(c12);
        notSortedlist.add(c13);
        notSortedlist.add(c14);
        notSortedlist.add(c15);
        notSortedlist.add(c16);
        notSortedlist.add(c17);
        notSortedlist.add(c18);
        notSortedlist.add(c19);
        notSortedlist.add(c20);
        notSortedlist.add(c21);
        notSortedlist.add(c22);
        notSortedlist.add(cX);
        notSortedlist.add(cY);

        //System.out.println(sortedlist.get(21));
        return notSortedlist;
    }

    private static ArrayList<ArrayList<String>> arrayListSortingAllLists(ArrayList<ArrayList<String>> notSortedlist) {
        for (int z = 0; z < notSortedlist.size(); z++) {
            notSortedlist.get(z).sort(null);
        }
        return notSortedlist;
    }

    public static LinkedList<String> linkedListReadfile() {
        LinkedList<String> map_locations_list = new LinkedList<>();
        try {
            File myObj = new File("src/Homo_sapiens.gene_info");
            Scanner myReader = new Scanner(myObj);
            myReader.nextLine();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] values = data.split("\t");
                map_locations_list.add(values[7]);


                //System.out.println(values[7] + "-----" + chromosome );
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return map_locations_list;
    }

    public static LinkedList<LinkedList<String>> linkedListSortingByNumber(LinkedList<String> map_locations_list) {
        LinkedList<LinkedList<String>> notSortedlist = new LinkedList<>();
        LinkedList<String> c1 = new LinkedList<>();
        LinkedList<String> c2 = new LinkedList<>();
        LinkedList<String> c3 = new LinkedList<>();
        LinkedList<String> c4 = new LinkedList<>();
        LinkedList<String> c5 = new LinkedList<>();
        LinkedList<String> c6 = new LinkedList<>();
        LinkedList<String> c7 = new LinkedList<>();
        LinkedList<String> c8 = new LinkedList<>();
        LinkedList<String> c9 = new LinkedList<>();
        LinkedList<String> c10 = new LinkedList<>();
        LinkedList<String> c11 = new LinkedList<>();
        LinkedList<String> c12 = new LinkedList<>();
        LinkedList<String> c13 = new LinkedList<>();
        LinkedList<String> c14 = new LinkedList<>();
        LinkedList<String> c15 = new LinkedList<>();
        LinkedList<String> c16 = new LinkedList<>();
        LinkedList<String> c17 = new LinkedList<>();
        LinkedList<String> c18 = new LinkedList<>();
        LinkedList<String> c19 = new LinkedList<>();
        LinkedList<String> c20 = new LinkedList<>();
        LinkedList<String> c21 = new LinkedList<>();
        LinkedList<String> c22 = new LinkedList<>();
        LinkedList<String> cX = new LinkedList<>();
        LinkedList<String> cY = new LinkedList<>();


        for (int i=0; i<map_locations_list.size();i++) {
            String[] map_location = map_locations_list.get(i).split("p|q");
            String chromosome = map_location[0];
            switch (chromosome) {
                case "1":
                    c1.add(map_locations_list.get(i));
                    break;
                case "2":
                    c2.add(map_locations_list.get(i));
                    break;
                case "3":
                    c3.add(map_locations_list.get(i));
                    break;
                case "4":
                    c4.add(map_locations_list.get(i));
                    break;
                case "5":
                    c5.add(map_locations_list.get(i));
                    break;
                case "6":
                    c6.add(map_locations_list.get(i));
                    break;
                case "7":
                    c7.add(map_locations_list.get(i));
                    break;
                case "8":
                    c8.add(map_locations_list.get(i));
                    break;
                case "9":
                    c9.add(map_locations_list.get(i));
                    break;
                case "10":
                    c10.add(map_locations_list.get(i));
                    break;
                case "11":
                    c11.add(map_locations_list.get(i));
                    break;
                case "12":
                    c12.add(map_locations_list.get(i));
                    break;
                case "13":
                    c13.add(map_locations_list.get(i));
                    break;
                case "14":
                    c14.add(map_locations_list.get(i));
                    break;
                case "15":
                    c15.add(map_locations_list.get(i));
                    break;
                case "16":
                    c16.add(map_locations_list.get(i));
                    break;
                case "17":
                    c17.add(map_locations_list.get(i));
                    break;
                case "18":
                    c18.add(map_locations_list.get(i));
                    break;
                case "19":
                    c19.add(map_locations_list.get(i));
                    break;
                case "20":
                    c20.add(map_locations_list.get(i));
                    break;
                case "21":
                    c21.add(map_locations_list.get(i));
                    break;
                case "22":
                    c22.add(map_locations_list.get(i));
                    break;
                case "X":
                    cX.add(map_locations_list.get(i));
                    break;
                case "Y":
                    cY.add(map_locations_list.get(i));
                    break;
            }
        }
        notSortedlist.add(c1);
        notSortedlist.add(c2);
        notSortedlist.add(c3);
        notSortedlist.add(c4);
        notSortedlist.add(c5);
        notSortedlist.add(c6);
        notSortedlist.add(c7);
        notSortedlist.add(c8);
        notSortedlist.add(c9);
        notSortedlist.add(c10);
        notSortedlist.add(c11);
        notSortedlist.add(c12);
        notSortedlist.add(c13);
        notSortedlist.add(c14);
        notSortedlist.add(c15);
        notSortedlist.add(c16);
        notSortedlist.add(c17);
        notSortedlist.add(c18);
        notSortedlist.add(c19);
        notSortedlist.add(c20);
        notSortedlist.add(c21);
        notSortedlist.add(c22);
        notSortedlist.add(cX);
        notSortedlist.add(cY);

        //System.out.println(sortedlist.get(21));
        return notSortedlist;
    }

    private static LinkedList<LinkedList<String>> linkedListSortingAllLists(LinkedList<LinkedList<String>> notSortedlist) {
        for (int z = 0; z < notSortedlist.size(); z++) {
            notSortedlist.get(z).sort(null);
        }
        return notSortedlist;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter Arraylist or Linkedlist: ");
        String type = sc.nextLine();
        if (type.equals("Arraylist")) {
            long start = System.nanoTime();
            ArrayList<String> map_locations_list = arrayListReadfile();
            ArrayList<ArrayList<String>> notSortedlist = arrayListSortingByNumber(map_locations_list);
            ArrayList<ArrayList<String>> sortedlist = arrayListSortingAllLists(notSortedlist);
            System.out.println(sortedlist);
            long end = System.nanoTime();
            long timeInNano = end - start;
            double elapsedTimeInSecond = (double) timeInNano / 1_000_000_000;
            System.out.println("Elapsed Time in seconds: "+ elapsedTimeInSecond);
        }
        else if (type.equals("Linkedlist")){
            long start = System.nanoTime();
            LinkedList<String> map_locations_list = linkedListReadfile();
            LinkedList<LinkedList<String>> notSortedlist = linkedListSortingByNumber(map_locations_list);
            LinkedList<LinkedList<String>> sortedlist = linkedListSortingAllLists(notSortedlist);
            System.out.println(sortedlist);
            long end = System.nanoTime();
            long timeInNano = end - start;
            double elapsedTimeInSecond = (double) timeInNano / 1_000_000_000;
            System.out.println("Elapsed Time in seconds: "+ elapsedTimeInSecond);
        }
        else {
            System.out.println("Incorrect input");
        }
    }
}
