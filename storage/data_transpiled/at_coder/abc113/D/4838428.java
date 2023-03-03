public static long way ( int h , int w , int k ) {
  if ( w == 1 ) return 1 ;
  if ( Arrays . equals ( h , k ) == [ 1 , 1 ] || Arrays . equals ( h , k ) == [ 1 , 2 ] ) return fibo [ w - k ] ;
  if ( h == 1 ) return 0 ;
  if ( memo [ h ] [ k ] != - 1 ) return memo [ h ] [ k ] ;
  long re = way ( h - 1 , w , k ) * fibo [ k - 1 ] * fibo [ w - k ] ;
  if ( k != 1 ) re += way ( h - 1 , w , k - 1 ) * fibo [ Math . max ( k - 2 , 0 ) ] * fibo [ w - k ] ;
  if ( k != w ) re += way ( h - 1 , w , k + 1 ) * fibo [ k - 1 ] * fibo [ Math . max ( w - k - 1 , 0 ) ] ;
  memo [ h ] [ k ] = re ;
  return re ;
}
