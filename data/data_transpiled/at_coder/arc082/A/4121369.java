public static int N = Integer . parseInt ( input ) {
  int [ ] A = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int [ ] l = new int [ 10 * 5 + 1 ] ;
  for ( int i : A ) {
    l [ i ] ++ ;
  }
  int ans = 0 ;
  for ( int a = 0 ;
  a < l . length ;
  a ++ ) {
    int b = l [ a ] ;
    int c = l [ b ] ;
    ans = Math . max ( ans , a + b + c ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
