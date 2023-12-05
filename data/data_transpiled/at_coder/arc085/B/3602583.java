public static int n , z , w ;
int [ ] lis = new int [ ] {
  n , z }
  ;
  lis = new LinkedList ( ) ;
  for ( int i = 0 ;
  i < lis . length ;
  i ++ ) lis [ i ] = lis [ i ] ;
  int ans = 0 ;
  ans = Math . max ( ans , Math . abs ( lis [ n - 1 ] - w ) , Math . abs ( lis [ n - 1 ] - lis [ n - 2 ] ) ) ;
  System . out . println ( ans ) ;
  return ans ;
}
