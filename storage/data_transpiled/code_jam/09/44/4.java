public static PrintStream inp = new PrintStream ( "d:\\incoming\\d-small-attempt0.in" ) {
  private final PrintStream outp = new PrintStream ( ".\\d.out" ) ;
  @ Override public double go ( Object [ ] plants , int a , int b , int c ) throws IOException {
    return Math . max ( plants [ a ] . _2 , ( hypot ( plants [ b ] . _0 - plants [ c ] . _0 , plants [ b ] . _1 - plants [ c ] . _1 ) + plants [ b ] . _2 + plants [ c ] . _2 ) / 2.0 ) ;
  }
}
