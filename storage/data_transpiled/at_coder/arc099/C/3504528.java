static final double [ ] [ ] G ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] G = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    a -- ;
    b -- ;
    G [ a ] [ b ] = G [ b ] [ a ] = 0 ;
  }
  int [ ] colors = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    colors [ i ] = - 1 ;
  }
  boolean possible = true ;
  int [ ] [ ] ni = new int [ n ] [ 2 ] ;
  {
    int [ ] k = new int [ 2 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      k [ i ] = i ;
    }
    for ( int l = 0 ;
    l < n ;
    l ++ ) {
      if ( l == i || G [ i ] [ l ] == 0 ) continue ;
      if ( colors [ l ] == - 1 ) {
        dfs ( l , 1 - y ) ;
      }
      else if ( colors [ l ] != 1 - y ) {
        possible = false ;
        possible = false ;
      }
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    k [ 0 ] = 0 ;
    if ( colors [ i ] != - 1 ) continue ;
    dfs ( i , 0 ) ;
    ni [ i ] = new int [ 2 ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( dp [ j ] != 0 ) {
        dp [ j ] = 0 ;
        dp [ j + i ] [ 0 ] = 1 ;
        dp [ j + i ] [ 1 ] = 1 ;
      }
    }
  }
  double ans = Double . MAX_VALUE ;
  for ( int i = 0 ;
  i <= 701 ;
  i ++ ) {
    if ( dp [ i ] != 0 ) {
      int tmp = ( n - i ) * ( n - i - 1 ) / 2 + i * ( i - 1 ) / 2 ;
      ans = Math . min ( tmp , ans ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
