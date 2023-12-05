public static String [ ] l ( ) {
  l = [ int . parseInt ( i ) for i in input . split ( ) ] ;
  return l == null ? "YES" : ( l [ 0 ] + l [ 1 ] >= l [ 2 ] ) & ( l [ 0 ] <= l [ 2 ] ) ? "NO" : "NO" ;
}
