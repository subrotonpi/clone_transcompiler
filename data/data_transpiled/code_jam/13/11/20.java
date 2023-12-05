static final String getSolutionName ( ) throws IOException {
  int rings = 0 ;
  do {
    t -= ( 2 * r + 1 ) ;
    if ( t < 0 ) return rings ;
    rings ++ ;
    if ( t == 0 ) return rings ;
    r += 2 ;
  }
  while ( t > 0 ) ;
  /* Adjust the number of numbers */
  double n = 2 * n * n + ( 2 * r - 1 ) * n ;
  /* Solve the fast search */
  double t = Math . floor ( ( - 1 * ( 2 * r - 1 ) + Math . sqrt ( ( 2 * r - 1 ) * ( 2 * r - 1 ) + 4 * 2 * t ) ) / 4 ) ;
  int n = ( int ) n ;
  if ( paintNeeded ( r , n ) > t ) return n - 1 ;
  /* Solve the binary search */
  int lowerBound = 1 ;
  int upperBound = t ;
  while ( ( lowerBound + 1 ) < upperBound ) {
    int mid = ( int ) ( ( lowerBound + upperBound ) / 2 ) ;
    if ( paintNeeded ( r , mid ) > t ) upperBound = mid ;
    else lowerBound = mid ;
  }
  /* Main program */
  String [ ] fileLines = Files . readAllLines ( Paths . get ( file ) ) ;
  int index = 0 ;
  int numCases = Integer . parseInt ( fileLines [ index ] . substring ( 0 , fileLines [ index ] . length ( ) - 1 ) ) ;
  index ++ ;
  for ( int caseNum = 0 ;
  caseNum < numCases ;
  caseNum ++ ) {
    final int [ ] result = new int [ numCases ] ;
    for ( String s : fileLines [ index ] . substring ( fileLines [ index ] . length ( ) - 1 ) . split ( "\\s+" ) ) {
      result [ caseNum ] = Integer . parseInt ( s ) ;
      index ++ ;
    }
    int answer = solveBinSearch ( result , t ) ;
    System . out . println ( "Case #" + ( caseNum + 1 ) + ": " + answer ) ;
  }
  if ( __name__ . equals ( "main" ) ) {
    main ( args ) ;
  }
  return "" ;
}
