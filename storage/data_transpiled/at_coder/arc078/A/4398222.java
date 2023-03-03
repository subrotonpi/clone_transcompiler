public static int [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int x = 0 ;
  int y = Integer . MIN_VALUE ;
  int [ ] ans = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    x += a [ i ] ;
    y -= a [ i ] ;
    ans [ i ] = Math . abs ( x - y ) ;
  }
  System . out . println ( min ( ans ) ) ;
  return ans ;
}
