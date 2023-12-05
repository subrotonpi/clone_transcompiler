public static void print ( int n , int m ) {
  int [ ] X = new int [ n ] ;
  int [ ] Y = new int [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) Y [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int p = 10 * 9 + 7 ;
  int xsum = 0 ;
  int ysum = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) xsum += ( 2 * i - n - 1 ) * X [ i ] ;
  for ( int i = 1 ;
  i <= m ;
  i ++ ) ysum += ( 2 * i - m - 1 ) * Y [ i ] ;
  System . out . println ( xsum * ysum % p ) ;
}
