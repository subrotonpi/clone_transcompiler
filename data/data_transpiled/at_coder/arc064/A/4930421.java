public static void main ( int n , int x ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int diff = Math . max ( 0 , ( a [ i + 1 ] + a [ i ] ) - x ) ;
    ans += diff ;
    if ( a [ i + 1 ] >= diff ) a [ i + 1 ] = a [ i + 1 ] - diff ;
    else {
      a [ i ] -= diff - a [ i + 1 ] ;
      a [ i + 1 ] = 0 ;
    }
  }
  System . out . println ( ans ) ;
}
