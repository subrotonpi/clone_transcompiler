@ VisibleForTesting static void from ( LinkedHashMap < String , Integer > input ) {
  int N = Integer . parseInt ( input . next ( ) ) ;
  int M = Integer . parseInt ( input . next ( ) ) ;
  List < List < Integer >> src = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) src . add ( Collections . singletonList ( input . next ( ) ) ) ;
  int [ ] removed = new int [ M ] ;
  int [ ] idxes = new int [ N ] ;
  int ans = N ;
  for ( int i = 0 ;
  i < M - 1 ;
  i ++ ) {
    Counter < Integer > ctr = new Counter < > ( ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int k = ctr . getValue ( j ) ;
      int most = ctr . getValue ( j ) ;
      ans = Math . min ( ans , most ) ;
      removed [ k ] = 1 ;
    }
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      while ( removed [ src . getValue ( j ) ] ++ > idxes [ j ] ) ;
    }
  }
  System . out . println ( ans ) ;
}
