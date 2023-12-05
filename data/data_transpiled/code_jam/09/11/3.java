private static void readAllMins ( ) throws IOException {
  BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int [ ] allmins = new int [ in . available ( ) ] ;
  in . read ( allmins ) ;
  in . close ( ) ;
  for ( int testCase = 0 ;
  testCase < input . length ;
  testCase ++ ) {
    System . out . println ( "Case #" + ( testCase + 1 ) + ":" + "," ) ;
    int bases = Integer . parseInt ( in . readLine ( ) ) ;
    System . out . println ( allmins [ bases ] ) ;
  }
}
