public static int N = Integer . parseInt ( input ) {
  ArrayList < Integer > stacks = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int w = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( stacks . size ( ) == 0 ) {
      stacks . add ( w ) ;
    }
    else {
      for ( int j = 0 ;
      j < w ;
      j ++ ) {
        stacks . add ( w ) ;
      }
    }
  }
  return stacks . size ( ) ;
}
