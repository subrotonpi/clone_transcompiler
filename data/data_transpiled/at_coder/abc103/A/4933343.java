public static void print ( int a , int b , int c ) {
  list = map ( Integer . parseInt , input ( ) . split ( " " ) ) ;
  list = new ArrayList ( Arrays . asList ( Math . abs ( a - b ) , Math . abs ( b - c ) , Math . abs ( c - a ) ) ) ;
  System . out . println ( list . get ( 1 ) + list . get ( 2 ) ) ;
}
