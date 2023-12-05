@ VisibleForTesting static int [ ] binarySearch ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] c = new int [ N ] ;
  boolean append = c . length > 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    append = c [ i ] ;
  }
  dp = new int [ N ] ;
  return dp ;
}
