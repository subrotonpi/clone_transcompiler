public static List < Integer > convert ( String input ) {
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    a . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  if ( a . get ( 1 ) / a . get ( 0 ) >= a . get ( 2 ) ) {
    System . out . println ( a . get ( 2 ) ) ;
  }
  else {
    System . out . println ( a . get ( 1 ) / a . get ( 0 ) ) ;
  }
  return a ;
}
