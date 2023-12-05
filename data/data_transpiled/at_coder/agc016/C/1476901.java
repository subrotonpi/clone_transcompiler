public static void print ( int H , int W , int h , int w ) {
  if ( H % h == 0 && W % w == 0 ) {
    System . out . println ( "No" ) ;
  }
  else {
    System . out . println ( "Yes" ) ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      System . out . println ( StringUtils . repeat ( i % h == 0 || j % w == 0 ? "-1000" : String . valueOf ( 1000 * ( h * w - 1 ) - 1 ) , W ) ) ;
    }
  }
}
