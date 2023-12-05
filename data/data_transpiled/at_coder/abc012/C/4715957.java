@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int diff = 2025 - N ;
  for ( int i = 1 , j = 1 ;
  i < 10 ;
  i ++ , j ++ ) {
    if ( i * j == diff ) {
      System . out . println ( i + " x " + j ) ;
    }
  }
  return ImmutableList . of ( ) ;
}
