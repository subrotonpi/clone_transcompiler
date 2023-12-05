public static int N = Integer . parseInt ( input ) {
  int [ ] K = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int l = Integer . parseInt ( input ) ;
    K [ i ] = l ;
  }
  System . out . println ( sum ( K ) ) ;
  System . out . println ( max ( 0 , max ( K ) * 2 - sum ( K ) ) ) ;
  return 0 ;
}
