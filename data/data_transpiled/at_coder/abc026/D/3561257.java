static final double getMath ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  double MIN = ( 100 - B ) / A ;
  double MAX = ( 100 + B ) / A ;
  while ( true ) {
    double t = ( MIN + MAX ) / 2 ;
    double ANS = A * t + B * Math . sin ( C * t * Math . PI ) ;
    if ( Math . abs ( 100 - ANS ) < 10 * ( - 6 ) ) break ;
    else if ( ANS > 100 ) MAX = t ;
    else MIN = t ;
  }
  System . out . println ( t ) ;
}
