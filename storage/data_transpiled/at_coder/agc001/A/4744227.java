static void n ( ) {
  int n , l , ans ;
  ans = Integer . parseInt ( input . nextLine ( ) ) ;
  l = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  l . sort ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ans += l [ i * 2 ] ;
  System . out . println ( ans ) ;
}
