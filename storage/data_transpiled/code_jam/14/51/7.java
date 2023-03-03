static int cases = Integer . parseInt ( readLine ( ) ) {
  int cases = 0 ;
  int s = s , t = d . length - 1 ;
  while ( s != t ) {
    int v = ( s + t + 1 ) >>> 1 ;
    if ( d [ v ] <= m ) s = v ;
    else t = v - 1 ;
  }
  for ( int case = 1 ;
  case <= cases ;
  case ++ ) {
    int n = Integer . parseInt ( readLine ( ) ) ;
    int p = Integer . parseInt ( readLine ( ) ) ;
    int q = Integer . parseInt ( readLine ( ) ) ;
    int r = Integer . parseInt ( readLine ( ) ) ;
    int s = Integer . parseInt ( readLine ( ) ) ;
    int [ ] num = new int [ n ] ;
    int [ ] snm = new int [ n ] ;
    snm [ n ] = 0 ;
    for ( int i : xrange ( n ) ) {
      num [ i ] = ( i * p + q ) % r + s ;
      snm [ n ] = snm [ n - 1 ] + num [ i - 1 ] ;
    }
    int s = 0 , t = snm [ n ] ;
    while ( s != t ) {
      int m = ( s + t ) >>> 1 ;
      int i = getpt ( snm , 0 , m ) ;
      int j = getpt ( snm , i , m + j ) ;
      int k = getpt ( snm , i , m + j ) ;
      l -= j ;
      if ( snm [ n ] - l - j <= m ) t = m ;
      else s = m + 1 ;
    }
    float res = ( snm [ n ] - s ) / ( float ) snm [ n ] ;
    System . out . println ( "Case #" + case + ": " + res + " " + res ) ;
  }
  return cases ;
}
