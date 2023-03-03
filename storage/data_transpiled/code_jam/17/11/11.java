public static void points ( int rlo , int rhi , int clo , int chi ) throws IOException {
  for ( int r : xrange ( rlo , rhi ) ) {
    for ( int c : xrange ( clo , chi ) ) {
      points ( r , c ) ;
    }
  }
  /* recfill cake */
  Point p1 = null ;
  int kid = 0 ;
  Point p2 = null ;
  for ( int r = 0 ;
  r < points ( rlo , rhi ) ;
  r ++ ) {
    int c = points ( rlo , rhi ) ;
    if ( cake [ r ] . charAt ( c ) != '?' ) {
      if ( p1 == null ) {
        p1 = new Point ( r , c ) ;
        kid = cake [ r ] . getX ( ) ;
      }
      else {
        p2 = new Point ( r , c ) ;
        break ;
      }
    }
  }
  assert p1 != null ;
  if ( p2 == null ) {
    for ( int r = 0 ;
    r < points ( rlo , rhi ) ;
    r ++ ) {
      int c = points ( rlo , rhi ) ;
      cake [ r ] . setX ( c , kid ) ;
    }
    return ;
  }
  if ( p1 . x != p2 . x ) {
    int rmid = Math . max ( p1 . x , p2 . x ) ;
    recfill ( cake , rlo , rmid , clo , chi ) ;
    recfill ( cake , rmid , rhi , clo , chi ) ;
  }
  else {
    int cmid = Math . max ( p1 . y , p2 . y ) ;
    recfill ( cake , rlo , rhi , clo , cmid ) ;
    recfill ( cake , rlo , rhi , cmid , chi ) ;
  }
  /* solve cake */
  recfill ( cake , 0 , cake . size ( ) , 0 , cake . get ( 0 ) . length ) ;
  if ( getClass ( ) . getName ( ) . equals ( "java.io.BufferedReader" ) ) {
    final BufferedReader is = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    /* read the line */
    int numCases = is . readInt ( ) ;
    for ( int i = 0 ;
    i < numCases ;
    i ++ ) {
      int nr = is . readInt ( ) ;
      int nc = is . readInt ( ) ;
      List < String > rows = new ArrayList < String > ( ) ;
      