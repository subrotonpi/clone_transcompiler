public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < Integer , Integer > F = new HashMap < > ( ) ;
  int X = 2 ;
  int Y = K ;
  while ( X * X <= Y ) {
    if ( Y % X == 0 ) {
      int cnt = 0 ;
      while ( Y % X == 0 ) {
        Y /= X ;
        cnt ++ ;
      }
      F . put ( X , cnt ) ;
    }
    X ++ ;
  }
  if ( Y > 1 ) {
    F . put ( Y , 1 ) ;
  }
  List < Entry < Integer , Integer >> * P = new ArrayList < > ( F . entrySet ( ) ) ;
  List < Entry < Integer , Integer > * E = new ArrayList < > ( F . values ( ) ) ;
  int L = P . size ( ) ;
  @ SuppressWarnings ( "unchecked" ) int [ ] e = ( int [ ] ) F . values ( ) . toArray ( ) ;
  int N0 = N / e ;
  int res = N0 * ( N0 + 1 ) / 2 ;
  for ( int l = 1 ;
  l <= e . length ;
  l ++ ) {
    for ( Entry < Integer , Integer > P : new ArrayList < > ( E ) ) {
      int u = 1 ;
      for ( int p : P . entries ( ) ) u *= p ;
      int c = N0 / u ;
      if ( l % 2 != 0 ) res -= u * c * ( c + 1 ) / 2 ;
      else res += u * c * ( c + 1 ) / 2 ;
    }
    res %= MOD ;
  }
  res *= K ;
  return res % MOD ;
}
