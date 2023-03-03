public static void main ( String input ) {
  int n = ( Integer ) input . split ( " " ) . get ( ) , m = ( Integer ) input . get ( ) ;
  int [ ] [ ] a = new int [ n ] [ m + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] [ 0 ] = Integer . parseInt ( input . substring ( 0 , i ) ) ;
  int [ ] b = new int [ n ] , x = new int [ m + 1 ] , num = m ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) x [ a [ i ] [ 0 ] ] ++ ;
  int z = Math . max ( x , 0 ) ;
  ans = z , x [ x . indexOf ( z ) ] = - 1 ;
  while ( ans > ( n - 1 ) / num + 1 ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( x [ a [ i ] [ b [ i ] ] ] == - 1 ) {
        while ( x [ a [ i ] [ b [ i ] ] ] == - 1 ) b [ i ] ++ ;
        x [ a [ i ] [ b [ i ] ] ] ++ ;
      }
    }
    z = Math . max ( x , 0 ) ;
    ans = x [ x . indexOf ( z ) ] ;
    x [ x . indexOf ( z ) ] = - 1 ;
    num = Math . min ( ans , z ) ;
  }
  System . out . println ( ans ) ;
}
