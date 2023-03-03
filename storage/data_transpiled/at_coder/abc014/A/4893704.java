public static int a ( ) {
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  return ( a % b == 0 ) ? 0 : ( ( a / b ) + 1 ) * ( b - a ) ;
}
