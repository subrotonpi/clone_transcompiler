public static void print ( String N ) {
  int i ;
  N = list ( input ) ;
  if ( set ( N , 0 , N . length ( ) - 1 ) == 1 || set ( N , 1 , N . length ( ) ) == 1 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
