public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int A = Integer . parseInt ( input ) ;
  int num = N % 500 ;
  if ( ( num <= A ) && ( num <= N ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
