public static void print ( String input ) {
  int [ ] a = Integer . parseInt ( input ) ;
  int ans = a [ 1 ] + 2 * ( a [ 0 ] / 2 + a [ 4 ] / 2 + a [ 3 ] / 2 ) ;
  if ( a [ 0 ] > 0 && a [ 3 ] > 0 && a [ 4 ] > 0 ) {
    ans = Math . max ( ans , a [ 1 ] + 2 * ( ( a [ 0 ] - 1 ) / 2 + ( a [ 3 ] - 1 ) / 2 + ( a [ 4 ] - 1 ) / 2 ) + 3 ) ;
  }
  System . out . println ( ans ) ;
}
