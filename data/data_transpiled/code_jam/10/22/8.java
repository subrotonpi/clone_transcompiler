public static final void main ( String args [ ] ) throws IOException {
  if ( ( args . length < 2 ) || ( args . length > 3 ) ) {
    System . out . println ( "No file specified" ) ;
    System . exit ( 1 ) ;
  }
  BufferedReader in = new BufferedReader ( new FileReader ( args [ 0 ] ) ) ;
  PrintWriter out = new PrintWriter ( args [ 0 ] + ".out" ) ;
  int numCases = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= numCases ;
  testCase ++ ) {
    int n = Integer . parseInt ( in . readLine ( ) ) ;
    int k = Integer . parseInt ( in . readLine ( ) ) ;
    int b = Integer . parseInt ( in . readLine ( ) ) ;
    int t = Integer . parseInt ( in . readLine ( ) ) ;
    int positions = Integer . parseInt ( in . readLine ( ) ) ;
    int speeds = Integer . parseInt ( in . readLine ( ) ) ;
    positions -- ;
    speeds -- ;
    int swaps = 0 ;
    if ( speeds < n ) {
      result = "IMPOSSIBLE" ;
    }
  }
  out . println ( ) ;
  in . close ( ) ;
}
