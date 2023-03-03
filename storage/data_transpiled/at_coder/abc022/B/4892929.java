public static void solve ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] visited = new int [ 100005 ] ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( visited [ a - 1 ] != 0 ) ans ++ ;
    else visited [ a - 1 ] ++ ;
  }
  System . out . println ( ans ) ;
}
