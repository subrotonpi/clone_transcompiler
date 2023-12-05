public static List < Integer > convert ( String input ) {
  List < Integer > l = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    l . add ( i ) ;
  }
  int out = l . get ( 0 ) - l . get ( 1 ) ;
  if ( out > 10 * 18 ) {
    System . out . println ( "Unfair" ) ;
  }
  else if ( l . get ( 3 ) % 2 == 0 ) {
    System . out . println ( out ) ;
  }
  else {
    System . out . println ( out * ( - 1 ) ) ;
  }
  return l ;
}
