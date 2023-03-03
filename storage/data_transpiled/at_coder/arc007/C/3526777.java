public static int cSaving ( String C ) {
  int n = C . length ( ) ;
  char [ ] pattern = new char [ n ] ;
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    pattern [ k ] = ( 'x' + C + C ) . toCharArray ( ) ;
  }
  int ans = n ;
  for ( int bits = 1 ;
  bits < 1 << n ;
  bits ++ ) {
    char [ ] tmp = new char [ n ] ;
    StringBuffer string = new StringBuffer ( ) ;
    int tv_last = - 1 ;
    for ( int k = 0 ;
    k < n ;
    k ++ ) {
      if ( ( bits & ( 1 << k ) ) != 0 ) {
        tv_last = k ;
        tmp [ k ] = pattern [ k ] ;
      }
    }
    for ( int i = 0 ;
    i < tmp . length ;
    i ++ ) {
      if ( tmp [ i ] == 'o' ) {
        string . append ( 'o' ) ;
      }
      else {
        string . append ( 'x' ) ;
      }
    }
    if ( string . length ( ) > tv_last ) {
      ans = Math . min ( ans , tmp . length ) ;
    }
  }
  return ans ;
}
