public static void input ( ) {
  int count = 1 ;
  char prev = "0" ;
  for ( char c : n ) {
    if ( prev == c ) {
      count ++ ;
      if ( count == 3 ) {
        System . out . println ( "Yes" ) ;
        exit ( ) ;
      }
    }
    else {
      count = 1 ;
    }
    prev = c ;
  }
  System . out . println ( "No" ) ;
}
