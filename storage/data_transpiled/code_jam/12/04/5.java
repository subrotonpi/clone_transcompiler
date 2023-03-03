static private boolean gcd ( int a , int b ) throws Exception {
  if ( a > b ) return gcd ( b , a ) ;
  if ( a == 0 ) return b ;
  return gcd ( b % a , a ) ;
  int t = Integer . parseInt ( readLine ( ) ) ;
  for ( int _t = 0 ;
  _t < t ;
  ++ _t ) {
    int w = Integer . parseInt ( readLine ( ) ) ;
    int d = Integer . parseInt ( readLine ( ) ) ;
    char [ ] [ ] mirrors = new char [ w ] [ h ] ;
    for ( int i = 0 ;
    i < h ;
    ++ i ) {
      char [ ] l = readLine ( ) . toCharArray ( ) ;
      char [ ] m = new char [ w ] ;
      Arrays . fill ( m , '#' ) ;
      for ( int j = 0 ;
      j < d ;
      ++ j ) {
        if ( gcd ( abs ( dx ) , abs ( dy ) ) > 1 ) continue ;
        if ( dx * dx + dy * dy > d ) continue ;
        if ( dx == 0 && dy == 0 ) continue ;
        if ( doesHit ( mirrors , start_x , start_y , dx , dy , d ) ) ++ num ;
      }
    }
    -- start ;
    int dx = 0 ;
    int dy = 0 ;
    for ( int j = 0 ;
    j < d ;
    ++ j ) {
      if ( gcd ( abs ( dx ) , abs ( dy ) ) > 1 ) continue ;
      if ( dx * dx + dy * dy > d ) continue ;
      if ( dx == 0 && dy == 0 ) continue ;
      if ( dx == 0 && dy == 0 ) continue ;
      if ( dx == 0 && dy == 0 ) return true ;
      boolean mx = ( x % k ) == 0 ;
      boolean my = ( y % k ) == 0 ;
      if ( mx && ! my ) {
        int kx = x / k ;
        int ky = y / k ;
        assert dx < 0 ;
        if ( dx < 0 ) kx -- ;
        if ( mirrors [ ky ] [ kx ] ) dx *= - 1 ;
      }
      else if ( my && ! mx ) {
        int kx = x / k ;
        int ky = y / k ;
        if ( dy < 0 ) ky -- ;
        if ( mirrors [ ky ] [ kx ] ) dy *= - 1 ;
      }
      else if ( dy == 0 ) return false ;
    }
  }
  if ( __name__ == "__main__" ) {
    BufferedReader br = new BufferedReader ( new