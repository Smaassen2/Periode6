import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;

public class MapLocationSorting {

    public static ArrayList<String> Readfile() {
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

    public static ArrayList<ArrayList<String>> SortingByNumber(ArrayList<String> map_locations_list) {
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

    private static ArrayList<ArrayList<String>> SortingAllLists(ArrayList<ArrayList<String>> notSortedlist) {
        for (int z = 0; z < notSortedlist.size(); z++) {
            notSortedlist.get(z).sort(null);
        }
        return notSortedlist;
    }

    public static void main(String[] args) {
        ArrayList<String> map_locations_list = Readfile();
        ArrayList<ArrayList<String>> notSortedlist = SortingByNumber(map_locations_list);
        //System.out.println(notSortedlist);
        ArrayList<ArrayList<String>> sortedlist = SortingAllLists(notSortedlist);
        System.out.println(sortedlist);
    }


}
