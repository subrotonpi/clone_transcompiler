public static int [ ] getD ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] d = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    d [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int d_Sum = sum ( d ) ;
  int d_Max = max ( d ) ;
  return d ;
}
