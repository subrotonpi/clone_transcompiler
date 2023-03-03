public static int g ( int c , int w ) {
  if ( c == w ) return w ;
  if ( c <= 2 * w - 1 ) return w + 1 ;
  return 1 + g ( c - w , w ) ;
}
