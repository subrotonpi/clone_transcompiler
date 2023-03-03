public static String reader ( final InputFile inFile ) {
  final int N = inFile . getInt ( ) ;
  return inFile . getInts ( ) . stream ( ) . map ( i -> new String [ ] {
    inFile . getInts ( ) }
    ) . collect ( Collectors . joining ( ) ) ;
  }
  