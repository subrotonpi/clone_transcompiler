public static int hersCode ( int [ ] L , int n ) {
  int ok = L . length - 1 ;
  int ng = 0 ;
  while ( Math . abs ( ok - ng ) > 1 ) {
    int mid = Math . abs ( ok + ng ) / 2 ;
    if ( L [ mid ] > n ) {
      ok = mid ;
    }
    else {
      ng = mid ;
    }
  }
  /* Compute the number of digits */
  int ok = 0 ;
  int ng = L . length ;
  while ( Math . abs ( ok - ng ) > 1 ) {
    int mid = Math . abs ( ok + ng ) / 2 ;
    if ( L [ mid ] < n ) {
      ok = mid ;
    }
    else if ( L [ mid ] == n ) {
      if ( TF [ mid ] ) {
        ok = mid ;
      }
      else {
        ng = mid ;
      }
    }
    else {
      ng = mid ;
    }
  }
  /* Compute the number of digits */
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  Arrays . sort ( A ) ;
  double [ ] D = new double [ 31 ] ;
  for ( int i = 0 ;
  i < D . length ;
  i ++ ) {
    D [ i ] = Math . pow ( 2 , i ) ;
  }
  boolean [ ] TF = new boolean [ N + 1 ] ;
  for ( int i = 0 ;
  i < TF . length ;
  i ++ ) {
    TF [ i ] = true ;
  }
  int Ans = 0 ;
  int len = Arrays . copyOf ( A , len ) ;
  for ( int i = len - 1 ;
  i >= 1 ;
  i -- ) {
    if ( TF [ i ] ) {
      int k = D [ hersCode ( D , A [ len - 1 ] ) ] - A [ len - 1 ] ;
      len -- ;
      int t = hersCode2 ( A , k ) ;
      if ( A [ t ] == k ) {
        TF [ t ] = false ;
        Ans ++ ;
      }
    }
    else {
      len -- ;
    }
  }
  System . out . println ( Ans ) ;
  return 0 ;
}
