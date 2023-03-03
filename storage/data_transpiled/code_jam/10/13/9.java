static final Scanner getScanner ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int t = scanner . nextInt ( ) ;
  /* lg */
  System . err . println ( scanner . nextLine ( ) ) ;
  /* GCD */
  if ( scanner . hasNext ( ) ) {
    scanner . nextLine ( ) ;
  }
  /* loser */
  int x = scanner . nextInt ( ) ;
  int y = scanner . nextInt ( ) ;
  if ( x < 0 ) x = - x ;
  if ( y < 0 ) y = - y ;
  if ( x + y > 0 ) {
    int g = y ;
    while ( x > 0 ) {
      g = x ;
      x = y % x ;
      y = g ;
    }
    return g ;
  }
  /* loser */
  int tau = ( sqrt ( 5 ) - 1 ) / 2 ;
  if ( a > b ) {
    a = b ;
    b = a ;
  }
  /* loser */
  int t = scanner . nextInt ( ) ;
  tau = ( sqrt ( 5 ) - 1 ) / 2 ;
  for ( int testNr = 1 ;
  testNr <= t ;
  testNr ++ ) {
    int sol = 0 ;
    final int a1 = scanner . nextInt ( ) ;
    final int a2 = scanner . nextInt ( ) ;
    final int b1 = scanner . nextInt ( ) ;
    final int b2 = scanner . nextInt ( ) ;
    for ( int b = b1 ;
    b <= b2 ;
    b ++ ) {
      int around1 = ( int ) ceil ( b * tau ) ;
      int around2 = ( int ) floor ( b / tau ) ;
      int got ;
      if ( around1 > a2 || around2 < a1 ) {
        got = a2 - a1 + 1 ;
      }
      else {
        if ( around1 < a1 ) {
          around1 = a1 ;
        }
        if ( around2 > a2 ) {
          around2 = a2 ;
        }
        got = ( a2 - a1 + 1 ) - ( around2 - around1 + 1 ) ;
      }
      sol += got ;
    }
    System . out . println ( "Case #" + testNr + ":" ) ;
    System . out . println ( sol ) ;
    scanner . nextLine ( ) ;
  }
  System . out . flush ( ) ;
  return scanner ;
}
