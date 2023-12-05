public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A > B || B - A > N ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( 1 + ( N - 2 ) * ( B - A ) ) ;
  }
  return A ;
}
