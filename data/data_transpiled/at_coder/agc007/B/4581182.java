public static long [ ] readLongArray ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > pList = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    pList . add ( i ) ;
  }
  long [ ] aArray = new long [ N + 1 ] ;
  long [ ] bArray = new long [ N ] ;
  return aArray ;
}
