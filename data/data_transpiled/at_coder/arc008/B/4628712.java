@ VisibleForTesting static void from ( LinkedHashMap < String , Integer > input ) {
  int n = Integer . parseInt ( input . get ( ) ) ;
  int [ ] d1 = input . keySet ( ) . toArray ( ) ;
  int [ ] d2 = input . keySet ( ) . toArray ( ) ;
  m = 0 ;
  for ( int i : d1 ) {
    if ( ! i . equals ( i ) ) {
      if ( ! i . equals ( d2 [ i ] ) ) {
        m = i ;
      }
      else {
        m = i ;
      }
    }
  }
  System . out . println ( m ) ;
}
