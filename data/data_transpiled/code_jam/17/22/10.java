static final Scanner ip = new Scanner ( System . in ) {
  @ Override public int nextInt ( ) {
    return Integer . parseInt ( in . nextLine ( ) ) ;
  }
  @ Override public void solve ( int cas ) {
    System . out . printf ( "Case #%d:" , cas ) ;
    int N = ip . nextInt ( ) ;
    int R = ip . nextInt ( ) ;
    int O = ip . nextInt ( ) ;
    int Y = ip . nextInt ( ) ;
    int G = ip . nextInt ( ) ;
    int B = ip . nextInt ( ) ;
    int V = ip . nextInt ( ) ;
    if ( Y + V == N ) {
      if ( Y != V ) {
        System . out . println ( "IMPOSSIBLE" ) ;
      }
      else {
        StringBuilder sb = new StringBuilder ( ) ;
        for ( int i : xrange ( Y ) ) {
          sb . append ( 'Y' ) ;
          sb . append ( 'V' ) ;
        }
        sb . append ( '' ) ;
      }
      x -= e ;
      y -= e ;
      z -= e ;
      for ( int i : xrange ( x ) ) {
        sb . append ( C . get ( 0 ) . remove ( ) ) ;
        sb . append ( 'O' ) ;
        sb . append ( 'B' ) ;
      }
      System . out . println ( sb . toString ( ) ) ;
    }
    return ;
  }
  @ Override public void solve ( int i ) {
    solve ( i + 1 ) ;
  }
}
;
for ( int i : xrange ( 0 , 3 ) ) {
  if ( O != B ) {
    System . out . println ( "IMPOSSIBLE" ) ;
  }
  else {
    StringBuilder sb = new StringBuilder ( ) ;
    for ( int i : xrange ( O ) ) {
      sb . append ( 'R' ) ;
      sb . append ( 'G' ) ;
    }
    sb . append ( '' ) ;
  }
  return ;
}
if ( R + G == N ) {
  if ( R != G ) {
    System . out . println ( "IMPOSSIBLE" ) ;
  }
  else {
    StringBuilder sb = new StringBuilder ( ) ;
    for ( int i : xrange ( R ) ) {
      sb . append ( 'R' ) ;
      sb . append ( 'G' ) ;
      sb . append ( 'B' ) ;
    }
    sb . append ( '' ) ;
  }
}
final StringBuilder sb = new StringBuilder ( ) ;
sb . append ( OR ) ;
sb . append ( OY ) ;
sb . append ( '' ) ;
sb