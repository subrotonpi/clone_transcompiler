static final double [ ] [ ] getMonotoneChain ( ) {
  final String input = System . getProperty ( "input" ) ;
  @ SuppressWarnings ( "resource" ) final double [ ] [ ] V0 = new double [ 1 ] [ 2 ] ;
  final double [ ] V1 = new double [ 2 ] [ 2 ] ;
  {
    final double x0 = V0 [ 0 ] ;
    final double y0 = V1 [ 0 ] ;
    final double x1 = V1 [ 1 ] ;
    final double y1 = V1 [ 1 ] ;
    return x0 * x1 + y0 * y1 ;
  }
  {
    final double x0 = V0 [ 0 ] ;
    final double y0 = V0 [ 1 ] ;
    final double x1 = V1 [ 0 ] ;
    final double y1 = V1 [ 1 ] ;
    return x0 * y1 - x1 * y0 ;
  }
  {
    final double [ ] V0 = new double [ 2 ] ;
    final double [ ] V1 = new double [ 2 ] ;
    {
      final double x0 = P1 [ 0 ] - P0 [ 0 ] ;
      final double y0 = P1 [ 1 ] - P0 [ 1 ] ;
      final double x1 = P2 [ 0 ] - P0 [ 0 ] ;
      final double y1 = P2 [ 1 ] - P0 [ 1 ] ;
    }
    {
      final double [ ] V0 = new double [ 2 ] ;
      final double [ ] V1 = new double [ 2 ] ;
      return crossProduct ( V0 , V1 ) < 0 ? V0 : V1 ;
    }
  }
  {
    final double [ ] upper = new double [ 2 ] , lower = new double [ 2 ] ;
    final List < Double > P = new ArrayList < Double > ( ) ;
    for ( int i = 0 ;
    i < P . size ( ) ;
    i ++ ) {
      P . get ( i ) . doubleValue ( ) ;
    }
    for ( int i = P . size ( ) - 1 ;
    i >= 0 ;
    i -- ) {
      final double p = P . get ( i ) . doubleValue ( ) ;
      while ( i >= 0 && ( ! clockwise ( lower [ i ] - 2 , lower [ i ] , p ) ) ) {
        lower [ i ] -- ;
      }
      lower [ i ] = p ;
    }
    for ( int i = P . size ( ) - 1 ;
    i >= 0 ;
    i -- ) {
      final double p = P . get ( i ) . doubleValue ( ) ;
      while ( i >= 0 && ( ! clockwise ( upper [ i ] - 2 , upper [ i ] , p ) ) ) {
        upper [ i ] -- ;
      }
      upper [ i ] = p ;
    }
  }
  