public static void dele ( int N , String input ) {
  String [ ] [ ] x = new String [ N ] [ 9 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x [ i ] = new String [ 9 ] ;
  }
  x [ N ] = ".........." ;
  /* dele(i, k, x[i]) */
  if ( x [ i ] [ k ] . equals ( "o" ) ) {
    x [ i ] [ k ] = "." ;
    dele ( i + 1 , k , x ) ;
  }
  else {
    /* dele(i, k, x) */
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int k = 0 ;
    k < 9 ;
    k ++ ) {
      switch ( x [ i ] [ k ] ) {
        case "x" : ans ++ ;
        break ;
        case "o" : dele ( i + 1 , k , x ) ;
        ans ++ ;
        break ;
      }
    }
  }
  System . out . println ( ans ) ;
}
