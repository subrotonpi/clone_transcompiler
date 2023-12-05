public static void print ( String a , int b ) {
  int i = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  String ans = a + b < 10 ? a + b : "error" ;
  System . out . println ( ans ) ;
}
