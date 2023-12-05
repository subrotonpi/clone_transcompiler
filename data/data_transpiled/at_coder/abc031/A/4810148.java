public static void main ( String input ) {
  int a , d = map ( Integer . parseInt , input . split ( " " ) ) ;
  if ( a > d ) {
    a = d ;
    d = a ;
  }
  System . out . println ( ( a + 1 ) * d ) ;
}
