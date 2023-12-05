public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int W ;
  if ( A == B ) {
    if ( N % ( A + 1 ) == 0 ) W = 0 ;
    else W = 1 ;
  }
  else W = 1 ;
  return W ;
}
