public static int n ( int x , int ... a ) {
  int ans = Integer . parseInt ( open ( 0 ) . readLine ( ) ) ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int tyouka = a [ i ] + a [ i + 1 ] - x ;
    if ( tyouka > 0 ) {
      if ( tyouka <= a [ i + 1 ] ) {
        a [ i + 1 ] = a [ i + 1 ] - tyouka ;
      }
      else {
        a [ i ] = a [ i ] + a [ i + 1 ] - tyouka ;
        a [ i + 1 ] = 0 ;
      }
    }
  }
  System . out . println ( ans - Integer . parseInt ( a ) ) ;
  return ans ;
}
