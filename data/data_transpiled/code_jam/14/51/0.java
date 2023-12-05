@ Function public static < T , V > Memoize < T , V > memoize ( Function < T , V > function ) {
  HashMap < T , V > memo = new HashMap < > ( ) ;
  @ SuppressWarnings ( "unchecked" ) final T key = function . apply ( ( T ) null ) ;
  if ( ! memo . containsKey ( key ) ) {
    memo . put ( key , function . apply ( ( T ) null ) ) ;
  }
  memo . put ( key , function . apply ( ( T ) null ) ) ;
  return memo ;
}
