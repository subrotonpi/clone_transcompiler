@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  List < Integer > B = Lists . newArrayList ( ) ;
  List < Integer > C = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  Collections . sort ( A ) ;
  Collections . sort ( B ) ;
  Collections . sort ( C ) ;
  int [ ] accA = new int [ N ] ;
  int [ ] accC = new int [ N ] ;
  int iA = 0 ;
  int iC = N - 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int b = B . get ( i ) ;
    while ( iA < N && A . get ( iA ) < b ) {
      accA [ i ] ++ ;
      iA ++ ;
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int b = B . get ( i ) ;
    while ( iC >= 0 && C . get ( iC ) > b ) {
      accC [ i ] ++ ;
      iC -- ;
    }
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = accA [ i ] ;
    int c = accC [ i ] ;
    ans += a * c ;
  }
  System . out . println ( ans ) ;
  return accA ;
}
