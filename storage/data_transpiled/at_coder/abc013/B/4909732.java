public static void print ( ) {
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  System . out . println ( min ( abs ( a - b ) , abs ( 0 - a ) + abs ( 9 - b ) + 1 , abs ( 0 - b ) + ( 9 - a ) + 1 ) ) ;
}
