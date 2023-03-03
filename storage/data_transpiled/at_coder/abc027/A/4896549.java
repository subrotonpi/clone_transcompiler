public static void print ( int a , int b , int c ) {
  map = Integer . parseInt ( input ( ) . split ( " " ) ) ;
  List l = new ArrayList ( Arrays . asList ( a , b , c ) ) ;
  System . out . println ( l . get ( 0 ) + l . get ( 2 ) - l . get ( 1 ) ) ;
}
