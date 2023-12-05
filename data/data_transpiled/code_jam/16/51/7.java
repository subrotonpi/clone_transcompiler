static final Scanner getScanner ( ) {
  final Scanner in = new Scanner ( System . in ) ;
  final String [ ] words = in . nextLine ( ) . split ( " " ) ;
  final int [ ] getInts = new int [ words . length ] ;
  for ( int i = 0 ;
  i < words . length ;
  ++ i ) {
    getInts [ i ] = in . nextInt ( ) ;
  }
  final int getInt = in . nextInt ( ) ;
  final int T = getInt ;
  for ( int caseNo : xrange ( 1 , T + 1 ) ) {
    final String S = words [ 0 ] ;
    final int [ ] A = new int [ S . length ( ) ] ;
    for ( int s = 0 ;
    s < S . length ( ) ;
    ++ s ) {
      A [ s ] = S . charAt ( s ) == 'C' ;
    }
    final int N = S . length ;
    final int imbalance = Math . abs ( ( A * ( 1 - 2 * ( new int [ N ] ) % 2 ) ) ) ;
    System . out . println ( "Case #" + caseNo + ": " + ( N - imbalance ) * 5 ) ;
  }
  return in ;
}
