static final Scanner getScanner ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int T = scanner . nextInt ( ) ;
  scanner . nextLine ( ) ;
  final int C = scanner . nextInt ( ) ;
  final int D = scanner . nextInt ( ) ;
  final int V = scanner . nextInt ( ) ;
  final int [ ] coins = new int [ T ] ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    coins [ i ] = scanner . nextInt ( ) ;
  }
  final int [ ] solve = new int [ T ] ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    while ( D > 0 && coins [ D - 1 ] > V ) {
      coins [ D -- ] = scanner . nextInt ( ) ;
    }
  }
  final int T = scanner . nextInt ( ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    final int C = scanner . nextInt ( ) ;
    final int D = scanner . nextInt ( ) ;
    final int V = scanner . nextInt ( ) ;
    final int [ ] coins = new int [ T ] ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      coins [ i ] = scanner . nextInt ( ) ;
    }
    System . out . println ( "Case #" + ( i + 1 ) + ": " + solve [ i ] ) ;
  }
  return scanner ;
}
