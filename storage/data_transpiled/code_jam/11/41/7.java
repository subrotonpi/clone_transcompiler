public static < T > Callable < T > cached ( Callable < T > f ) {
  final Object notCached = new Object ( ) ;
  final Map < Object , Object > cache = new HashMap < > ( ) ;
  return ( ) -> {
    T result = cache . get ( ) ;
    if ( result != notCached ) {
      return result ;
    }
    cache . put ( ) ;
    result = f . call ( ) ;
    return result ;
  }
  ;
}
