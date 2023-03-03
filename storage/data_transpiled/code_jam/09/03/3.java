static final String [ ] args = new String [ ] {
  "welcome to code jam" }
  ;
  /* Process the case string */
  int [ ] [ ] substrs = new int [ caseStr . length ] [ target . length ] ;
  for ( int i = 0 ;
  i < substrs . length ;
  i ++ ) {
    substrs [ i ] [ 0 ] = 0 ;
    for ( int j = 0 ;
    j < target . length ;
    j ++ ) {
      substrs [ i ] [ j ] = 1 ;
    }
  }
  for ( int i = caseStr . length - 1 ;
  i >= 0 ;
  i -- ) {
    for ( int j = 0 ;
    j < target . length ;
    j ++ ) {
      if ( caseStr [ i ] != target [ j ] ) {
        substrs [ j ] [ i ] = 0 ;
      }
      else if ( j == target . length - 1 ) {
        substrs [ j ] [ i ] = 1 ;
      }
      else {
        substrs [ j ] [ i ] = Integer . valueOf ( substrs [ j + 1 ] [ i + 1 ] ) ;
      }
    }
  }
  /* Main program */
  List < String > fileLines = Files . readAllLines ( Paths . get ( file ) ) ;
  int index = 0 ;
  int numCases = Integer . parseInt ( fileLines . get ( index ++ ) . substring ( 0 , fileLines . get ( index ++ ) . length ( ) - 1 ) ) ;
  for ( int caseNum = 0 ;
  caseNum < numCases ;
  caseNum ++ ) {
    String caseStr = fileLines . get ( index ++ ) . substring ( 0 , fileLines . get ( index ++ ) . length ( ) - 1 ) ;
    int answer = processCase ( caseStr ) ;
    System . out . printf ( "Case #%d: %04d%n" , caseNum + 1 , answer % 10000 ) ;
  }
  if ( Class . forName ( "org.apache.commons.io.IOUtils" ) . getClass ( ) . getName ( ) . equals ( "org.apache.commons.io.IOUtils" ) ) {
    return new String [ ] {
      "" }
      ;
    }
    else {
      return new String [ ] {
        "" }
        ;
      }
    }
    