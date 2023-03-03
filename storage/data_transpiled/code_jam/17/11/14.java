static final String getResultsName ( ) {
  final String namePart = "" ;
  final int count = Integer . parseInt ( namePart ) ;
  final StringBuilder sb = new StringBuilder ( ) ;
  int iFirst = 0 ;
  boolean multiLineResult = true ;
  for ( int iTry = 0 ;
  iFirst < count ;
  iNext ++ ) {
    final int iLastResult = sb . length ( ) ;
    final int [ ] testCase = sb . toString ( ) . split ( " " ) ;
    final int h = ++ iFirst ;
    final int [ ] qLines = new int [ h ] ;
    for ( int i = 0 ;
    i < h ;
    i ++ ) {
      qLines [ i ] = sb . toString ( ) . split ( " " ) ;
    }
    sb . append ( testCase [ iLast ] ) ;
    if ( multiLineResult ) {
      sb . append ( "Case #" ) . append ( iTry + 1 ) . append ( ":" ) ;
      sb . append ( map ( getResultMultiLine ( testCase ) ) ) ;
    }
    else {
      sb . append ( "Case #" ) . append ( iTry + 1 ) . append ( ": " ) . append ( getResult ( testCase ) ) ;
    }
    for ( int j = iLast ;
    j < resultLines . length ;
    j ++ ) {
      System . out . println ( resultLines [ j ] ) ;
    }
  }
  if ( namePart != null ) {
    try {
      final File oFile = new File ( namePart + ".out" ) ;
      final BufferedWriter writer = new BufferedWriter ( new FileWriter ( oFile ) ) ;
      writer . write ( resultLine + "\n" ) ;
      writer . flush ( ) ;
      writer . close ( ) ;
    }
    catch ( final IOException e ) {
      e . printStackTrace ( ) ;
    }
  }
  final StringBuilder sb = new StringBuilder ( ) ;
  final String input = "\n" + "\n" + "\n" + "\n" + "\n" ;
  final String [ ] lines = new String [ ] {
    input , "" }
    ;
    if ( namePart == null ) {
      sb = new StringBuilder ( ) ;
      for ( final String s : lines ) {
        if ( sb . length ( ) > 0 ) {
          sb . append ( s ) ;
        }
      }
    }
    else {
      sb = new StringBuilder ( ) ;
      for ( final String namePart1 : nameParts ) {
        if ( sb . length ( ) > 0 ) {
          sb . append ( "\n" ) ;
        }
      }
    }
    return