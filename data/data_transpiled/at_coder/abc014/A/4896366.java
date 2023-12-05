public static int a ( ) {
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  return ( b - a % b != 0 ? a % b : 0 ) ;
}
