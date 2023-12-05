public static PrintStream IN = new PrintStream ( new File ( "input.txt" ) ) {
  PrintStream OUT = new PrintStream ( new File ( "output.txt" ) ) ;
  int NUM_TESTS = Integer . parseInt ( IN . readLine ( ) ) ;
  for ( int test : xrange ( NUM_TESTS ) ) {
    String stack = IN . readLine ( ) . substring ( 0 , IN . readLine ( ) . length ( ) - 1 ) ;
    stack += "+" ;
    int answer = 0 ;
  }
  OUT . println ( test + 1 ) ;
  return OUT ;
}
