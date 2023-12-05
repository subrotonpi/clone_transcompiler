@ GwtIncompatible ( "java.io.Reader" ) private static void go ( String file ) throws IOException {
  final Scanner scanner = new Scanner ( new File ( file ) ) ;
  final PrintWriter output = new PrintWriter ( new BufferedWriter ( new FileWriter ( "out.txt" ) ) ) ;
  for ( int testCase = 1 ;
  testCase <= Integer . MAX_VALUE ;
  testCase ++ ) {
    output . println ( "Case #" + testCase + ":" ) ;
    boolean failed = false ;
    final String [ ] rc = scanner . nextLine ( ) . split ( " " ) ;
    final int nr = Integer . parseInt ( rc [ 0 ] ) ;
    final int nc = Integer . parseInt ( rc [ 1 ] ) ;
    final String [ ] [ ] rows = new String [ nr ] [ nc ] ;
    for ( int i = 0 ;
    i < nr ;
    i ++ ) {
      rows [ i ] = Arrays . copyOf ( scanner . nextLine ( ) . split ( " " ) , nc ) ;
    }
    System . out . println ( rows ) ;
    for ( int r = 0 ;
    r < nr ;
    r ++ ) {
      for ( int c = 0 ;
      c < nc ;
      c ++ ) {
        System . out . println ( r + "\t" + c ) ;
        if ( rows [ r ] [ c ] . length ( ) == 0 ) {
          if ( r < nr - 1 && c < nc - 1 && rows [ r ] [ c + 1 ] . length ( ) == 0 && rows [ r + 1 ] [ c ] . length ( ) == 0 && rows [ r + 1 ] [ c + 1 ] . length ( ) == 0 ) {
            rows [ r ] [ c ] = "/" ;
            rows [ r ] [ c + 1 ] = "\\" ;
            rows [ r + 1 ] [ c ] = "\\" ;
            rows [ r + 1 ] [ c + 1 ] = "/" ;
          }
          else {
            failed = true ;
          }
        }
      }
    }
    if ( failed ) {
      output . println ( "Impossible" ) ;
    }
    else {
      for ( int r = 0 ;
      r < nr ;
      r ++ ) {
        output . println ( Arrays . toString ( rows [ r ] ) ) ;
      }
    }
  }
  /* do nothing */
}
