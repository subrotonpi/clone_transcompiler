public static void print ( String [ ] o ) {
  List < String > e = new LinkedList < String > ( ) ;
  e . add ( "" ) ;
  for ( int i = 0 ;
  i < o . length ;
  i ++ ) {
    System . out . print ( o [ i ] + e . get ( i ) ) ;
  }
}
