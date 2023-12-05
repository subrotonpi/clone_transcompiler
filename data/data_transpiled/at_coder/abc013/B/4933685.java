public static void print ( ) {
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  System . out . println ( min ( abs ( b - a ) , abs ( 10 + b - a ) , abs ( 10 + a - b ) ) ) ;
}
