public static void print ( int N ) {
  int [ ] S = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) S [ i ] = input ( ) ;
  Arrays . sort ( S , new Comparator ( ) {
    public int compare ( Object o1 , Object o2 ) {
      return o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  print ( ( Object ) S , sep + "\n" ) ;
}
