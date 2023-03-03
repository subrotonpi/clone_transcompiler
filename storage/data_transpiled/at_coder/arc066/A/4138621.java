@ Function public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > aList = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    aList . add ( i ) ;
  }
  List < Integer > co = aList . stream ( ) . map ( Integer :: valueOf ) . collect ( toList ( ) ) ;
  if ( ! co . size ( ) % 2 == 0 ) {
    System . out . println ( 0 ) ;
    quit ( ) ;
  }
}
