public static void print ( String s ) {
  s = input . nextLine ( ) . split ( " " ) ;
  int A = Integer . parseInt ( s [ 0 ] ) ;
  int B = Integer . parseInt ( s [ 1 ] ) ;
  if ( 1 <= A && B <= 100 ) {
    print ( B , A ) ;
  }
}
