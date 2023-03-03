public static String rt ( InputStream in ) throws IOException {
  String ws = " \t\n" ;
  int c ;
  StringBuilder l = new StringBuilder ( ) ;
  while ( ( c = in . read ( ) ) != - 1 ) {
    if ( ! ws . contains ( c ) ) break ;
    l . append ( ( char ) c ) ;
  }
  return l . toString ( ) ;
  /* ri */
  int ri = ( int ) rt ( in ) ;
  /* rf */
  double rf = ( double ) rt ( in ) ;
  /* compute */
  double d = ( double ) ( rt ( in ) ) ;
  /* compute */
  double t = ( rt ( in ) ) ;
  /* compute */
  double a = ( rt ( in ) ) ;
  /* compute */
  double d = ( rt ( in ) ) ;
  /* compute */
  double t = ( rt ( in ) ) ;
  for ( int testcase = 1 ;
  testcase <= t ;
  testcase ++ ) {
    int D = rf ( in ) ;
    int N = ri ( in ) ;
    int A = ri ( in ) ;
    if ( N == 1 ) {
      t0 = rf ( in ) ;
      int x0 = rf ( in ) ;
      System . out . println ( "Case #" + testcase + ":" ) ;
      for ( ;
      ;
      ) {
        System . out . println ( compute2 ( D , rf ( in ) ) ) ;
      }
    }
    else {
      t0 = rf ( in ) ;
      int x0 = rf ( in ) ;
      int t1 = rf ( in ) ;
      int x1 = rf ( in ) ;
      double s = D - x0 ;
      double v = ( x1 - x0 ) / t1 ;
      double td = s / v ;
      System . out . println ( "Case #" + testcase + ":" ) ;
      for ( ;
      ;
      ) {
        System . out . println ( compute ( D , td , rf ( in ) ) ) ;
      }
    }
  }
}
