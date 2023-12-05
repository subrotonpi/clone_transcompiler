public static void readInput ( Scanner IN ) throws IOException {
  PrintStream OUT = new PrintStream ( new FileOutputStream ( "output.txt" ) ) ;
  int NUM_TESTS = Integer . parseInt ( IN . nextLine ( ) ) ;
  for ( int test : xrange ( NUM_TESTS ) ) {
    int D = Integer . parseInt ( IN . nextLine ( ) ) ;
    int N = Integer . parseInt ( IN . nextLine ( ) ) ;
    double worst = 0 ;
    for ( int i : xrange ( N ) ) {
      int K = Integer . parseInt ( IN . nextLine ( ) ) ;
      double S = Integer . parseInt ( IN . nextLine ( ) ) ;
      double arrival = ( double ) ( K - K ) ;
      if ( worst > 0 ) {
        worst = arrival ;
      }
    }
  }
  OUT . println ( ) ;
}
