static final double getMin ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int E = Integer . parseInt ( input . nextLine ( ) ) ;
  double min = Double . MAX_VALUE ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    double tmp1 = H + ( B + E ) * i - E * N ;
    double j = Math . ceil ( - 1 * tmp1 / ( D + E ) ) ;
    if ( j < 0 ) j = 0 ;
    if ( tmp1 + ( D + E ) * j == 0 ) j ++ ;
    double tmp2 = A * i + C * j ;
    if ( tmp2 < min ) min = tmp2 ;
    if ( j == 0 ) break ;
  }
  System . out . println ( min ) ;
}
