public static int [ ] getans ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ans = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int tate = 1 + i ;
    int yoko = n / tate ;
    int amari = n % tate ;
    ans [ i ] = Math . abs ( tate - yoko ) + amari ;
  }
  System . out . println ( min ( ans ) ) ;
  return ans ;
}
