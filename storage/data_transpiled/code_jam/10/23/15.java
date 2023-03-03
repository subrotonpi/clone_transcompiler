@ Sys public static PrintStream out ( ) {
  int [ ] [ ] nCk = new int [ 501 ] [ 501 ] ;
  for ( int n = 0 ;
  n <= 501 ;
  n ++ ) {
    nCk [ n ] [ 0 ] = 1 ;
    for ( int k = 1 ;
    k <= n ;
    k ++ ) {
      nCk [ n ] [ k ] = nCk [ n ] [ k - 1 ] * ( n + 1 - k ) / k ;
    }
  }
  for ( int n = 0 ;
  n <= 501 ;
  n ++ ) {
    for ( int k = 1 ;
    k <= n ;
    k ++ ) {
      nCk [ n ] [ k ] %= 100003 ;
    }
  }
  int [ ] [ ] Y = new int [ 501 ] [ 501 ] ;
  int [ ] y = new int [ 501 ] ;
  for ( int i = 0 ;
  i < Y . length ;
  i ++ ) {
    Y [ i ] [ 1 ] = 1 ;
    y [ i ] = 1 ;
    for ( int j = 2 ;
    j < i ;
    j ++ ) {
      for ( int k = 1 ;
      k <= j ;
      k ++ ) {
        Y [ i ] [ j ] += Y [ j ] [ k ] * nCk [ i - j - 1 ] [ j - k - 1 ] ;
      }
      y [ i ] += Y [ i ] [ j ] ;
    }
    y [ i ] %= 100003 ;
  }
  for ( int x = 1 ;
  x <= Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  x ++ ) {
    int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    out . printf ( "Case #%i: %i%n\n" , x , y [ n ] ) ;
  }
  return out ;
}
