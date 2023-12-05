public static void IN ( Scanner in ) throws FileNotFoundException {
  PrintStream out = new PrintStream ( new File ( "input.txt" ) ) ;
  int NUM_TESTS = Integer . parseInt ( in . nextLine ( ) ) ;
  for ( int test : xrange ( NUM_TESTS ) ) {
    int N = Integer . parseInt ( in . nextLine ( ) ) ;
    Map < Character , Boolean > set = Maps . newHashMap ( ) ;
    for ( int m : xrange ( 1 , 1000 ) ) {
      String s = String . valueOf ( N * m ) ;
      for ( char c : s . toCharArray ( ) ) set . put ( c , true ) ;
    }
  }
  out . println ( ) ;
  in . close ( ) ;
}
