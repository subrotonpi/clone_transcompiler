public static void print ( String a , String b , String c ) {
  int i = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  System . out . println ( a * b * c % ( 10 * * 9 + 7 ) ) ;
}
