public static void print ( ) {
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  int ans = Math . min ( ( ( b - a ) % 10 ) , ( a - b ) % 10 ) ;
  System . out . println ( ans ) ;
}
