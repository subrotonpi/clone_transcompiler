public static void print ( String [ ] a ) {
  int [ ] ints = new int [ ] {
    Integer . parseInt ( input ( ) ) }
    ;
    int ans = ( ints [ 0 ] / 2 ) * 2 + ints [ 1 ] + ( ints [ 3 ] / 2 ) * 2 + ( ints [ 4 ] / 2 ) * 2 ;
    if ( ints [ 0 ] > 0 && ints [ 3 ] > 0 && ints [ 4 ] > 0 ) {
      int odd = Integer . parseInt ( ints [ 0 ] ) ;
      ans += odd == 3 ? 1 : odd == 2 ? 0 : 1 ;
    }
    System . out . println ( ans ) ;
  }
  