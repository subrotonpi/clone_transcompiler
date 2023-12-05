public static void solve ( int xMax , int yMax , int [ ] [ ] d ) {
  int [ ] [ ] cTable = new int [ 100 ] [ 100 ] ;
  for ( int a = 0 ;
  a < 100 ;
  a ++ ) {
    int [ ] cTableA = cTable [ a ] ;
    for ( int x = 0 ;
    x < xMax ;
    x ++ ) {
      int ax = a * ( x + 1 ) ;
      int [ ] dx = d [ x ] ;
      for ( int b = 0 ;
      b < 100 ;
      b ++ ) {
        int c = - 1 ;
        for ( int y = 0 ;
        y < yMax ;
        y ++ ) {
          c = Math . max ( c , dx [ y ] - ax - b * ( y + 1 ) ) ;
        }
        cTableA [ b ] = Math . max ( cTableA [ b ] , c ) ;
      }
    }
  }
  int abMax = 0 ;
  Map < Integer , Integer > cSet = new HashMap < Integer , Integer > ( ) ;
  for ( int x = 0 ;
  x < xMax ;
  x ++ ) {
    int [ ] dx = d [ x ] ;
    for ( int y = 0 ;
    y < yMax ;
    y ++ ) {
      int dxy = d [ x ] [ y ] ;
      boolean f = false ;
      for ( int a = 0 ;
      a < 100 ;
      a ++ ) {
        int [ ] cTableA = cTable [ a ] ;
        int ax = a * ( x + 1 ) ;
        for ( int b = 0 ;
        b < 100 ;
        b ++ ) {
          if ( dxy == ax + b * ( y + 1 ) + cTableA [ b ] ) {
            abMax = Math . max ( abMax , a , b ) ;
            cSet . put ( new Integer ( a ) , cTableA [ b ] ) ;
            f = true ;
            break ;
          }
        }
        if ( f ) break ;
      }
      if ( ! f ) {
        System . out . println ( "Impossible" ) ;
        return ;
      }
    }
  }
  System . out . println ( "Possible" ) ;
  System . out . println ( ( abMax + 1 ) * 2 + " " + abMax * 2 + cSet . size ( ) ) ;
  for ( int i = 0 ;
  i < abMax ;
  i ++ ) {
    System . out . println ( abMax + i + " X" ) ;
  }
  for ( int i = 0 ;
  i < abMax