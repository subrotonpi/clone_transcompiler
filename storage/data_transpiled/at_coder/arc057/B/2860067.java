static final Scanner getScanner ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  if ( scanner . hasNext ( ) ) {
    final int n = scanner . nextInt ( ) ;
    final int k = scanner . nextInt ( ) ;
    final int [ ] games = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      games [ i ] = scanner . nextInt ( ) ;
    }
    if ( Arrays . equals ( games , k ) ) {
      System . out . println ( 1 ) ;
      System . exit ( 0 ) ;
    }
    final int [ ] dp = new int [ n + 1 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      dp [ i ] = 2000 * 500000 * 2 ;
      dp [ i ] = 0 ;
      dp [ i + 1 ] = 1 ;
      int cnt = games [ i ] ;
      for ( int i = 1 ;
      i < n ;
      i ++ ) {
        for ( int i2 = i + 1 ;
        i2 > 0 ;
        i2 -- ) {
          if ( dp [ i2 ] >= 2000 * 500000 * 2 - 1 ) {
            continue ;
          }
          else {
            dp [ i2 + 1 ] = Math . min ( dp [ i2 + 1 ] , dp [ i2 ] + ( dp [ i2 ] * games [ i ] ) / cnt + 1 ) ;
          }
        }
        cnt += games [ i ] ;
      }
    }
    System . out . println ( Collections . max ( Arrays . asList ( dp ) , k ) ) ;
  }
  else {
    System . out . println ( 1 ) ;
    System . exit ( 0 ) ;
  }
  return scanner ;
}
