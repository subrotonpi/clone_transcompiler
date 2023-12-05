public static double A = Integer . parseInt ( input ) {
  double A = Integer . parseInt ( input . nextLine ( ) ) ;
  double B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A > B ) {
    A = B ;
    B = A ;
  }
  final double r = ( A * A + B * B ) * 0.5 ;
  final double alpha = Math . atan ( A / B ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double C = Integer . parseInt ( input . nextLine ( ) ) ;
    double D = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( C > D ) {
      C = D ;
      D = C ;
    }
    if ( C >= A && D >= B ) {
      System . out . println ( "YES" ) ;
    }
    else if ( C < A && D < B || r < D ) {
      System . out . println ( "NO" ) ;
    }
    else if ( C >= r * Math . cos ( Math . sin ( D / r ) - 2 * alpha ) ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
  }
  return A * B * r ;
}
