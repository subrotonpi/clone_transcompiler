public static void print ( String a , String b , String c ) {
  int ans = Integer . parseInt ( input ( ) . split ( " " ) [ 0 ] ) ;
  ans = ( a * b * c ) % ( 10 * * 9 + 7 ) ;
  System . out . println ( ans ) ;
}
