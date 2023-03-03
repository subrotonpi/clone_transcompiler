public static int input ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] fact = new int [ N + 1 ] ;
  int [ ] rfact = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    fact [ i ] = r = ( i * fact [ i - 1 ] ) % M ;
    rfact [ i ] = Math . pow ( r , M - 2 , M ) ;
  }
  HashMap < Integer , Integer > memo = new HashMap < Integer , Integer > ( ) ;
  {
    int i ;
    int r ;
    if ( ( i = memo . indexOf ( input , i ) ) >= 0 ) return memo . get ( i ) ;
    if ( i == 0 ) return N == 0 ;
    else if ( i == 1 || i == N ) return 1 ;
    r = memo . put ( i , ( r * fact [ i - 1 ] ) + K * fact [ i - 1 ] ) % M ;
  }
  int [ ] S = new int [ N + 1 ] ;
  int rev2 = Math . pow ( 2 , M - 2 , M ) ;
  int base = Math . pow ( 2 , N , M ) ;
  int ans = 0 ;
  S = new int [ K + 1 ] ;
  for ( int K = 0 ;
  K < N + 1 ;
  K ++ ) {
    int r = ( fact [ N ] * rfact [ K ] * rfact [ N - K ] ) % M ;
    r = ( r * Math . pow ( 2 , Math . pow ( 2 , N - K , M - 1 ) , M ) ) % M ;
    int b = 1 ;
    int v = 0 ;
    int [ ] T = new int [ K + 2 ] ;
    for ( int L = 0 ;
    L < K ;
    L ++ ) {
      T [ L + 1 ] = s = ( S [ L ] + ( L + 1 ) * S [ L + 1 ] ) % M ;
      v += s * b ;
      b = ( b * base ) % M ;
    }
    v += b ;
    T [ K + 1 ] = 1 ;
    S = T ;
    r = ( r * v ) % M ;
    if ( K % 2 != 0 ) ans -= r ;
    else ans += r ;
    ans %= M ;
    base = ( base * rev2 ) % M ;
  }
  System . out . println ( ans ) ;
  return ans ;
  