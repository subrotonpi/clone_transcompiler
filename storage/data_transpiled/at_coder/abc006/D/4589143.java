static final int [ ] binarySearch ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] L = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  double [ ] dp = new double [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dp [ i ] = Double . parseDouble ( input . nextLine ( ) ) ;
  }
  return dp ;
}
