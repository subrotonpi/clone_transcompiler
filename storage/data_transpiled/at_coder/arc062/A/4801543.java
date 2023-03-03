public static int N = Integer . parseInt ( input ) {
  int T = 0 , A = 0 ;
  for ( ;
  ;
  ) {
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( T <= t && A <= a ) {
      T = t ;
      A = a ;
    }
    else {
      T = t * max ( ( T + t - 1 ) / t , ( A + a - 1 ) / a ) ;
    }
  }
  System . out . println ( T + A ) ;
}
