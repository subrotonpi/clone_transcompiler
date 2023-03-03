@ VisibleForTesting static void heapsort ( String ... args ) {
  Function < String , String > rl = ( ) -> {
    String nextLine = System . getProperty ( "line.separator" ) ;
    int cases = Integer . parseInt ( nextLine ) ;
    for ( int cc : xrange ( cases ) ) {
      int n = Integer . parseInt ( nextLine ) ;
      int m = Integer . parseInt ( nextLine ) ;
      List < Integer > pairs = new ArrayList < > ( ) ;
      for ( int i = 0 ;
      i < m ;
      i ++ ) {
        pairs . add ( Integer . parseInt ( nextLine ) ) ;
      }
      return pairs . stream ( ) . map ( i -> {
        double sigma = ( i * ( i + 1 ) ) / 2 ;
        return ( i * ( i + 1 ) ) / 2 ;
      }
      ) . reduce ( ( i , i ) -> i * ( i + 1 ) ) . get ( ) ;
    }
    ;
    double original = Integer . MAX_VALUE ;
    int ENTER = 0 , LEAVE = 1 ;
    List < Event > events = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < pairs . size ( ) ;
    i ++ ) {
      events . add ( new Event ( pairs . get ( i ) , i , i + 1 ) ) ;
    }
    List < Event > tickets = new ArrayList < > ( ) ;
    int discounted = 0 ;
    while ( events . size ( ) > 0 ) {
      Event event = heapheappop ( events ) ;
      Event type = event . getType ( ) ;
      if ( type == ENTER ) {
        int here = event . getBegin ( ) ;
        final int end = event . getEnd ( ) ;
        int cnt = event . getBegin ( ) ;
        events . add ( new Event ( pairs . get ( i ) , i + 1 , end , cnt ) ) ;
        events . add ( new Event ( pairs . get ( i ) , i + 1 , end , cnt ) ) ;
        tickets . add ( new Event ( pairs . get ( i ) , i + 1 , end , cnt ) ) ;
      }
      else if ( type == LEAVE ) {
        int here = event . getBegin ( ) ;
        int cnt = event . getEnd ( ) ;
        while ( cnt > 0 ) {
          int tookAt = events . get ( i ) ;
          int ticketCnt = events . get ( i ) ;
          tookAt = - tookAt ;
          int effectiveCnt = Math . min ( ticketCnt , cnt ) ;
          discounted += cost ( tookAt , here ) * effective @ @