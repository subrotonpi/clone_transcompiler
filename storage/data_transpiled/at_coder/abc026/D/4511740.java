public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  final int C = Integer . parseInt ( input . nextLine ( ) ) ;
  final double f = ( double ) t ;
  int suplim = 10000 ;
  int inflim = 0 ;
  /* bisection */
  int mid = ( sup + inf ) / 2 ;
  if ( f > 100 ) sup = mid ;
  else inf = mid ;
  /* bisection */
  while ( Math . abs ( f ( ( suplim + inflim ) / 2 ) - 100 ) > 10 * ( - 10 ) ) {
    suplim = suplim ;
    inflim = inflim ;
  }
  System . out . println ( suplim ) ;
  return suplim ;
}
