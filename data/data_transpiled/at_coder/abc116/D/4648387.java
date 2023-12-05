public static int [ ] readIntInRange ( Scanner input ) {
  int N = input . nextInt ( ) , K = input . nextInt ( ) ;
  int [ ] best = new int [ N ] ;
  int [ ] notBest = new int [ N ] ;
  for ( ;
  ;
  ) {
    int t = input . nextInt ( ) , d = input . nextInt ( ) ;
    if ( best [ t - 1 ] != 0 ) {
      notBest [ t ] = Math . min ( d , best [ t - 1 ] ) ;
    }
    best [ t - 1 ] = Math . max ( d , best [ t - 1 ] ) ;
  }
  Arrays . sort ( best , Collections . reverseOrder ( ) ) ;
  Arrays . sort ( notBest , Collections . reverseOrder ( ) ) ;
  int [ ] accBest = new int [ N + 1 ] ;
  int [ ] accNotBest = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < best . length ;
  i ++ ) {
    accBest [ i ] = 0 ;
    accNotBest [ i ] = 0 ;
  }
  return accBest ;
}
