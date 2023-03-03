@ VisibleForTesting static int print ( ) {
  int C = Integer . parseInt ( scanner . nextLine ( ) . trim ( ) ) ;
  int x1 = 0 , y1 = 1 , x2 = 2 , y2 = 3 ;
  /* Touching the range of r1 and r2 */
  if ( ( r1 [ x1 ] <= r2 [ x2 ] + 1 ) && ( r2 [ x1 ] <= r1 [ x2 ] + 1 ) && ( r1 [ y1 ] <= r2 [ y2 ] + 1 ) && ( r2 [ y1 ] <= r1 [ y2 ] + 1 ) ) {
    if ( r1 [ x1 ] > r2 [ x2 ] && r1 [ y1 ] > r2 [ y2 ] ) return false ;
    if ( r2 [ x1 ] > r1 [ x2 ] && r2 [ y1 ] > r1 [ y2 ] ) return false ;
    return true ;
  }
  /* Count group */
  int maxX = Math . max ( Integer . parseInt ( scanner . nextLine ( ) . trim ( ) ) , Integer . parseInt ( scanner . nextLine ( ) . trim ( ) ) ) ;
  int maxY = Math . max ( Integer . parseInt ( scanner . nextLine ( ) . trim ( ) ) , Integer . parseInt ( scanner . nextLine ( ) . trim ( ) ) ) ;
  /* Count group */
  int ans = Math . max ( Integer . parseInt ( scanner . nextLine ( ) . trim ( ) ) , ( maxX - maxX ) + ( maxY - maxY ) + 1 ) ;
  for ( int testCase = 1 ;
  testCase <= C ;
  testCase ++ ) {
    List < Rectangle > lonerects = new ArrayList < > ( ) ;
    int R = Integer . parseInt ( scanner . nextLine ( ) . trim ( ) ) ;
    for ( int r : xrange ( R ) ) {
      lonerects . add ( new Rectangle ( Integer . parseInt ( scanner . nextLine ( ) . trim ( ) ) ) ) ;
    }
    List < Rectangle > rectgroups = new ArrayList < > ( ) ;
    for ( Rectangle lr : lonerects ) {
      List < Rectangle > matches = new ArrayList < > ( ) ;
      for ( int rgi : xrange ( rectgroups . size ( ) ) ) {
        Rectangle rg = rectgroups . get ( rgi ) ;
        for ( Rectangle r : rg ) {
          if ( touching ( r , lr ) ) {
            matches . add ( rgi ) ;
            break ;
          }
        }
      }
      switch ( matches . size ( ) ) {
        case 0 : rectgroups . add ( lr ) ;
        break ;
        case 1 :