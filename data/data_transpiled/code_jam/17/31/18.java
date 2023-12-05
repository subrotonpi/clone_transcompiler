static double solve ( ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int k = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Pair < Integer , Integer >> rh = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final int r = Integer . parseInt ( input . nextLine ( ) ) ;
    final int h = Integer . parseInt ( input . nextLine ( ) ) ;
    rh . add ( new Pair < > ( r * h , r , h ) ) ;
  }
  final int len = rh . size ( ) ;
  double res = 0 ;
  double mx = 0 ;
  final Pair < Integer , Integer > mirh = rh . get ( k - 1 ) . second . third ;
  double marh = rh . get ( 0 ) . second . third ;
  for ( int s = 0 ;
  s < len ;
  s ++ ) {
    final int r = s * s ;
    final int h = mirh . second . third ;
    res += 2 * Math . PI * r * h ;
    mx = Math . max ( mx , r ) ;
    if ( ( r = marh ) > 0 ) {
      marh = r ;
    }
  }
  double res1 = res + Math . PI * mx * mx ;
  final double mis = 2 * Math . PI * mirh . first * mirh . second ;
  for ( int s = 0 ;
  s < len ;
  s ++ ) {
    final int r = s * s ;
    final int h = s * s ;
    if ( ( r = marh ) > 0 ) {
      res1 = Math . max ( res1 , res + Math . PI * r * r + 2 * Math . PI * r * h - mis ) ;
    }
  }
  return res1 ;
}
