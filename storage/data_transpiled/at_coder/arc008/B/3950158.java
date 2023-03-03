@ VisibleForTesting static int from ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  String name = input ;
  String kit = input ;
  int ans = 0 ;
  if ( Sets . difference ( name , kit ) . size ( ) != 0 ) {
    ans = - 1 ;
  }
  else {
    Set diff = Sets . newHashSet ( name ) ;
    while ( diff . size ( ) != 0 ) {
      diff = diff . subtract ( Sets . newHashSet ( kit ) ) ;
      ans ++ ;
    }
  }
  return ans ;
}
