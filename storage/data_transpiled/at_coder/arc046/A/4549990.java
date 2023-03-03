public static int N ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  return ( N % 9 == 0 ? '0' : String . valueOf ( N % 9 ) * ( N / 9 + 1 ) ) ;
}
