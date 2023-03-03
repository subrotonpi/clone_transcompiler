public static void print ( float t , float x ) {
  x = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  print ( '{:4f}' . format ( t / x ) ) ;
}
