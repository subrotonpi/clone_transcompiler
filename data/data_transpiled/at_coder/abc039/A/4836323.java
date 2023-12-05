public static void print ( ) {
  int a = Integer . parseInt ( input ( ) . split ( ) ) ;
  int b = Integer . parseInt ( input ( ) . split ( ) ) ;
  int c = Integer . parseInt ( input ( ) . split ( ) ) ;
  int d = a * b + b * c + c * a ;
  d *= 2 ;
  System . out . println ( d ) ;
}
