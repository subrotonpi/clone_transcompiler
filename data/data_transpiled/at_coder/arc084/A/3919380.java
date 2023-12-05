@ VisibleForTesting static void binarySearch ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > [ ] info = new List [ 3 ] ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) info [ i ] = new ArrayList < > ( Collections . nCopies ( N , Integer . MAX_VALUE ) ) ;
  long ans = 0 ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    long small = info [ 0 ] . get ( j ) ;
    long large = N - info [ 2 ] . get ( j ) ;
    ans += small * large ;
  }
  System . out . println ( ans ) ;
}
