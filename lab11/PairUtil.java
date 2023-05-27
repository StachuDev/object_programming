package lab11;

class PairUtil<T>{
    // For static generic methods, the type parameter section must appear
    // before the method's return type.
    static <T> Pair<T> swap (Pair<T> pair)  //
    {
        Pair<T> newPair = new Pair<T>(pair.getSecond(),pair.getFirst());
        return newPair;
    }

    private T first;
    private T second;
}
