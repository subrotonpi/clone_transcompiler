public static int [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) , k = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] b = new int [ n ] ;
  int c = - 1 ;
  int d = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] > c ) {
      b [ i ] = c ;
    }
    else {
      b [ i ] = d ;
      d = 1 ;
    }
  }
  b [ n ] = d ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < b . length ;
  i ++ ) {
    ans += Math . max ( b [ i ] - k + 1 , 0 ) ;
  }
  System . out . println ( ans ) ;
  return b ;
}
