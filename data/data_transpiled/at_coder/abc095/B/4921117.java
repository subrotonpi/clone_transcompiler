public static int n ( ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] M = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    M [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = n ;
  x -= sum ( M ) ;
  ans += x / min ( M ) ;
  return ans ;
}
