public static void print ( String input , int a , int b , int c , int d ) {
  int takahashi = b / a ;
  int aoki = d / c ;
  if ( aoki > takahashi ) {
    System . out . println ( "AOKI" ) ;
  }
  else if ( aoki < takahashi ) {
    System . out . println ( "TAKAHASHI" ) ;
  }
  else {
    System . out . println ( "DRAW" ) ;
  }
}
