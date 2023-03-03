@ VisibleForTesting static String input ( ) {
  List < Integer > S = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    S . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  DateTime today = new DateTime ( S . get ( 0 ) , S . get ( 1 ) , S . get ( 2 ) ) ;
  if ( today . isAfter ( new DateTime ( 2019 , 4 , 30 ) ) ) {
    System . out . println ( "Heisei" ) ;
  }
  else {
    System . out . println ( "TBD" ) ;
  }
  return "" ;
}
