public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i : input . split ( ) ) {
    a [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
  }
  int x [ ] = new int [ n * 2 ] ;
  for ( int i = 1 ;
  i < n ;
  i += 2 ) {
    x [ i ] = a [ i ] ;
  }
  System . out . println ( sum ( x ) ) ;
}
