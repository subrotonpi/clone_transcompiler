static int N ( int i , int A , int B ) {
  int [ ] h = new int [ N ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) h [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int hmax = Math . max ( h [ 0 ] , h [ 1 ] ) ;
  A = A - B ;
  {
    int [ ] hn = new int [ N ] ;
    for ( int a = 0 ;
    a < N ;
    a ++ ) hn [ a ] = h [ a ] - k * B ;
    int res = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) if ( hn [ j ] > 0 ) res += ( hn [ j ] - 1 + A ) / A ;
    return res <= k ? 1 : 0 ;
  }
  int left = 0 ;
  int right = hmax / B + 1 ;
  while ( true ) {
    if ( left == right ) break ;
    int half = ( left + right ) / 2 ;
    if ( right > 0 ) right = half ;
    else left = half + 1 ;
  }
  System . out . println ( left ) ;
  return left ;
}
