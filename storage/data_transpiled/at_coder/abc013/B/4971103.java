public static void print ( ) {
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  System . out . println ( min ( abs ( a - b ) , abs ( 10 + a - b ) , abs ( a - b - 10 ) ) ) ;
}
