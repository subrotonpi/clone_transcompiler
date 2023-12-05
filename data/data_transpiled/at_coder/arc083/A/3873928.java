public static double A = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int E = Integer . parseInt ( input . nextLine ( ) ) ;
  int F = Integer . parseInt ( input . nextLine ( ) ) ;
  int maxSugar = 0 ;
  double maxWater = 100 * A ;
  double maxConc = 0.0 ;
  int A_limit = F / ( 100 * A ) ;
  for ( int i = 0 ;
  i < A_limit + 1 ;
  i ++ ) {
    int B_limit = ( F - 100 * A * i ) / ( 100 * B ) ;
    for ( int j = 0 ;
    j < B_limit + 1 ;
    j ++ ) {
      if ( i == B_limit && j == B_limit ) continue ;
      int sugarLimit = Math . min ( E , sugarLimit ) ;
    }
  }
  return maxSolar ;
}
