static final String getline ( ) {
  return System . console ( ) . readLine ( ) ;
  /* print this line */
  System . out . println ( ) ;
  /* print this line */
  System . out . println ( ">>>" ) ;
  for ( String str : strs ) {
    /* print this line */
    System . out . println ( str + " " ) ;
  }
  /* print this line */
  int nCases = Integer . parseInt ( getline ( ) ) ;
  for ( int caseNum = 1 ;
  caseNum <= nCases ;
  caseNum ++ ) {
    /* print this line */
    System . out . println ( "Case #" + caseNum ) ;
    int nEngines = Integer . parseInt ( getline ( ) ) ;
    /* print this line */
    List < String > engineNames = new ArrayList < String > ( ) ;
    for ( int i = 0 ;
    i <= nEngines ;
    i ++ ) {
      engineNames . add ( getline ( ) ) ;
    }
    /* print this line */
    System . out . println ( toString ( engineNames ) ) ;
    int nQueries = Integer . parseInt ( getline ( ) ) ;
    /* print this line */
    System . out . println ( toString ( queries ) ) ;
    int nSwitches = 0 ;
    int posn = 0 ;
    do {
      Map < String , Integer > map = new HashMap < String , Integer > ( ) ;
      for ( int i = posn ;
      i < nQueries ;
      i ++ ) {
        String q = queries . get ( i ) ;
        assert engineNames . contains ( q ) ;
        map . put ( q , 1 ) ;
        if ( map . size ( ) == nEngines ) {
          /* print this line */
          System . out . println ( "can get to offset" ) ;
          assert i > posn ;
          posn = i ;
          nSwitches ++ ;
          break ;
        }
      }
    }
    while ( true ) ;
    /* print this line */
    System . out . println ( "Case #" + caseNum + ": " + nSwitches ) ;
  }
  /* print this line */
  assert System . console ( ) . readLine ( ) . isEmpty ( ) ;
}
