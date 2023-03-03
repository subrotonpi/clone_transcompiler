public static int X ( ) {
  int X = Integer . parseInt ( input ( ) ) ;
  return ( [ t for ( int t = 0 ;
  t < 10 * * 5 ;
  t ++ ) if ( t * ( t + 1 ) / 2 < X ) [ X - 1 ] + 1 ] ) ;
}
