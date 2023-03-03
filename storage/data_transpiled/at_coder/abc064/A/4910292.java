public static String print ( ) {
  int r = Integer . parseInt ( input ( ) . split ( " " ) [ 0 ] ) ;
  int g = Integer . parseInt ( input ( ) . split ( " " ) [ 1 ] ) ;
  int b = Integer . parseInt ( input ( ) . split ( " " ) [ 2 ] ) ;
  String ans = ( r * 100 + g * 10 + b ) % 4 == 0 ? "YES" : "NO" ;
  return ans ;
}
