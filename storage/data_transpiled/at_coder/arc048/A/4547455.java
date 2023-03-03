public static void print ( int a , int b ) {
  a = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  System . out . println ( b - a - 1 if a * b < 0 else b - a ) ;
}
