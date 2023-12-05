public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int A = Integer . parseInt ( input ) ;
  int x = N % 500 ;
  if ( ( x <= A ) && ( x <= N ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
