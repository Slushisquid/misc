import java.util.HashMap;
import java.util.Map;

class Main {
  public static void main(String[] args) {
    //YELLOW FRUITS!
    String [] flavors = {"Banana", "Lemon", "Pineapple", "Banana", "Lemon", "Mango", "Mango", "Lemon", "Durian", "Quince", "Papaya", "Banana", "Lemon", "Pineapple", "Corn", "Salmon Berry", "Golden Raspberry"};

    HashMap<String, Integer> fruitz = new HashMap<>();
    
    for (String flavor: flavors) {
      if (fruitz.containsKey(flavor)) {
        fruitz.put(flavor, fruitz.get(flavor) + 1);
      } else {
        fruitz.put(flavor, 1);
      }
    }
    for (Map.Entry<String, Integer> entry : fruitz.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}

  //thank you bestie Katie :)))))))))))))