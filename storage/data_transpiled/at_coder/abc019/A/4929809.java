public static void print ( String s [ ] ) {
  s = input . nextLine ( ) . split ( " " ) ;
  int a = Integer . parseInt ( s [ 0 ] ) ;
  int b = Integer . parseInt ( s [ 1 ] ) ;
  int c = Integer . parseInt ( s [ 2 ] ) ;
  if ( 1 <= a && b <= 100 && c <= 100 ) {
    if ( a < b && c < b || c < b || a == b == c ) {
      print ( b ) ;
    }
    else if ( a < c && c < b || b < c && c < a ) {
      print ( c ) ;
    }
    else if ( b < a && c < b ) {
      print ( a ) ;
    }
    else if ( a == b ) {
      print ( a ) ;
    }
    else if ( a == c || b == c ) {
      print ( c ) ;
    }
  }
}
