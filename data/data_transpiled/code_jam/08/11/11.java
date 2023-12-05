public static void readAllLines ( InputStream in ) throws IOException {
  BufferedReader br = new BufferedReader ( new InputStreamReader ( in ) ) ;
  int numcases = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int testCase = 0 ;
  testCase < numcases ;
  testCase ++ ) {
    String line = br . readLine ( ) . trim ( ) ;
    int n = Integer . parseInt ( line ) ;
    line = br . readLine ( ) . trim ( ) ;
    List < Integer > vect1 = CollectionUtils . parse ( line ) ;
    line = br . readLine ( ) . trim ( ) ;
    List < Integer > vect2 = CollectionUtils . parse ( line ) ;
    if ( n != vect1 . size ( ) || n != vect2 . size ( ) ) throw new RuntimeException ( ) ;
    Collections . sort ( vect1 ) ;
    Collections . sort ( vect2 ) ;
    Collections . reverse ( vect2 ) ;
    int total = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) total += vect1 . get ( i ) * vect2 . get ( i ) ;
    System . out . println ( "Case #" + ( testCase + 1 ) + ": " + total ) ;
  }
}
