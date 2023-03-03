public static double nextDouble ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  int e = Integer . parseInt ( input . nextLine ( ) ) ;
  double money = Double . POSITIVE_INFINITY ;
  for ( int x = 0 ;
  x < n + 1 ;
  x ++ ) {
    int y = Math . max ( 0 , ( ( n - x ) * e - h - b * x ) / ( d + e ) + 1 ) ;
    money = Math . min ( money , a * x + c * y ) ;
  }
  System . out . println ( money ) ;
  return money ;
}
