static final long FK ( ) {
  long ans ;
  long [ ] [ ] table = new long [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    table [ i ] [ i ] = 0 ;
  }
  long num = Long . parseLong ( input ) ;
  System . out . println ( num - ans ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( ! visit [ i ] ) && table [ i ] [ i ] > 0 ) {
      long df = ford ( i , t , Math . min ( f , table [ i ] [ i ] ) ) ;
      if ( df > 0 ) {
        table [ i ] [ i ] -= df ;
        table [ i ] [ s ] += df ;
        return df ;
      }
    }
  }
  long df ;
  long ans = 0 ;
  long inf = 10 * 20 ;
  do {
    visit = new boolean [ n ] ;
    df = ford ( s , t , inf ) ;
    if ( df == 0 ) break ;
    ans += df ;
  }
  while ( true ) ;
  N = Long . parseLong ( input ) ;
  P = Arrays . asList ( input . split ( " " ) ) ;
  inf = 10 * 20 ;
  FK maxflow = new FK ( N + 2 ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( P [ i - 1 ] > 0 ) maxflow . add ( i , N + 1 , P [ i - 1 ] ) ;
    else maxflow . add ( 0 , i , - P [ i - 1 ] ) ;
    for ( int j = 2 * i ;
    j <= N ;
    j += i ) maxflow . add ( i , j , inf ) ;
  }
  ans = maxflow . flow ( 0 , N + 1 ) ;
  long num = Long . parseLong ( P ) ;
  System . out . println ( num - ans ) ;
  return ans ;
}
