@ VisibleForTesting static void binarySearch ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] c = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) c [ i ] = input . nextLine ( ) ;
  int [ ] dp = new int [ N ] ;
  dp [ 0 ] = c [ 0 ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    dp [ i ] = c [ i ] ;
  }
}
