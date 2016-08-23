public interface Edible {
  // we're now saying everything that implements Edible must have a swim method. This is an interface, not a class. You don't create methods in here you just list methods that any class which wants to implement this interface must have (and they must return whatever it says - ie their swim needs to return a String but that string can say anything).
  String swim();
  int nutritionValue();
}