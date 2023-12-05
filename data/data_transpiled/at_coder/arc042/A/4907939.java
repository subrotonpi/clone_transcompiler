public static int [ ] getUsed ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] a = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) a [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  boolean [ ] isUsed = new boolean [ n ] ;
  int [ ] ans = new int [ n ] ;
  for ( int i = m ;
  i > 0 ;
  i -- ) {
    if ( ! isUsed [ a [ i ] - 1 ] ) {
      ans [ i ] = a [ i ] ;
      isUsed [ a [ i ] - 1 ] = true ;
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ! isUsed [ i ] ) ans [ i ] = i + 1 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( ans [ i ] ) ;
  }
  return ans ;
}
