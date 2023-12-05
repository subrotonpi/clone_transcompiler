static final int tnum = Integer . parseInt ( scanner . nextLine ( ) ) {
  int tnum = scanner . nextInt ( ) ;
  for ( int tcou = 0 ;
  tcou < tnum ;
  tcou ++ ) {
    int a , b , c , k ;
    a = scanner . nextInt ( ) ;
    b = scanner . nextInt ( ) ;
    c = scanner . nextInt ( ) ;
    if ( k > c ) k = c ;
    System . out . println ( "Case #" + ( tcou + 1 ) + ": " + a * b * k ) ;
    for ( int i = 0 ;
    i < a ;
    i ++ ) {
      int ia = scanner . nextInt ( ) ;
      int ib = scanner . nextInt ( ) ;
      int ic = scanner . nextInt ( ) ;
      if ( ( ia + ib + ic ) % c < k ) {
        System . out . println ( ia + 1 + ", " + ib + 1 + ", " + ic + 1 ) ;
      }
    }
  }
  return tnum ;
}
