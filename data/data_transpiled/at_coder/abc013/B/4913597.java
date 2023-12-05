public static void print ( ) {
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  System . out . println ( min ( Math . abs ( a - b ) , Math . min ( a , b ) + ( 10 - max ( a , b ) ) ) ) ;
}
