public static String [ ] l ( ) {
  l = new String [ 4 ] ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) l [ i ] = Integer . parseInt ( input ) ;
  return l [ 0 ] + "Yes" + ( ( Math . abs ( l [ 0 ] - l [ 1 ] ) <= l [ 3 ] ) & ( Math . abs ( l [ 1 ] - l [ 2 ] ) <= l [ 3 ] ) ) ? "Yes" : "No" ;
}
