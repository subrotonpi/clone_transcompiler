public static void print ( String input , int a , int b , int c , int d ) {
  int ta = b / a ;
  int ao = d / c ;
  if ( ta > ao ) {
    System . out . println ( "TAKAHASHI" ) ;
  }
  else if ( ao > ta ) {
    System . out . println ( "AOKI" ) ;
  }
  else {
    System . out . println ( "DRAW" ) ;
  }
}
