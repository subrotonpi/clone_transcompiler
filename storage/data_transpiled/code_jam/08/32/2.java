@ VisibleForTesting static Map < Integer , Integer > updateCounters ( Map < Integer , Integer > counters , int newDigit ) {
  final Map < Integer , Integer > newCounters = new LinkedHashMap < > ( ) ;
  if ( counters . size ( ) == 0 ) {
    newCounters . put ( new Integer ( newDigit ) , 10 , 0 ) ;
  }
  for ( final Integer k : counters . keySet ( ) ) {
    final Integer newK = new Integer ( k . intValue ( ) + newDigit * k . intValue ( ) ) ;
    newCounters . put ( newK , counters . get ( k ) ) ;
    newK = new Integer ( newDigit ) ;
    newCounters . put ( newK , 10 , ( k . intValue ( ) + k . intValue ( ) ) % 210 ) ;
    newCounters . put ( newK , counters . get ( k ) ) ;
    newK = new Integer ( newDigit ) ;
    newCounters . put ( newK , 10 , ( k . intValue ( ) - k . intValue ( ) ) % 210 ) ;
    newCounters . put ( newK , counters . get ( k ) ) ;
  }
  return newCounters ;
}
