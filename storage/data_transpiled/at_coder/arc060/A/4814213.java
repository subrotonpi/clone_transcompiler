public static int [ ] [ ] getDistance ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int x = Integer . parseInt ( input ) ;
  int [ ] [ ] k = new int [ 3000 ] [ 60 ] ;
  for ( int i = 0 ;
  i < 3000 ;
  i ++ ) {
    k [ 0 ] [ i ] = 0 ;
  }
  k [ 0 ] [ x + 1500 ] ++ ;
  k [ 0 ] [ 1500 ] ++ ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < 3000 ;
    j ++ ) {
      if ( 3000 > j - x [ i ] >= 0 ) {
        k [ i ] [ j ] = k [ i - 1 ] [ j - x [ i ] ] + k [ i - 1 ] [ j ] ;
      }
      else {
        k [ i ] [ j ] = k [ i - 1 ] [ j ] ;
      }
    }
  }
  System . out . println ( k [ n - 1 ] [ 1500 ] - 1 ) ;
}
