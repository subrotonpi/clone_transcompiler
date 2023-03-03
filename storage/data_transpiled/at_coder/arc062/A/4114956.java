public static int N = Integer . parseInt ( input ) {
  int vT = 1 ;
  int vA = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int t = Integer . parseInt ( input . readLine ( ) ) ;
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int d = Math . max ( ( ( - vT ) / t ) * ( - 1 ) , ( ( - vA ) / a ) * ( - 1 ) ) ;
    vT = d * t ;
    vA = d * a ;
  }
  return vT + vA ;
}
