public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] hArray = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    hArray [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( hArray ) ;
  int [ ] diff = new int [ N - K + 1 ] ;
  for ( int i = 0 ;
  i < N - K ;
  i ++ ) {
    diff [ i ] = hArray [ i ] - hArray [ i + K - 1 ] ;
  }
  System . out . println ( min ( diff ) ) ;
  return diff . length ;
}
