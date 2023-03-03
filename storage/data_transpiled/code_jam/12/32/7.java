public static final double getDoubleFromInput ( String input ) throws IOException {
  final BufferedReader input = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int T = Integer . parseInt ( input . readLine ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    System . out . println ( "Case #" + t + ":" ) ;
    String D = input . readLine ( ) ;
    int N = input . readInt ( ) ;
    int A = input . readInt ( ) ;
    double [ ] [ ] Ss = new double [ N ] [ ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      Ss [ i ] = new double [ N ] ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        Ss [ i ] [ j ] = Double . parseDouble ( input . readLine ( ) ) ;
      }
    }
    double [ ] As = new double [ A ] ;
    for ( int i = 0 ;
    i < As . length ;
    i ++ ) {
      As [ i ] = Double . parseDouble ( input . readLine ( ) ) ;
    }
    for ( int i = 0 ;
    i < A ;
    i ++ ) {
      double a = As [ i ] ;
      double [ ] ss = new double [ Ss . length ] ;
      ss [ 0 ] = 0 ;
      for ( int j = 0 ;
      j < Ss . length ;
      j ++ ) {
        double [ ] s = Ss [ j ] ;
        if ( s [ 1 ] < D ) {
          ss [ j ] = s [ 0 ] - ( 2 * s [ 1 ] / a ) * .5 ;
        }
        else if ( j > 0 && Ss [ j - 1 ] [ 1 ] < D ) {
          double t0 = Ss [ j - 1 ] [ 0 ] ;
          double t1 = s [ 0 ] ;
          double p0 = Ss [ j - 1 ] [ 1 ] ;
          double p1 = s [ 1 ] ;
          double v = ( p1 - p0 ) / ( t1 - t0 ) ;
          double tt = t0 + ( D - p0 ) / v ;
          ss [ j - 1 ] = tt - ( 2 * D / a ) * .5 ;
        }
      }
      double t = Math . max ( ss [ 0 ] , ( 2 * D / a ) * .5 ) ;
      System . out . println ( t ) ;
    }
  }
  return 0 ;
}
