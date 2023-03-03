static final String getDoubleLine ( ) {
  final String [ ] lines = new String [ ] {
    l . trim ( ) }
    ;
    final int T = Integer . parseInt ( lines [ 0 ] ) ;
    int i = 1 ;
    for ( int t = 0 ;
    t < T ;
    t ++ ) {
      final int N = Integer . parseInt ( lines [ i ] ) ;
      final int K = Integer . parseInt ( lines [ i ] ) ;
      i ++ ;
      final double U = Double . parseDouble ( lines [ i ] ) ;
      i ++ ;
      final double [ ] P = new double [ K ] ;
      for ( int j = 0 ;
      j < K ;
      j ++ ) {
        P [ j ] = Double . parseDouble ( lines [ i ] ) ;
      }
      i ++ ;
      Arrays . sort ( P ) ;
      int j = 0 ;
      while ( j < N && U > 0.000000000001 ) {
        while ( j < N - 1 && P [ j ] == P [ j + 1 ] ) {
          j ++ ;
        }
        final double target = j < N - 1 ? P [ j + 1 ] : 1 ;
        final double required = ( target - P [ j ] ) * ( j + 1 ) ;
        if ( required <= U ) {
          U -= required ;
          Arrays . fill ( P , new double [ ] {
            target }
            ) ;
          }
          else {
            target = P [ j ] + U / ( j + 1 ) ;
            U = 0 ;
            Arrays . fill ( P , new double [ ] {
              target }
              ) ;
            }
          }
          System . out . println ( "Case #" + ( t + 1 ) + ": " + Double . toString ( P , 1.0 ) ) ;
        }
        return "" ;
      }
      