static final Scanner RIN = new Scanner ( System . in ) {
  @ Override public String nextLine ( ) {
    return nextLine ( ) ;
  }
  @ Override public Object [ ] readTestCase ( ) {
    String [ ] values = RIN . nextLine ( ) . split ( " " ) ;
    Object [ ] testcase = new Object [ values . length ] ;
    for ( int i = 0 ;
    i < xrange ( 0 , values . length , 2 ) ;
    i ++ ) {
      testcase [ i ] = new Object [ ] {
        values [ i ] , Integer . parseInt ( values [ i + 1 ] ) }
        ;
      }
      return testcase ;
    }
    private Object readTestCase ( ) {
      return new Robot ( ) {
        private int pos = 1 ;
        private int time = 0 ;
        @ Override public int compareTo ( int color ) {
          return new Integer ( color ) . compareTo ( "O" ) ;
        }
      }
      ;
    }
  }
  