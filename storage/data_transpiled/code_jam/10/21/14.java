static final int T = Integer . parseInt ( Scanner . nextLine ( ) ) {
  int T = Integer . parseInt ( nextLine ( ) ) ;
  {
    String [ ] parts = nextLine ( ) . split ( "/" ) ;
    for ( int i : xrange ( parts . length ) ) {
      yield ( "/" + parts [ i ] ) ;
    }
  }
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int N = nextLine ( ) . split ( " " ) . length ;
    int M = nextLine ( ) . split ( " " ) . length ;
    N = Integer . parseInt ( N ) ;
    M = Integer . parseInt ( M ) ;
    Set < String > tree = new HashSet < String > ( ) ;
    for ( int i : xrange ( N ) ) {
      String dir = nextLine ( ) ;
      for ( String p : components ( dir ) ) {
        tree . add ( p ) ;
      }
    }
    int added = 0 ;
    for ( int j : xrange ( M ) ) {
      String dir = nextLine ( ) ;
      for ( String p : components ( dir ) ) {
        if ( ! tree . contains ( p ) ) added ++ ;
        tree . add ( p ) ;
      }
    }
    System . out . println ( "Case #" + testCase + ": " + added ) ;
  }
  return T ;
}
