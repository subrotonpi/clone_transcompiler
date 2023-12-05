public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  a [ n ] = 0 ;
  int donnyoku = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int pair = ( a [ i ] + a [ i + 1 ] ) / 2 ;
    donnyoku += pair ;
    a [ i + 1 ] -= Math . max ( 0 , 2 * pair - a [ i ] ) ;
  }
  System . out . println ( donnyoku ) ;
}
