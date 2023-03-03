static final Scanner scan = new Scanner ( System . in ) {
  private final boolean isWhite = true ;
  private final Scanner in = new Scanner ( System . in ) ;
  private void dbg ( int a ) {
    System . err . println ( a ) ;
  }
  public int readInt ( ) {
    return in . nextInt ( ) ;
  }
  public float readFloat ( ) {
    return in . nextDouble ( ) ;
  }
  public int [ ] readIntArray ( int N , Function < Integer , Integer > foo ) {
    return Arrays . stream ( xrange ( N ) ) . mapToInt ( foo :: nextInt ) . toArray ( ) ;
  }
  public int [ ] readLineArray ( Function < Integer , Integer > foo ) {
    return map ( foo :: nextInt , Integer :: parseInt ) ;
  }
  public int dig ( char c ) {
    int b = ( int ) c ;
    if ( c >= 97 ) return c - 87 ;
    return c - 48 ;
  }
  public void runTest ( int test ) {
    String s = in . nextLine ( ) ;
    if ( ( s . length ( ) == 1 ) && ( s . charAt ( 0 ) == ' ' ) ) {
      System . out . println ( "Case #" + ( test + 1 ) + ": " + in . nextLine ( ) ) ;
      return ;
    }
    int b = 2 ;
    Map < Character , Integer > m = new HashMap < Character , Integer > ( ) ;
    m . put ( s . charAt ( 0 ) , 1 ) ;
    boolean zero = false ;
    for ( int i = 1 ;
    i < s . length ( ) ;
    i ++ ) {
      if ( ( m . containsKey ( s . charAt ( i ) ) ) ) continue ;
      if ( ! zero ) {
        m . put ( s . charAt ( i ) , 0 ) ;
        zero = true ;
        continue ;
      }
      m . put ( s . charAt ( i ) , b ++ ) ;
    }
    int res = 0 ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      res *= b ;
      res += m . get ( s . charAt ( i ) ) ;
    }
    System . out . println ( "Case #" + ( test + 1 ) + ": " + in . nextLine ( ) ) ;
  }
}
