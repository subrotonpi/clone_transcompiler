static final Scanner getScanner ( String [ ] args ) throws FileNotFoundException {
  final Scanner in ;
  final PrintWriter o ;
  int caseId = 1 ;
  int nb = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
  for ( int t = 0 ;
  t < nb ;
  t ++ ) {
    final String l = in . nextLine ( ) . trim ( ) ;
    final String [ ] sizes = l . split ( "\\s+" ) ;
    final int start = Integer . parseInt ( sizes [ 0 ] ) ;
    final int end = Integer . parseInt ( sizes [ 1 ] ) ;
    nb = fairSquare ( start , end ) ;
    System . out . println ( "Case #" + ( caseId ++ ) + ": " + o . nextLine ( ) ) ;
  }
  if ( args . length == 3 ) {
    final BufferedReader in = new BufferedReader ( new FileReader ( args [ 0 ] ) ) ;
    o = new PrintWriter ( new BufferedWriter ( new FileWriter ( args [ 1 ] ) ) ) ;
  }
  /* min except */
  final int [ ] l2 = new int [ 2 ] ;
  for ( int t = 0 ;
  t < l2 . length ;
  t ++ ) {
    l2 [ t ] = in . nextInt ( ) ;
  }
  final int res = Math . min ( l2 [ 0 ] , l2 [ 1 ] ) ;
  /* rev num */
  final int n = Integer . parseInt ( new String ( Collections . reverseOrder ( ) ) ) ;
  /* build pal */
  final int numL = ( d + 1 ) / 2 ;
  final String sn1 = Integer . toString ( n ) ;
  sn1 = "0" + sn1 ;
  final String nRev = new String ( Collections . reverseOrder ( ) ) ;
  final boolean pair = ( d % 2 == 0 ) ;
  if ( pair ) {
    return Integer . parseInt ( nRev + sn1 ) ;
  }
  else {
    return Integer . parseInt ( nRev . substring ( 0 , nRev . length ( ) - 1 ) + sn1 ) ;
  }
  /* isPal */
  final String ns = Integer . toString ( n ) ;
  final int s = ns . length ( ) ;
  for ( int i = 0 ;
  i < s ;
  i ++ ) {
    if ( ns . charAt ( i ) != ns . charAt ( s - 1 - i ) ) {
      return false ;
    }
  }
  /* print xxxx */
  final int nb = nb ;
  final int nbDigitStart = Integer . parseInt ( Integer . toString