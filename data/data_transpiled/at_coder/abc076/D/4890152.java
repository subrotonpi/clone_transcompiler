public static double getN ( ) {
  int N = Integer . parseInt ( input ) ;
  int now = 0 ;
  double [ ] T = Lists . newArrayList ( ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    T [ i ] += T [ i - 1 ] ;
  }
  T = Arrays . copyOf ( T , N + 1 ) ;
  T = Arrays . copyOf ( T , N + 1 ) ;
  V = Lists . newArrayList ( ) ;
  V = Arrays . copyOf ( V , N + 1 ) ;
  double [ ] vt = new double [ T . length - 2 ] ;
  for ( int t = 0 ;
  t < vt . length ;
  t ++ ) {
    now = t ;
    for ( int k = 0 ;
    k < N + 2 ;
    k ++ ) {
      if ( now < T [ k ] ) {
        vt [ t ] = Math . min ( vt [ t ] , V [ k ] + T [ k ] - now ) ;
      }
      else if ( T [ k ] <= now && now <= T [ k + 1 ] ) {
        vt [ t ] = Math . min ( vt [ t ] , V [ k ] ) ;
      }
      else if ( T [ k + 1 ] < now ) {
        vt [ t ] = Math . min ( vt [ t ] , V [ k ] + now - T [ k + 1 ] ) ;
      }
    }
  }
  double ans = 0 ;
  for ( int i = 0 ;
  i < vt . length - 1 ;
  i ++ ) {
    if ( Math . abs ( vt [ i + 1 ] - vt [ i ] ) == 1 ) {
      ans += 0.5 * ( vt [ i ] + vt [ i + 1 ] ) ;
    }
    else if ( vt [ i + 1 ] == vt [ i ] ) {
      double vv ;
      for ( int k = 0 ;
      k < N + 2 ;
      k ++ ) {
        if ( T [ k ] <= i && i + 1 <= T [ k + 1 ] ) {
          vv = V [ k ] ;
          break ;
        }
      }
      if ( vv > vt [ i ] ) {
        ans += 0.5 * ( vt [ i ] * 2 + 0.5 ) ;
      }
      else {
        ans += vt [ i ] ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
