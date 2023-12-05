public static int [ ] ints ( ) {
  int [ ] li = new int [ input . length ( ) ] ;
  for ( int i = 0 ;
  i < li . length ;
  i ++ ) {
    li [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
  }
  int K = Integer . parseInt ( input . substring ( 0 , K ) ) ;
  int a = max ( li ) ;
  return li ;
}
