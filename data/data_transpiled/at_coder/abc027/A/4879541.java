static final List < Integer > getCounts ( ) {
  List < Integer > l = new ArrayList < Integer > ( ) ;
  for ( int i : input . split ( " " ) ) {
    l . add ( i ) ;
  }
  Map < Integer , Integer > a = new LinkedHashMap < Integer , Integer > ( ) ;
  int b = a . size ( ) ;
  if ( b == 1 ) {
    ans = l . get ( 0 ) ;
  }
  else {
    for ( Integer k : a . keySet ( ) ) {
      if ( a . get ( k ) == 1 ) {
        ans = k ;
      }
    }
  }
  return ans ;
}
