public static void input ( Scanner in ) {
  int n = in . nextInt ( ) ;
  int [ ] a = new int [ n ] ;
  int MOD = 998244353 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = in . nextInt ( ) - in . nextInt ( ) ;
  }
  int ans , m ;
  int check ;
  if ( max ( a ) == min ( a ) ) {
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  else if ( n == 3 ) {
    /* solver */
    int x = m / 100 ;
    int y = ( m % 100 ) / 10 ;
    int z = m % 10 ;
    if ( x != y ) {
      int c = ( 3 - x - y ) % 3 ;
      int temp = c * 110 + z ;
      if ( ! ans . contains ( temp ) ) {
        ans . add ( temp ) ;
        solver ( temp ) ;
      }
    }
    if ( y != z ) {
      int c = ( 3 - y - z ) % 3 ;
      int temp = x * 100 + c * 11 ;
      if ( ! ans . contains ( temp ) ) {
        ans . add ( temp ) ;
        solver ( temp ) ;
      }
    }
    int t = a [ 0 ] * 100 + a [ 1 ] * 10 + a [ 2 ] ;
    ans = new HashSet < Integer > ( ) ;
    ans . add ( t ) ;
    solver ( t ) ;
    System . out . println ( ans . size ( ) ) ;
    exit ( ) ;
  }
  else if ( n == 2 ) {
    System . out . println ( 2 ) ;
    exit ( ) ;
  }
  dp = new int [ 3 ] [ ] ;
  dp [ 0 ] [ 0 ] = 1 ;
  dp [ 1 ] [ 1 ] = 1 ;
  dp [ 2 ] [ 2 ] = 1 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    dp [ i ] [ 0 ] = ( dp [ i ] [ 0 ] + dp [ i ] [ 2 ] ) % MOD ;
    dp [ i ] [ 1 ] = ( dp [ i ] [ 1 ] + dp [ i ] [ 2 ] ) % MOD ;
    dp [ i ] [ 2 ] = ( dp [ i ] [ 2 ] + dp [ i ] [ 2 ] ) % MOD ;
    dp [ i ] [ 2 ] = ( dp [ i ] [ 0 ] + dp [ i ] [ 0 ] ) % MOD ;
  }
}
