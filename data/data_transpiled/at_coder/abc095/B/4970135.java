public static int N = Integer . parseInt ( input ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] mList = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    mList [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int sumM = sum ( mList ) ;
  int minM = min ( mList ) ;
  System . out . println ( N + ( X - sumM ) / minM ) ;
  return minM ;
}
