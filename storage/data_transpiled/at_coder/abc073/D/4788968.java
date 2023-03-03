static int [ ] [ ] floydWarshall ( int [ ] [ ] A ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = input . nextInt ( ) ;
  final int M = input . nextInt ( ) ;
  final int R = input . nextInt ( ) ;
  final List < Integer > r = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    r . add ( i ) ;
  }
  final double INF = Double . POSITIVE_INFINITY ;
  final double [ ] [ ] A = new double [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] [ 0 ] = INF ;
    A [ i ] [ 1 ] = INF ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int a = input . nextInt ( ) ;
    final int b = input . nextInt ( ) ;
    final double c = input . nextDouble ( ) ;
    A [ a - 1 ] [ b - 1 ] = c ;
    A [ b - 1 ] [ a - 1 ] = c ;
  }
  final double [ ] [ ] G = floydWarshall ( new double [ N ] [ M ] ) ;
  double ans = INF ;
  for ( int [ ] root : r ) {
    double cur = 0 ;
    for ( int i = 0 ;
    i < R - 1 ;
    i ++ ) {
      final int s = root [ i ] - 1 , g = root [ i + 1 ] - 1 ;
      cur += G [ s ] [ g ] ;
    }
    ans = Math . min ( ans , cur ) ;
  }
  return ( int [ ] [ ] ) ans ;
}
