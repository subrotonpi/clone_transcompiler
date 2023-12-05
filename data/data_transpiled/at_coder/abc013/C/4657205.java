public static double nextDouble ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  int e = Integer . parseInt ( input . nextLine ( ) ) ;
  double ans = Double . POSITIVE_INFINITY ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    int j = Math . max ( 0 , ( ( n - i ) * e - h - b * i ) / ( d + e ) + 1 ) ;
    ans = Math . min ( ans , a * i + c * j ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
