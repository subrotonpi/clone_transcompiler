static int n = ( int i ) -> {
  int m = ( i + 1 ) / n ;
  int [ ] [ ] x = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int [ ] b = input . nextInt ( ) , c = new int [ n ] ;
    for ( int j = 0 ;
    j < b . length ;
    j ++ ) c [ j ] = Integer . parseInt ( input . next ( ) ) ;
    x [ i ] = c ;
  }
  int [ ] [ ] ans = new int [ m ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      if ( x [ i ] [ j ] == 0 ) continue ;
      ans [ i + 1 ] [ j ] = x [ i ] [ j ] ;
      for ( int k = i + 1 , k2 = j - 1 ;
      k < m ;
      k ++ , k2 ++ ) x [ k ] [ k2 ] -= x [ i ] [ j ] ;
    }
  }
  for ( int i = 0 ;
  i < ans . length ;
  i ++ ) {
    String s = "" ;
    for ( int j = 0 ;
    j < ans [ i ] . length ;
    j ++ ) s += ans [ i ] [ j ] ;
    System . out . println ( s ) ;
  }
  return ans [ i ] [ n ] ;
}
