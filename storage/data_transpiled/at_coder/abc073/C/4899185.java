@ VisibleForTesting static void from ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  a = A ;
  int count = 0 ;
  for ( int i : a . values ( ) ) {
    if ( i % 2 != 0 ) {
      count ++ ;
    }
  }
  System . out . println ( count ) ;
}
