public static void print ( ) {
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  System . out . println ( min ( Math . abs ( b - a ) , ( 10 + b - a ) , ( 10 + a - b ) ) ) ;
}
