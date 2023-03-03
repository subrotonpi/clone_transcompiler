static void solve ( ) {
  final String print = "" ;
  int r = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  int k = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  List < String > lines = new ArrayList < String > ( ) ;
  for ( ;
  k <= r ;
  k ++ ) {
    String line = new LinkedList < String > ( ) ;
    StringTokenizer st = new StringTokenizer ( readLine ( ) . trim ( ) ) ;
    lines . add ( line ) ;
  }
  for ( int idx = 0 ;
  idx < lines . size ( ) ;
  idx ++ ) {
    if ( new HashSet < String > ( lines . get ( idx ) ) . size ( ) != 0 ) {
      if ( idx > 0 ) {
        lines . set ( 0 , lines . get ( idx ) ) ;
        lines . set ( idx , lines . get ( 0 ) ) ;
      }
      break ;
    }
  }
  for ( int idx = 0 ;
  idx < lines . size ( ) ;
  idx ++ ) {
    if ( new HashSet < String > ( lines . get ( idx ) ) . size ( ) == 0 ) {
      lines . set ( idx , lines . get ( idx - 1 ) ) ;
      print ( lines . get ( idx ) ) ;
    }
    else {
      String chars = StreamSupport . stream ( lines . get ( idx ) . toCharArray ( ) ) . filter ( Character :: isLetter ) . map ( String :: toLowerCase ) . collect ( Collectors . joining ( ) ) ;
      int curCharIdx = 0 ;
      for ( int i = 0 ;
      i < lines . size ( ) ;
      i ++ ) {
        char el = lines . get ( i ) ;
        if ( el != '?' && el != chars . charAt ( curCharIdx ) ) {
          curCharIdx ++ ;
        }
        lines . set ( idx , chars . charAt ( curCharIdx ) ) ;
      }
      print ( lines . get ( idx ) ) ;
    }
  }
  if ( Class . isEnum ( ) ) {
    int T = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    for ( int caseIdx = xrange ( 1 , T + 1 ) ;
    caseIdx <= T ;
    caseIdx ++ ) {
      System . out . print ( "Case #" + caseIdx + ": " ) ;
      solve ( ) ;
    }
  }
}
