public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i : input ( ) . split ( " " ) ) {
    a [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  System . out . println ( ( int ) ( ( sum ( a ) - 1 ) / ( n - a . length ) ) + 1 ) ;
}
