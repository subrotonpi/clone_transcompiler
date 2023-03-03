public static int [ ] xor ( int n ) {
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) b [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int xor = b [ 0 ] ;
  for ( int i = 1 ;
  i < n - 1 ;
  i ++ ) xor = xor ^ b [ i ] ;
  if ( b [ b . length - 1 ] != xor ) System . out . println ( - 1 ) ;
  else {
    int a = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      System . out . println ( a ) ;
      a = a ^ b [ i ] ;
    }
  }
  return b ;
}
