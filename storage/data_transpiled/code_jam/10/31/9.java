static final String getSortKey ( ) throws IOException {
  INPUT = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  INPUT = new BufferedReader ( new FileReader ( sys . getProperty ( "sort" ) ) ) ;
  /* First line of input is in the file */
  String getline = INPUT . readLine ( ) . substring ( 0 , INPUT . length ( ) - 1 ) ;
  /* Print the line of the string */
  System . out . println ( INPUT . readLine ( ) ) ;
  /* Now the result is in the memo */
  final HashMap < String , Object > memos = new HashMap < String , Object > ( ) ;
  /* First line of the string is in the memo */
  final Object result ;
  /* Then the memo is in the memo */
  try {
    result = memos . get ( "memo1" ) ;
    trace ( "memo1" , ": got result from memo" ) ;
  }
  catch ( final ExecutionException e ) {
    result = e . getCause ( ) ;
    trace ( "memo1" , ": got result by calling" ) ;
    memos . put ( "memo1" , result ) ;
  }
  /* Now the result is in the memo */
  int nCases = Integer . parseInt ( getline ) ;
  trace ( nCases , "cases:" ) ;
  for ( int caseNum = 1 ;
  caseNum <= nCases ;
  caseNum ++ ) {
    trace ( ) ;
    trace ( "Case #" , caseNum ) ;
    int [ ] a_ = new int [ N ] ;
    int [ ] b_ = new int [ N ] ;
    final int N = Integer . parseInt ( getline ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final int a = Integer . parseInt ( getline ) ;
      final int b = Integer . parseInt ( getline ) ;
      a_ [ i ] = a ;
      b_ [ i ] = b ;
    }
    int nIntersections = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final int ai = a_ [ i ] ;
      final int bi = b_ [ i ] ;
      for ( int j = 0 ;
      j < i ;
      j ++ ) {
        final int aj = a_ [ j ] ;
        final int bj = b_ [ j ] ;
        if