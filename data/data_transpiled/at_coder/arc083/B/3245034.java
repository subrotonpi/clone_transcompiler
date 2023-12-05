static final double [ ] [ ] getDists ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final double [ ] [ ] dist = new double [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      final String str = Integer . parseInt ( input . nextLine ( ) ) ;
      dist [ i ] [ j ] = Double . parseDouble ( str ) ;
    }
  }
  final double [ ] [ ] dist = new double [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dist [ i ] [ i ] = dist [ i ] [ j ] ;
  }
  double ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      final double min_ = Math . min ( dist [ i ] [ j ] , dist [ j ] ) ;
      if ( min_ < dist [ i ] [ j ] ) {
        ans = - 1 ;
        break ;
      }
      else if ( min_ > dist [ i ] [ j ] ) {
        ans += dist [ i ] [ j ] ;
      }
    }
  }
  return dist ;
}
