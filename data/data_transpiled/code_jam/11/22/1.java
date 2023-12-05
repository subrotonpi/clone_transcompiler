static String foo ( Scanner iScanner ) {
  final int C = iScanner . nextInt ( ) ;
  final int D = iScanner . nextInt ( ) ;
  int [ ] [ ] a = new int [ C ] [ D ] ;
  for ( int i = 0 ;
  i < C ;
  i ++ ) {
    int P = iScanner . nextInt ( ) ;
    int V = iScanner . nextInt ( ) ;
    a [ i ] = new int [ P ] [ V ] ;
  }
  int n = a . length ;
  int [ ] [ ] b = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int count = 0 ;
    for ( int j = i ;
    j >= 0 ;
    j -- ) {
      count += a [ j ] [ 1 ] ;
      b [ i ] [ 1 ] = Math . max ( b [ i ] [ 1 ] , a [ j ] [ 0 ] + count * D ) ;
    }
    count = 0 ;
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      count += a [ j ] [ 1 ] ;
      b [ i ] [ 0 ] = Math . min ( b [ i ] [ 0 ] , a [ j ] [ 0 ] + count * D ) ;
    }
  }
  return String . format ( "%.1f" , Math . max ( b [ i ] [ 1 ] - b [ i ] [ 0 ] + D * a [ i ] [ 1 ] - D ) / 2.0 ) ;
}
