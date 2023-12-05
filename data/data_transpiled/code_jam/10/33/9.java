static final String [ ] [ ] args = new String [ ] [ ] {
}
;
INPUT = new BufferedReader ( new FileReader ( args [ 0 ] ) ) {
  String line ;
  String bestSofar = null ;
  for ( int s = 1 ;
  s < 1 + sBound ;
  s ++ ) {
    if ( isChessboard ( r , s ) ) {
      bestSofar = s ;
    }
    else break ;
  }
  assert bestSofar != null ;
  /* print > System.err */
  for ( int rr = 0 ;
  rr < M ;
  rr ++ ) {
    for ( int cc = 0 ;
    cc < N ;
    cc ++ ) {
      if ( row_ [ rr ] [ cc ] . equals ( "X" ) ) {
        return false ;
      }
    }
  }
  /* print > System.err */
  {
    HashMap < Integer , String > memos = new HashMap < > ( ) ;
    /* print > System.err */
    for ( int rr = 0 ;
    rr < M ;
    rr ++ ) {
      for ( int cc = 0 ;
      cc < N ;
      cc ++ ) {
        row_ [ rr ] [ cc ] = "X" ;
      }
    }
    /* print > System.err */
    {
      int result = memos . get ( ) ;
      trace ( result , ": got result from memo" ) ;
    }
    /* print > System.err */
    for ( int rr = 0 ;
    rr < N ;
    rr ++ ) {
      for ( int cc = 0 ;
      cc < N ;
      cc ++ ) {
        row_ [ rr ] [ cc ] = "X" ;
      }
    }
    /* print > System.err */
    int nCases = Integer . parseInt ( line ) ;
    trace ( nCases , "cases:" ) ;
    for ( int caseNum = 1 ;
    caseNum <= nCases ;
    caseNum ++ ) {
      trace ( ) ;
      trace ( "Case #" , caseNum ) ;
      Map < Integer , String > expansion_ = new HashMap < > ( ) ;
      expansion_ . put ( "0" , "###" ) ;
      expansion_ . put ( "1" , "### " ) ;
      expansion_ . put ( "2" , "### " ) ;
      squares_of_size_ . put ( newS , "##  " ) ;
    }
  }
  /* print > System.err */
  for ( int r = 0 ;
  r