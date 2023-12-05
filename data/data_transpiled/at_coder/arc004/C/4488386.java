public static int x = ( int i ) -> {
  int y = ( i + 1 ) / 2 ;
  int e = 0 , g = 2 * x / y ;
  for ( int i = g ;
  i <= g ;
  i ++ ) {
    if ( ( i * x ) % y == 0 && i > 0 ) {
      System . out . println ( i + " " + i * ( i + 1 ) / 2 - i * x / y ) ;
    }
    else {
      e ++ ;
    }
  }
}
