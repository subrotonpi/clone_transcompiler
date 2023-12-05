public static int N = Integer . parseInt ( input ) {
  int [ ] P = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) P [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int MOD = 998244353 ;
  int ans = Math . pow ( 2 , N , MOD ) - 1 - N ;
  Set < Integer > u = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int xi = P [ i ] ;
    int yi = P [ i ] ;
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      int xj = P [ j ] ;
      int yj = P [ j ] ;
      if ( u . contains ( new Integer ( i ) ) ) continue ;
      int cnt = 0 ;
      Set < Integer > Q = new HashSet < > ( ) ;
      Q . add ( i ) ;
      Q . add ( j ) ;
      for ( int k = 0 ;
      k < N ;
      k ++ ) {
        int xk = P [ k ] ;
        int yk = P [ k ] ;
        if ( ( xj - xi ) * ( yk - yi ) == ( xk - xi ) * ( yj - yi ) ) {
          cnt ++ ;
          Q . add ( k ) ;
        }
      }
      for ( Integer p : Q ) for ( Integer q : Q ) u . add ( new Integer ( p ) ) ;
      ans -= Math . pow ( 2 , cnt , MOD ) - cnt - 1 ;
    }
  }
  System . out . println ( ans % MOD ) ;
  return ans ;
}
