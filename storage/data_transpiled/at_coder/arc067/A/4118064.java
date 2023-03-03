@ MoreRequires public static List < Integer > primesList ( int N ) {
  List < Integer > l = new ArrayList < > ( ) ;
  for ( int v = 2 ;
  v <= N ;
  v ++ ) {
    l . add ( v ) ;
  }
  List < Integer > ret = new ArrayList < > ( ) ;
  while ( l . size ( ) > 0 ) {
    int cur = l . remove ( 0 ) ;
    l = new LinkedList < > ( ) ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      l . add ( i % cur != 0 ) ;
    }
    ret . add ( cur ) ;
  }
  int mod = 10 * 9 + 7 ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  l = new int [ N + 1 ] ;
  List < Integer > primes = primesList ( N ) ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    for ( int p : primes ) {
      if ( p > i ) break ;
      int tmp = 0 ;
      while ( i % p == 0 ) {
        i /= p ;
        tmp ++ ;
      }
      l [ p ] += tmp ;
    }
  }
  int ans = 1 ;
  for ( int i : l ) {
    if ( i == 0 ) continue ;
    else ans = ans * ( i + 1 ) % mod ;
  }
  System . out . println ( ans ) ;
  return ret ;
}
