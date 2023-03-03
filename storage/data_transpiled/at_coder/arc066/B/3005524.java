private static int Dp ( int x , int hl , boolean islim ) {
  if ( x == digit . length ) return hl == 0 ;
  if ( f [ x ] [ hl ] [ islim ] ) return f [ x ] [ hl ] [ islim ] ;
  int ans = 0 ;
  int mx = islim ? Integer . parseInt ( digit [ x ] ) : 1 ;
  for ( int i = 0 ;
  i < mx + 1 ;
  i ++ ) {
    ans += Dp ( x + 1 , hl , islim && i == mx ) ;
    if ( hl != i ) ans += Dp ( x + 1 , ! hl , islim && i == mx ) ;
  }
  ans %= p ;
  f [ x ] [ hl ] [ islim ] = ans ;
  return ans ;
}
