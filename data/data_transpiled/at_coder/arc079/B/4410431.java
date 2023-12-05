public static int counter ( int [ ] a , int n ) {
  int big = max ( a ) ;
  boolean check = true ;
  int counter = 0 ;
  while ( big > n - 1 ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( a [ i ] == big && check ) {
        check = false ;
        a [ i ] -= n ;
      }
      else {
        a [ i ] ++ ;
      }
    }
    counter ++ ;
    big = max ( a ) ;
    check = true ;
  }
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  n = 50 ;
  System . out . println ( n ) ;
  int temp = k / 50 ;
  a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = 49 + temp ;
  }
  k = k - 50 * ( k / 50 ) ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    big = min ( a ) ;
    check = true ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( a [ j ] == big && check ) {
        check = false ;
        a [ j ] += 50 ;
      }
      else {
        a [ j ] -- ;
      }
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i != n - 1 ) {
      System . out . print ( a [ i ] + " " ) ;
    }
    else {
      System . out . println ( a [ i ] ) ;
    }
  }
  return counter ;
}
