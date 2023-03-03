static final Scanner getScanner ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int T = scanner . nextInt ( ) ;
  final int [ ] inputInts = map ( scanner . nextLine ( ) . split ( " " ) ) ;
  final int R = scanner . nextInt ( ) ;
  final int C = scanner . nextInt ( ) ;
  final int W = scanner . nextInt ( ) ;
  if ( W == 1 ) {
    return R * C ;
  }
  final int res = R * ( C / W ) ;
  if ( C % W == 0 ) {
    return res + W - 1 ;
  }
  else {
    return res + W ;
  }
  final int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int testId = 0 ;
  testId < T ;
  testId ++ ) {
    final int R = inputInts [ testId ] ;
    final int C = inputInts [ testId ] ;
    final int W = inputInts [ testId ] ;
    System . out . println ( "Case #" + ( testId + 1 ) + ": " + solve ( R , C , W ) ) ;
  }
  return scanner ;
}
