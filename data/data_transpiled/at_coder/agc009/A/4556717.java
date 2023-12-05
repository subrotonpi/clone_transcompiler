public static int [ ] getN ( ) {
  int [ ] A = new int [ N ] ;
  int [ ] B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    A [ i ] = a ;
    B [ i ] = b ;
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    A [ A . length - i ] += ans ;
    if ( A [ A . length - i ] % B [ B . length - i ] != 0 ) ans += B [ B . length - i ] - A [ A . length - i ] % B [ B . length - i ] ;
  }
  System . out . println ( ans ) ;
  return A ;
}
