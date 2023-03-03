public static void print ( int n , int k ) {
  int [ ] l = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) l [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  long ans = 1000000000 ;
  for ( int i = 0 ;
  i < n - k + 1 ;
  i ++ ) ans = Math . min ( l [ i + k - 1 ] - l [ i ] , ans ) ;
  System . out . println ( ans ) ;
}
