@ VisibleForTesting static int from ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  String name = input . substring ( 0 , N ) ;
  String kit = input . substring ( 0 , M ) ;
  Set < String > diff = new HashSet < String > ( ) ;
  int ans = 0 ;
  for ( String s : set ) {
    if ( ! diff . contains ( s ) ) {
      ans ++ ;
    }
  }
  return ans ;
}
