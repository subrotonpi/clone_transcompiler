public static int C = Integer . parseInt ( Scanner in ) {
  for ( int c = 0 ;
  c < C ;
  c ++ ) {
    int R = in . nextInt ( ) ;
    List < Point > d = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      List < Integer > v = map . get ( in . nextInt ( ) ) ;
      int x1 = v . get ( 0 ) ;
      int y1 = v . get ( 1 ) ;
      int x2 = v . get ( 2 ) ;
      int y2 = v . get ( 3 ) ;
      for ( int x = x1 ;
      x <= x2 ;
      x ++ ) {
        for ( int y = y1 ;
        y <= y2 ;
        y ++ ) {
          d . add ( new Point ( x , y ) ) ;
        }
      }
    }
    Set < Point > dat = new HashSet < > ( d ) ;
    int t = 0 ;
    while ( dat . size ( ) > 0 ) {
      Set < Point > ndat = new HashSet < > ( ) ;
      for ( int x = 0 ;
      x < dat . size ( ) ;
      x ++ ) {
        int y = dat . get ( x ) ;
        if ( dat . contains ( new Point ( x - 1 , y ) ) || dat . contains ( new Point ( x , y - 1 ) ) ) {
          ndat . add ( new Point ( x , y ) ) ;
        }
        if ( dat . contains ( new Point ( x - 1 , y + 1 ) ) ) {
          ndat . add ( new Point ( x , y + 1 ) ) ;
        }
      }
      dat = ndat ;
      t ++ ;
    }
    System . out . println ( "Case #" + ( c + 1 ) + ": " + t ) ;
  }
  return C ;
}
