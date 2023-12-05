public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int t2 = 0 , a2 = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int m = Math . max ( ( t2 - 1 ) / t , ( a2 - 1 ) / a ) + 1 ;
    t2 = m * t ;
    a2 = m * a ;
  }
  System . out . println ( t2 + a2 ) ;
}
