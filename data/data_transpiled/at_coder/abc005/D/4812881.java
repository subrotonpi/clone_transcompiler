@ VisibleForTesting static Iterable < Integer > accumulate ( int max ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] board = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) board [ i ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) board [ i ] [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int q = input . nextInt ( ) ;
  int [ ] ps = new int [ q ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) ps [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n - 1 ;
    j ++ ) {
      board [ i ] [ j + 1 ] += board [ i ] [ j ] ;
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      for ( int k = 0 ;
      k < n ;
      k ++ ) {
        for ( int l = k ;
        l < n ;
        l ++ ) {
          int area = ( j - i + 1 ) * ( l - k + 1 ) ;
          int s = board [ j ] [ l ] ;
          if ( k > 0 ) s -= board [ j ] [ k - 1 ] ;
          if ( i > 0 ) s -= board [ i - 1 ] [ l ] ;
          if ( i * k > 0 ) s += board [ i - 1 ] [ k - 1 ] ;
          d [ area ] = max ( d . getOrDefault ( area , 0 ) , s ) ;
        }
      }
    }
  }
  int [ ] v = new int [ n * n + 1 ] ;
  for ( Map . Entry < Integer , Integer > entry : map . entrySet ( ) ) {
    int area = entry . getKey ( ) ;
    int oishisa = entry . getValue ( ) ;
    v [ area ] = oishisa ;
  }
  List < Integer > list = Lists . newArrayList ( ) ;
  for ( int p : ps ) {
    System . out . println ( list . get ( p ) ) ;
  }
  return list ;
}
