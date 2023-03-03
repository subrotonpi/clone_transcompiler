@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Lists . newArrayList ( ) ;
  }
  int [ ] Sa = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Sa [ i ] = Lists . newArrayList ( ) ;
  }
  List < Integer > dp = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dp . add ( Arrays . asList ( Double . MAX_VALUE ) ) ;
  }
  if ( Sa [ n - 1 ] == k ) {
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  if ( k == 0 ) {
    System . out . println ( 0 ) ;
  }
  else if ( n == 1 ) {
    System . out . println ( 1 ) ;
  }
  else {
    dp . get ( 0 ) . set ( 1 ) ;
    for ( int i = 1 ;
    i < n ;
    i ++ ) {
      dp . get ( i ) . set ( 0 , 1 ) ;
      for ( int j = 1 ;
      j <= i ;
      j ++ ) {
        int tmp = dp . get ( i - 1 ) . get ( j - 1 ) * Sa [ i ] / Sa [ i - 1 ] + 1 ;
        dp . get ( i ) . set ( j , Math . min ( tmp , dp . get ( i - 1 ) . get ( j ) ) ) ;
      }
    }
    if ( dp . get ( n - 1 ) . get ( n - 1 ) <= k ) {
      System . out . println ( n ) ;
    }
    else {
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        int ans ;
        ans = i + 1 ;
        if ( dp . get ( n - 1 ) . get ( i ) <= k ) {
          ans = i + 1 ;
        }
        else {
          System . out . println ( ans ) ;
          exit ( ) ;
        }
      }
    }
  }
  return dp ;
}
