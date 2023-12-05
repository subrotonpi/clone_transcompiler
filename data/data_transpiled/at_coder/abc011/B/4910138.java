public static String [ ] S ( ) {
  S = [ i for i in input . read ( ) ] ;
  S [ 0 ] = S [ 0 ] . toUpperCase ( ) ;
  return ( S [ 0 ] + "" . join ( S [ 1 : ] ) ) . toLowerCase ( ) ;
}
