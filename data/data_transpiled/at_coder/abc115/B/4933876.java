public static void print ( int n ) {
  int [ ] P = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    P [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  System . out . println ( Math . round ( sum ( P ) - ( P [ 0 ] / 2 ) ) ) ;
}
