@ StdIn public static String main ( String [ ] args ) {
  int p = Integer . parseInt ( StdIn . readLine ( ) ) ;
  int [ ] m = ArrayUtil . fromCharArray ( StdIn . readLine ( ) ) ;
  Arrays . sort ( m ) ;
  int [ ] c = new int [ p ] ;
  for ( int i : xrange ( p ) ) c [ i ] = ArrayUtil . fromCharArray ( StdIn . readLine ( ) ) ;
  Arrays . sort ( c ) ;
  int n = 2 * p ;
  Object [ ] [ ] v = new Object [ 2 * n - 1 ] [ ] ;
  for ( int i : xrange ( n - 1 , 2 * n - 1 ) ) v [ i ] = ( new int [ m [ i - n + 1 ] + 1 ] ) ;
  for ( int i : xrange ( n - 2 , - 1 , - 1 ) ) {
    int [ ] vl = v [ 2 * i + 1 ] ;
    int [ ] vr = v [ 2 * i + 2 ] ;
    int [ ] vv = new int [ Math . min ( vl . length , vr . length ) ] ;
    for ( int j = 0 ;
    j < vv . length ;
    j ++ ) vv [ j ] = vl [ j ] + vr [ j ] + c [ i ] ;
    for ( int j = 0 ;
    j < vv . length - 1 ;
    j ++ ) vv [ j ] = Math . min ( vl [ j + 1 ] + vr [ j + 1 ] , vv [ j ] ) ;
    v [ i ] = vv ;
  }
  return String . valueOf ( v [ 0 ] [ 0 ] ) ;
}
