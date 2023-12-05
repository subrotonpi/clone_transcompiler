public static int [ ] getN ( ) {
  int [ ] A = new int [ N + 1 ] ;
  Arrays . fill ( A , 0 ) ;
  int [ ] x = new int [ N + 1 ] ;
  x [ 0 ] = A [ 0 ] ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    x [ i ] = x [ i - 2 ] + Math . abs ( A [ i - 1 ] - A [ i - 2 ] ) ;
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int ans = 0 ;
    ans += x [ i - 1 ] + Math . abs ( A [ i - 1 ] - A [ i + 1 ] ) + x [ x . length - 1 ] - x [ i + 1 ] ;
    System . out . println ( ans ) ;
  }
  return x ;
}
