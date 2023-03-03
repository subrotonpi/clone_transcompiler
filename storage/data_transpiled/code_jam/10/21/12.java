static final void main ( String args [ ] ) throws IOException {
  if ( ( args . length < 2 ) || ( args . length > 3 ) ) {
    System . err . println ( "No file specified" ) ;
    System . exit ( 1 ) ;
  }
  BufferedReader in = new BufferedReader ( new FileReader ( args [ 0 ] ) ) ;
  PrintWriter out = new PrintWriter ( args [ 0 ] + ".out" ) ;
  int numCases = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
  /* Add the directories */
  int result = 0 ;
  if ( numCases > 0 ) {
    String childDir = in . readLine ( ) ;
    if ( ! dirs . containsKey ( childDir ) ) {
      result = 1 ;
      dirs . put ( childDir , new Integer ( 0 ) ) ;
    }
    result += addDir ( dirs . get ( childDir ) , newDir ) ;
  }
  for ( int testCase = 1 ;
  testCase <= numCases ;
  testCase ++ ) {
  }
}
