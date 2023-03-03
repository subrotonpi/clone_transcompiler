public static int getPrime ( ) {
  String s [ ] = input . nextLine ( ) . split ( " " ) ;
  int a = Integer . parseInt ( s [ 0 ] ) ;
  int b = Integer . parseInt ( s [ 2 ] ) ;
  if ( s [ 1 ] . equals ( "+" ) ) {
    int p = a + b ;
    System . out . println ( p ) ;
  }
  else {
    int q = a - b ;
    System . out . println ( q ) ;
  }
  return a ;
}
