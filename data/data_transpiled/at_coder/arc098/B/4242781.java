static final double INF = Double . MAX_VALUE ;
final double MOD = 10 * * 9 + 7 ;
{
  int [ ] LI = new int [ MOD ] ;
  int [ ] LI_ = new int [ MOD ] ;
  int [ ] LS = new int [ MOD ] ;
  int [ ] II = new int [ MOD ] ;
  int [ ] SI = new int [ MOD ] ;
  int n = II [ MOD ] ;
  int [ ] A = LI ;
  double ans = 0 ;
  int right = 0 ;
  double num_xor = 0 ;
  double num_and = 0 ;
  for ( int left = 0 ;
  left < n ;
  left ++ ) {
    while ( right < n && num_xor ^ A [ right ] == num_and + A [ right ] ) {
      num_xor ^= A [ right ] ;
      num_and += A [ right ] ;
      right ++ ;
    }
    ans += right - left ;
    if ( left == right ) {
      right ++ ;
    }
    else {
      num_xor ^= A [ left ] ;
      num_and -= A [ left ] ;
    }
  }
  System . out . println ( ans ) ;
}
