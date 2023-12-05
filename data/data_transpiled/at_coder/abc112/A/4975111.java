public static void print ( int n ) {
  int a ;
  int b ;
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  switch ( n ) {
    case 1 : System . out . println ( "Hello World" ) ;
    break ;
    case 2 : a = Integer . parseInt ( input . nextLine ( ) ) ;
    b = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( a + b ) ;
    break ;
  }
}
