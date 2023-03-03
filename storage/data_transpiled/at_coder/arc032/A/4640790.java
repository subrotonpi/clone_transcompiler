public static int n ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  n = ( int ) ( n * ( n + 1 ) / 2 ) ;
  if ( n == 1 ) {
    System . out . println ( "BOWWOW" ) ;
    exit ( ) ;
  }
  return n ;
}
