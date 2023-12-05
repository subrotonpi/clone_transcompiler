public static void print ( ) {
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  System . out . println ( Math . abs ( a - b ) < 5 ? ( a + 10 - b ) : ( b + 10 - a ) ) ;
}
