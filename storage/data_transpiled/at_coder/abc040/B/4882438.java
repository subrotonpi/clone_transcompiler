public static double getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  double res = Double . POSITIVE_INFINITY ;
  for ( int i = 0 ;
  i < 500 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 500 ;
    j ++ ) {
      if ( i * j > N ) continue ;
      double score = Math . abs ( i - j ) + ( N - ( i * j ) ) ;
      res = Math . min ( res , score ) ;
    }
  }
  System . out . println ( res ) ;
  return res ;
}
