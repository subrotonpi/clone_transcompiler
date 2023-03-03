public static void print ( int a , int b , int c , int d ) {
  if ( Math . abs ( c - a ) <= d || ( Math . abs ( b - a ) <= d && Math . abs ( c - b ) <= d ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
