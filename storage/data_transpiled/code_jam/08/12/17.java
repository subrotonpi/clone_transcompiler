static void debug ( String ... msg ) throws IOException {
  final boolean DEBUG = ! DEBUG ;
  if ( DEBUG ) {
    for ( int i = 0 ;
    i < msg . length - 1 ;
    i ++ ) {
      print ( msg [ i ] ) ;
    }
    print ( msg [ msg . length - 1 ] ) ;
  }
  {
    int n = Integer . parseInt ( System . getProperty ( "line.separator" ) ) ;
    int m = Integer . parseInt ( System . getProperty ( "line.separator" ) ) ;
    ArrayList < ArrayList < Integer >> custs = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      String [ ] like = System . getProperty ( "line.separator" ) . split ( " " ) ;
      int [ ] ints = new int [ ints . length ] ;
      for ( int j = 0 ;
      j < ints . length ;
      j ++ ) ints [ j ] = Integer . parseInt ( like [ j ] ) ;
      int t = ints . length ;
      ArrayList < Integer > likes = new ArrayList < > ( ) ;
      for ( int j = 0 ;
      j < t ;
      j ++ ) likes . add ( new Integer ( ints [ 2 * j ] ) ) ;
      custs . add ( likes ) ;
    }
    debug ( n , m , custs ) ;
    ArrayList < Integer > needsMalted = new ArrayList < > ( ) ;
    int lastLen = - 1 ;
    while ( needsMalted . size ( ) != lastLen ) {
      lastLen = needsMalted . size ( ) ;
      for ( ArrayList < Integer > cust : custs ) {
        if ( cust . size ( ) == 1 ) {
          int flav = cust . get ( 0 ) ;
          int malt = cust . get ( 1 ) ;
          if ( malt == 1 && ! needsMalted . contains ( flav ) ) {
            needsMalted . add ( flav ) ;
          }
        }
      }
      debug ( "needs malted:" , needsMalted ) ;
      ArrayList < ArrayList < Integer >> newCusts = new ArrayList < > ( ) ;
      for ( ArrayList < Integer > cust : custs ) {
        ArrayList < Integer > newCust = new ArrayList < > ( ) ;
        for ( int flav : cust ) {
          newCust . add ( new Integer ( flav ) ) ;
        }
        if ( newCust . size ( ) == 0 ) {
          printResult ( caseNum , "IMPOSSIBLE"