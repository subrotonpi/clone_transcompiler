public static void print ( int a ) {
  int b = Integer . parseInt ( input ( ) ) ;
  int diff = Math . abs ( a - b ) ;
  System . out . println ( Math . min ( 10 - diff , diff ) ) ;
}
