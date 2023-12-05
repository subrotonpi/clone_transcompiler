@ VisibleForTesting static void binarySearch ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] c = new int [ n ] ;
  for ( int i = 0 ;
  i < c . length ;
  i ++ ) {
    c [ i ] = input . nextInt ( ) ;
  }
  LIS = new LIS ( c ) ;
}
