public static void print ( int n , int l ) {
  int [ ] alist = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    alist [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int preva = alist [ 0 ] ;
  boolean isPossible = false ;
  for ( int i = 1 ;
  i < alist . length ;
  i ++ ) {
    int a = alist [ i ] ;
    if ( preva + a >= l ) {
      isPossible = true ;
      break ;
    }
    preva = a ;
  }
  if ( ! isPossible ) {
    System . out . println ( "Impossible" ) ;
  }
  else {
    System . out . println ( "Possible" ) ;
    for ( int j = 1 ;
    j <= i ;
    j ++ ) {
      System . out . println ( j ) ;
    }
    for ( int j = n - 1 ;
    j >= i ;
    j -- ) {
      System . out . println ( j ) ;
    }
    System . out . println ( i + 1 ) ;
  }
}
