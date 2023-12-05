static final String getBigIntegerString ( ) {
  final int inf = 10 * 20 ;
  final double gosa = 1.0 / 10 * 10 ;
  final int mod = 10 * 9 + 7 ;
  /* LI */
  final int [ ] [ ] array = new int [ 10 ] [ 10 ] ;
  /* LI_ */
  final int [ ] [ ] array = new int [ 10 ] [ 10 ] ;
  /* LF */
  final double [ ] [ ] array = new double [ 10 ] [ 10 ] ;
  /* LS */
  final double [ ] [ ] array = new double [ 10 ] [ 10 ] ;
  /* I */
  final int [ ] [ ] array = new double [ 10 ] [ 10 ] ;
  /* F */
  final double [ ] [ ] array = new double [ 10 ] [ 10 ] ;
  /* S */
  final Scanner input = new Scanner ( System . in ) ;
  /* main */
  final double x = input . nextDouble ( ) ;
  final double y = input . nextDouble ( ) ;
  final double g = input . nextDouble ( ) ;
  x /= g ;
  y /= g ;
  final int it = ( int ) ( x / y ) * 2 ;
  final double [ ] [ ] r = new double [ it ] [ 10 ] ;
  for ( int i = Math . max ( 1 , it - 10 ) ;
  i <= it + 10 ;
  i ++ ) {
    final int k = ( i + 1 ) * i / 2 ;
    if ( i % y != 0 ) continue ;
    final double t = k - ( i / y ) * x ;
    if ( 0 < t && t <= i ) r [ i ] [ 0 ] = t ;
  }
  if ( r . length > 0 ) return "\n" . join ( Arrays . copyOf ( r , i ) ) ;
  return "Impossible" ;
}
