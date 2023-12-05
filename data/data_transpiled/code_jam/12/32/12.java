static double findTcar ( double D , int N , double [ ] tx ) {
  for ( int i : xrange ( N ) ) {
    double t2 = tx [ i ] ;
    double x2 = tx [ i ] ;
    if ( x2 >= D ) {
      if ( i == 0 ) return 0.0 ;
      double t1 = tx [ i - 1 ] ;
      double x1 = tx [ i ] ;
      return t1 + ( D - x1 ) * ( t2 - t1 ) / ( x2 - x1 ) ;
    }
  }
  /* overlaps the output */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double t = tx [ i ] ;
    double x = tx [ i ] ;
    if ( x < ( a / 2 * ( ( Math . max ( 0.0 , t - t0 ) ) * ( Math . max ( 0.0 , t - t0 ) ) ) ) ) {
      if ( x < D ) t0 = t - ( 2 * x / a ) * 0.5 ;
    }
  }
  /* loop through the input */
  Scanner in = new Scanner ( System . in ) ;
  String line = in . next ( ) ;
  int T = Integer . parseInt ( line ) ;
  for ( int i = 0 ;
  i < xrange ( T ) ;
  i ++ ) {
    line = in . next ( ) ;
    String [ ] inputs = line . split ( "\\s+" ) ;
    double D = Double . parseDouble ( inputs [ 0 ] ) ;
    int N = Integer . parseInt ( inputs [ 1 ] ) ;
    int A = Integer . parseInt ( inputs [ 2 ] ) ;
    tx = new double [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      line = in . next ( ) ;
      inputs = line . split ( "\\s+" ) ;
      tx [ j ] = new double [ ] {
        Double . parseDouble ( inputs [ 0 ] ) , Double . parseDouble ( inputs [ 1 ] ) }
        ;
      }
      double [ ] acc = new double [ A ] ;
      line = in . next ( ) ;
      inputs = line . split ( "\\s+" ) ;
      for ( int j = 0 ;
      j < A ;
      j ++ ) {
        acc [ j ] = Double . parseDouble ( inputs [ j ] ) ;
      }
      System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
      for ( double a : acc ) {
        double tcar = findTcar ( D , N , tx ) ;
        double t0 =