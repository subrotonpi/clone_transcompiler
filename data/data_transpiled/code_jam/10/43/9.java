static final Scanner in = new Scanner ( System . in ) {
  private final boolean isInteractive = true ;
  private final Scanner scan = new Scanner ( System . in ) ;
  private void dbg ( String a ) {
    System . err . println ( a . toString ( ) ) ;
  }
  public int readInt ( ) {
    return Integer . parseInt ( scan . nextLine ( ) ) ;
  }
  public float readFloat ( ) {
    return Float . parseFloat ( scan . nextLine ( ) ) ;
  }
  public boolean [ ] readArray ( Foo foo ) {
    return Arrays . stream ( input . split ( " " ) ) . map ( ( x ) -> foo . accept ( x ) ) . toArray ( ) ;
  }
  private void runTest ( int test ) {
    int R = scan . nextInt ( ) ;
    int [ ] xy = new int [ R ] ;
    for ( int i = 0 ;
    i < xy . length ;
    i ++ ) {
      xy [ i ] = scan . nextInt ( ) ;
    }
    Map < Integer , Boolean > cur = new HashMap < Integer , Boolean > ( ) ;
    Iterator < Integer > itr = xy . iterator ( ) ;
    for ( int x1 = 0 ;
    x1 < R ;
    x1 ++ ) {
      int y1 = scan . nextInt ( ) ;
      int x2 = scan . nextInt ( ) ;
      int y2 = scan . nextInt ( ) ;
      for ( int x = xrange ( x1 , x2 + 1 ) ;
      x < R ;
      x ++ ) {
        for ( int y = xrange ( y1 , y2 + 1 ) ;
        y < R ;
        y ++ ) {
          cur . put ( new Integer ( x ) , true ) ;
        }
      }
    }
    int res = - 1 ;
    for ( int T = xrange ( 10000 ) ;
    T < R ;
    T ++ ) {
      Map < Integer , Boolean > next = new HashMap < Integer , Boolean > ( ) ;
      Iterator < Integer > itr = cur . keySet ( ) . iterator ( ) ;
      while ( itr . hasNext ( ) ) {
        Integer x = itr . next ( ) ;
        if ( ( x - 1 ) == 1 || cur . containsKey ( x ) ) {
          next . put ( x , true ) ;
        }
        if ( ( x - 1 ) == 1 || ( y + 1 ) == 1 ) {
          next . put ( x , true ) ;
        }
      }
      if ( itr . hasNext ( ) ) {
        res = T + 1 ;
        break ;
      }
      cur = next ;
    }
    System . out . println ( "Case #" + ( test + 1 ) + ": " + res