public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  if ( Arrays . stream ( a ) . filter ( i -> i % n != 0 ) . count ( ) != 0 ) {
    System . out . println ( - 1 ) ;
    quit ( ) ;
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( Arrays . stream ( a , i + 1 ) . filter ( i -> i % n != 0 ) . count ( ) != ( i + 1 ) * Arrays . stream ( a ) . filter ( i -> i % n != 0 ) . count ( ) / n ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
