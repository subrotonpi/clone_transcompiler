public static void print ( String input , int a , int b , int c , int d ) {
  if ( c * b == a * d ) {
    System . out . println ( "DRAW" ) ;
  }
  else if ( c * b > a * d ) {
    System . out . println ( "TAKAHASHI" ) ;
  }
  else {
    System . out . println ( "AOKI" ) ;
  }
}
