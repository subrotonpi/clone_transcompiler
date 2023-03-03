@ VisibleForTesting static int [ ] binarySearch ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] As = map ( Integer . parseInt ( input ( ) ) , N ) ;
  Counter c = new Counter ( As ) ;
  ArrayList < Integer > ans = new ArrayList < > ( ) ;
  for ( int k : new ArrayList < > ( c . keySet ( ) ) ) {
    int v = c . getCount ( k ) ;
    while ( v >= 2 ) {
      ans . add ( k ) ;
      v -= 2 ;
      if ( ans . size ( ) == 2 ) {
        System . out . println ( ans . get ( 0 ) * ans . get ( 1 ) ) ;
        System . exit ( 0 ) ;
      }
    }
  }
  System . out . println ( 0 ) ;
  return ans . toArray ( ) ;
}
