public static void print ( String input ) {
  N = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input ) ) ;
  }
  for ( int y : Ordering . natural ( ) . reverse ( ) . sortedCopy ( A ) ) {
    System . out . println ( y ) ;
  }
}
