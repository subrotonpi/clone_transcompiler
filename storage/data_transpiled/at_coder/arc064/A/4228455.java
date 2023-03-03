public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int x = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  int c = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int p = a [ i - 1 ] + a [ i ] ;
    c += Math . max ( 0 , p - x ) ;
    a [ i ] = Math . max ( 0 , a [ i ] - Math . max ( 0 , p - x ) ) ;
  }
  System . out . println ( c ) ;
}
