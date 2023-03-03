public static double [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] x = new double [ N ] ;
  double [ ] y = new double [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double x1 = Integer . parseInt ( input . nextLine ( ) ) ;
    double y1 = Integer . parseInt ( input . nextLine ( ) ) ;
    x [ i ] = x1 ;
    y [ i ] = y1 ;
  }
  double ans = 0.0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( ans < ( ( x [ i ] - x [ j ] ) * ( x [ i ] - x [ j ] ) + ( y [ i ] - y [ j ] ) * ( y [ i ] - y [ j ] ) * 0.5 ) ) {
        ans = ( ( x [ i ] - x [ j ] ) * ( x [ i ] - x [ j ] ) + ( y [ i ] - y [ j ] ) * ( y [ j ] - y [ j ] ) * ( y [ i ] - y [ j ] ) * ( y [ j ] - y [ j ] ) ) ;
      }
    }
  }
  System . out . println ( ans ) ;
  return x ;
}
