static final Scanner solve = new Scanner ( System . in ) {
  private int [ ] counts = new int [ 10010 ] ;
  {
    for ( int i = 0 ;
    i < 10010 ;
    i ++ ) {
      counts [ i ] = 0 ;
    }
    for ( int i = 0 ;
    i < 10010 ;
    i ++ ) {
      counts [ i ] ++ ;
    }
  }
  private int [ ] ups = new int [ 10010 ] ;
  private int [ ] downs = new int [ 10010 ] ;
  {
    for ( int i = 0 ;
    i < 10010 - 1 ;
    i ++ ) {
      int d = counts [ i + 1 ] - counts [ i ] ;
      if ( d > 0 ) {
        for ( int j = 0 ;
        j < d ;
        j ++ ) {
          ups [ j ] = i ;
        }
      }
      if ( d < 0 ) {
        for ( int j = 0 ;
        j < - d ;
        j ++ ) {
          downs [ j ] = i ;
        }
      }
    }
    return Math . min ( d - u , downs ) ;
  }
  private String nextLine ( ) {
    return input . nextLine ( ) . trim ( ) . split ( " \n\t" ) ;
  }
  private String doTest ( ) {
    String [ ] line = input . nextLine ( ) . split ( " " ) ;
    assert line . length == Integer . parseInt ( line [ 0 ] ) + 1 ;
    int [ ] cards = new int [ line . length - 1 ] ;
    for ( int i = 1 ;
    i < line . length ;
    i ++ ) {
      cards [ i - 1 ] = Integer . parseInt ( line [ i ] ) ;
    }
    int res = solve . solve ( cards ) ;
    return String . valueOf ( res ) ;
  }
}
