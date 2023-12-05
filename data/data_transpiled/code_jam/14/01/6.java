@ VisibleForTesting static final Scanner getScanner ( int n ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int [ ] nums = new int [ n ] ;
  int tot = 0 ;
  while ( tot < n ) {
    final List < Long > next = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < ( scanner . nextInt ( ) ) ;
    i ++ ) {
      next . add ( Long . parseLong ( scanner . nextLine ( ) ) ) ;
    }
    tot += next . size ( ) ;
    nums [ tot ] = next . toArray ( new Long [ 0 ] ) ;
  }
  final int getInt = scanner . nextInt ( ) ;
  final Scanner scanner = new Scanner ( System . in ) ;
  final int nt = scanner . nextInt ( ) ;
  for ( int testIdx = 1 ;
  testIdx <= nt ;
  testIdx ++ ) {
    final int rowa = scanner . nextInt ( ) ;
    final int [ ] [ ] arows = new int [ 4 ] [ 4 ] ;
    for ( int idx = 0 ;
    idx <= 4 ;
    idx ++ ) {
      arows [ idx ] = scanner . nextInt ( ) ;
    }
    final int rowb = scanner . nextInt ( ) ;
    final int [ ] [ ] brows = new int [ 4 ] [ 4 ] ;
    for ( int idx = 0 ;
    idx <= 4 ;
    idx ++ ) {
      brows [ idx ] = scanner . nextInt ( ) ;
    }
    final List < Integer > left = StreamEx . of ( ( g ) -> {
      if ( arows [ rowa - 1 ] [ g ] == g ) {
        left . add ( 0 ) ;
      }
    }
    ) . toList ( ) ;
    final String result ;
    if ( left . size ( ) == 0 ) {
      result = "Volunteer cheated!" ;
    }
    else if ( left . size ( ) == 1 ) {
      result = left . get ( 0 ) ;
    }
    else {
      result = "Bad Magician!" ;
    }
    System . out . printf ( "Case #%d: %s%n" , testIdx , result . toString ( ) ) ;
  }
  return scanner ;
}
