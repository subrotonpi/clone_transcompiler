static final void solve ( int [ ] out , int [ ] customer , int [ ] meltfavor ) throws IOException {
  final Scanner scanner = new Scanner ( System . in ) ;
  scanner . useDelimiter ( "\\s+" ) ;
  scanner . next ( ) ;
  int N ;
  int [ ] indexlist ;
  int [ ] out ;
  int location ;
  int [ ] tmp ;
  int [ ] indexlist ;
  for ( int i = 0 ;
  i < customer . length ;
  i ++ ) {
    if ( customer [ i ] == new int [ ] {
    }
    ) {
      out [ meltfavor [ i ] - 1 ] = 1 ;
    }
  }
  /* solve the number of clusters */
  tmp = new int [ N ] ;
  out = new int [ N ] ;
  location = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    index = BigInteger . valueOf ( location + i ) . bitLength ( ) ;
    location = index ;
    out [ i ] = tmp [ index ] ;
    tmp [ index ] = tmp [ index ] ;
  }
  Arrays . sort ( out ) ;
  Arrays . sort ( indexlist ) ;
  output = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int ii = 0 ;
    ii < N ;
    ii ++ ) {
      if ( out [ ii ] == i ) {
        output [ N - i ] = ii + 1 ;
      }
    }
  }
  /* main the program */
  scanner . close ( ) ;
  scanner . close ( ) ;
  int nc = scanner . nextInt ( ) ;
  int count = 1 ;
  for ( int testCase = 0 ;
  testCase < nc ;
  testCase ++ ) {
    N = scanner . nextInt ( ) ;
    indexlist = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      indexlist [ i ] = scanner . nextInt ( ) ;
    }
    indexlist [ 0 ] = 0 ;
    out = scanner . solve ( N , indexlist ) ;
    System . out . println ( "Case #" + count + ":" + Arrays . toString ( out ) ) ;
    count ++ ;
  }
}
