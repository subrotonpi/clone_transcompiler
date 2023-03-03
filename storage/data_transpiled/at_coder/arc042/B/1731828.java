@ VisibleForTesting static void main ( String [ ] args ) {
  final double INF = Double . MAX_VALUE ;
  final double d = Math . abs ( a * x0 + b * y0 + c ) / Math . sqrt ( a * a + b * b ) ;
  final int N = Integer . parseInt ( args [ 0 ] ) ;
  final int [ ] dotArray = new int [ N ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    final int x1 = Integer . parseInt ( args [ i ] ) ;
    final int y1 = Integer . parseInt ( args [ i ] ) ;
    dotArray [ i ] = new int [ ] {
      x1 , y1 }
      ;
    }
    Arrays . sort ( dotArray ) ;
    double ans = INF ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final int x1 = dotArray [ i ] ;
      final int y1 = dotArray [ i ] ;
      final double x2 = dotArray [ i + 1 ] ;
      final double a = y2 - y1 ;
      final double b = x2 - x1 ;
      final double c = - a * x1 + b * y1 ;
      final double dist1 = d ( x0 , y0 , a , - b , c ) ;
      final double dist2 = Math . sqrt ( ( x0 - x1 ) * ( x0 - x1 ) + ( y0 - y1 ) * ( y0 - y1 ) ) ;
      ans = Math . min ( ans , Math . min ( dist1 , dist2 ) ) ;
    }
    System . out . println ( ans + ":.7f" ) ;
  }
  