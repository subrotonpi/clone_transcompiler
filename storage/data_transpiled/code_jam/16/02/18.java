public static void readAllCases ( File f ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( "C:\\Users\\djspence\\Downloads\\B-large.in" ) ) ;
  int tries = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int i = 0 ;
  i <= tries ;
  i ++ ) {
    String pans = br . readLine ( ) . trim ( ) ;
    int flips = 0 ;
    for ( int j = 1 ;
    j < pans . length ( ) ;
    j ++ ) {
      if ( pans . charAt ( j ) != pans . charAt ( j - 1 ) ) flips ++ ;
    }
    if ( pans . charAt ( pans . length ( ) - 1 ) == '-' ) flips ++ ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + flips ) ;
  }
}
