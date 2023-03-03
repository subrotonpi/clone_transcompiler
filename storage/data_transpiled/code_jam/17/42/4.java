static final Comparator < TicketInfo > iceil = new Comparator < TicketInfo > ( ) {
  @ Override public int compare ( TicketInfo o1 , TicketInfo o2 ) {
    assert o2 . compareTo ( o1 ) > 0 ;
    if ( o1 . compareTo ( o2 ) == 0 ) {
      return 0 ;
    }
    else {
      return ( o1 . compareTo ( o2 ) - 1 ) / o2 . compareTo ( o1 ) + 1 ;
    }
  }
  private int solve ( int n , TicketInfos tickets ) {
    Counter < Integer > holderHist = new ClassicCounter < > ( ) ;
    for ( Iterator < Integer > it = tickets . iterator ( ) ;
    it . hasNext ( ) ;
    ) {
      Integer seat = it . next ( ) ;
      holderHist . add ( holder ) ;
    }
    Counter < Integer > seatHist = new ClassicCounter < > ( ) ;
    for ( Iterator < Integer > it = tickets . iterator ( ) ;
    it . hasNext ( ) ;
    ) {
      Integer max = Integer . valueOf ( holderHist . get ( it . next ( ) ) ) ;
      maxHolder = max . compareTo ( holderHist . get ( max ) ) ;
    }
    int tixWidth = 0 ;
    int tixSoFar = 0 ;
    for ( int i : xrange ( n ) ) {
      tixSoFar += seatHist . getCount ( ) ;
      tixWidth = Math . max ( tixWidth , iceil . compare ( tixSoFar , i + 1 ) ) ;
    }
    assert tixSoFar == tickets . size ( ) ;
    int width = Math . max ( maxHolder , tixWidth ) ;
    int promotions = 0 ;
    for ( int i : xrange ( n ) ) {
      if ( seatHist . getCount ( i ) > width ) {
        promotions += seatHist . getCount ( i ) - width ;
      }
    }
    return ( width < promotions ) ? 0 : width ;
  }
}
