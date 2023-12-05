static final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
{
  int n = gondola . length ( ) ;
  if ( gondola . indexOf ( "." ) == 0 ) {
    return 0 ;
  }
  if ( memo . containsKey ( gondola ) ) {
    return memo . get ( gondola ) ;
  }
  char [ ] g2 = gondola . toCharArray ( ) ;
  double ans = 0.0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( gondola [ i ] == '.' ) {
      ans += n + pay ( gondola , 0 , i ) + "X" + gondola [ i + 1 ] ;
    }
    else {
      int j = i ;
      int wait = 0 ;
      while ( g2 [ j ] == 'X' ) {
        wait ++ ;
        j ++ ;
      }
      j %= n ;
      ans += ( n - wait ) + pay ( gondola , 0 , j ) + "X" + gondola [ j + 1 ] ;
    }
  }
  memo . put ( gondola , ans / n ) ;
  return memo . get ( gondola ) ;
}
