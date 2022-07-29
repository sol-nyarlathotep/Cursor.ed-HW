package L5;

public class Main {
  public static void main(String[] args) {
    var doubleMyList = new MyList<Double>();
    doubleMyList.add(99.0).add(33.0).add(331.0);
    var stringMyList = new MyList<String>();
    stringMyList.add("A").add("B").add("C");
    var integerMyList = new MyList<Integer>();
    integerMyList.add(9).add(3).add(34).add(314).add(623);
    printListInfo(doubleMyList, "Double");
    printListInfo(stringMyList, "String");
    printListInfo(integerMyList, "Integer");
    System.out.println("Problem 3.\n------------------------");
    var stringExtremumFinder = new ExtremumFinder<String>(new String[]{"A", "B", "C"});
    System.out.println(stringExtremumFinder);
  }

  public static void printListInfo(MyList myList, String listType){
    System.out.printf("%s List: %s.\nList smallest el: %s, List largest el: %s\n\n", listType, myList, myList.smallest(), myList.largest());
  }

}
