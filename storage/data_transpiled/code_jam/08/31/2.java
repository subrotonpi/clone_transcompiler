static final Scanner getScanner ( Scanner input ) {
  final Scanner scanner = new Scanner ( input ) ;
  final int letOnKey = scanner . nextInt ( ) ;
  final int numKeys = scanner . nextInt ( ) ;
  final int numLet = scanner . nextInt ( ) ;
  scanner . nextLine ( ) ;
  final int [ ] line = scanner . nextLine ( ) . split ( "\\s+" ) ;
  final int [ ] freq = new int [ numLet ] ;
  for ( int x = 0 ;
  x < numKeys ;
  x ++ ) {
    freq [ x ] = Integer . parseInt ( line [ x ] ) ;
  }
  Arrays . sort ( freq ) ;
  int sum = 0 ;
  int letsUsed = 0 ;
  int keysUsed = 0 ;
  for ( int x : new ArrayList < > ( freq ) ) {
    if ( keysUsed == numKeys ) {
      keysUsed = 0 ;
      letsUsed ++ ;
    }
    sum += freq [ x ] * ( letsUsed + 1 ) ;
    keysUsed ++ ;
  }
  return new Scanner ( sum ) ;
}
