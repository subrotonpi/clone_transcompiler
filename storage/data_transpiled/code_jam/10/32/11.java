static final String getTempFilename ( ) throws IOException {
  final InputStream INPUT = System . in ;
  INPUT = new FileInputStream ( args [ 0 ] ) ;
  final String getline = INPUT . readLine ( ) ;
  /* First line is the input line */
  final String print > System . err . print ( "..." ) ;
  for ( final String str : strs ) {
    print > System . err . print ( str ) ;
    print > System . err . print ( "..." ) ;
    for ( final String str : str . split ( " " ) ) {
      print > System . err . print ( str ) ;
      print > System . err . print ( "..." ) ;
    }
    print > System . err . println ( ) ;
  }
  final MemoizedSupplier < Object , Object > memoizedSupplier = new MemoizedSupplier < Object , Object > ( ) {
    @ Override public Object get ( ) {
      Object result ;
      try {
        result = memoizedSupplier . get ( ) ;
        trace ( result , ": got result from memo" ) ;
      }
      catch ( final ExecutionException e ) {
        result = e . getCause ( ) ;
        trace ( result , ": got result by calling" ) ;
        memoizedSupplier . put ( result , result ) ;
      }
      return result ;
    }
  }
  ;
  int nCases = Integer . parseInt ( getline ) ;
  trace ( nCases , "cases:" ) ;
  for ( int caseNum = 1 ;
  caseNum <= nCases ;
  caseNum ++ ) {
    trace ( ) ;
    trace ( "Case #" , caseNum ) ;
    final int L = Integer . parseInt ( getline . substring ( 0 , caseNum ) ) ;
    final int P = Integer . parseInt ( getline . substring ( caseNum + 1 , caseNum + 1 ) ) ;
    final int C = Integer . parseInt ( getline . substring ( caseNum + 1 , caseNum + 1 ) ) ;
    trace ( "L=" + L + " P=" + P + " C=" + C ) ;
    final double logSpan = ( Math . log ( P ) - Math . log ( L ) ) / Math . log ( C ) ;
    trace ( "logSpan =" + logSpan ) ;
    int nLoadTestsA = ( int ) Math . ceil ( Math . log ( logSpan ) - 1e-7 ) ;
    for ( int i : xrange ( Integer . MAX_VALUE ) ) {
      if ( Math .