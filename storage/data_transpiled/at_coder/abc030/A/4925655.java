public static void print ( String input , int a , int b , int c , int d ) {
  if ( b / a == d / c ) {
    System . out . println ( "DRAW" ) ;
  }
  else if ( b / a > d / c ) {
    System . out . println ( "TAKAHASHI" ) ;
  }
  else if ( b / a < d / c ) {
    System . out . println ( "AOKI" ) ;
  }
}
