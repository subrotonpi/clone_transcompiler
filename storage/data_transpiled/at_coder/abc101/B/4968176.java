public static void print ( String N ) {
  N = String . valueOf ( input . nextLine ( ) ) ;
  int num = 0 ;
  for ( int i = 0 ;
  i < N . length ( ) ;
  i ++ ) {
    num += Integer . parseInt ( N . substring ( i , i + 1 ) ) ;
  }
  if ( Integer . parseInt ( N ) % num == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
