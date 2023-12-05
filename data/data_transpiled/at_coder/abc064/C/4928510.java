public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] s = Lists . newArrayList ( ) . stream ( ) . map ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] li = new int [ 9 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s [ i ] < 3200 ) {
      int b = s [ i ] / 400 ;
      li [ b ] ++ ;
    }
    else {
      li [ 8 ] ++ ;
    }
  }
  int ans = 0 ;
  for ( int j = 0 ;
  j < 8 ;
  j ++ ) {
    if ( li [ j ] != 0 ) ans ++ ;
  }
  int c = ans + li [ 8 ] ;
  if ( ans == 0 ) {
    System . out . println ( 1 + " " + c ) ;
  }
  else {
    System . out . println ( ans + " " + c ) ;
  }
}
