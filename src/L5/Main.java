package L5;

public class Main {
  public static void main(String[] args) {
    var doubleMyList = new MyList<Double>();
    doubleMyList.add(-99.0).add(-95.0).add(-97.0).add(31.0).add(0.0).add(-99.0);
    var stringMyList = new MyList<String>();
    stringMyList.add("A").add("B").add("C");
    var integerMyList = new MyList<Integer>();
    integerMyList.add(9).add(3).add(34).add(314).add(623);
    printListInfo(doubleMyList, "Double");
    printListInfo(stringMyList, "String");
    printListInfo(integerMyList, "Integer");

  }

  public static void printListInfo(MyList myList, String listType){
    System.out.printf("%s List: %s.\nList smallest el: %s, List largest el: %s\n\n", listType, myList, myList.smallest(), myList.largest());
  }

}
