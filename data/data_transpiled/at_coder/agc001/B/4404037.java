static final double INF = Double . POSITIVE_INFINITY ;
final double MOD = 10 * * 9 + 7 ;
{
  int n = INF ;
  int x = INF ;
  int [ ] LI_ = new int [ n ] ;
  int [ ] LF = new int [ n ] ;
  int [ ] LS = new int [ n ] ;
  int i = 0 ;
  for ( ;
  i < n ;
  i ++ ) {
    LI_ [ i ] = Integer . parseInt ( LI_ [ i ] ) ;
  }
  {
    int n = MOD ;
    x = MOD ;
  }
  {
    int n = INF ;
    x = MOD ;
  }
  {
    int b = INF ;
    int a = 0 ;
    int ans = a + b ;
    while ( b != 0 ) {
      int q = a % b ;
      boolean mod = MOD < q ;
      ans += ( 2 * q - ( ! mod ) ) * b ;
      a = b ;
      b = mod ;
    }
    return ans ;
  }
}
