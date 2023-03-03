public static int a ( ) {
  int A = Integer . parseInt ( input ) ;
  int B = Integer . parseInt ( input ) ;
  int C = Integer . parseInt ( input ) ;
  if ( A < B && B < C ) {
    System . out . println ( 3 ) ;
    System . out . println ( 2 ) ;
    System . out . println ( 1 ) ;
  }
  else if ( A < C && C < B ) {
    System . out . println ( 3 ) ;
    System . out . println ( 1 ) ;
    System . out . println ( 2 ) ;
  }
  else if ( B < A && C < B ) {
    System . out . println ( 2 ) ;
    System . out . println ( 3 ) ;
    System . out . println ( 1 ) ;
  }
  else if ( B < C && C < A ) {
    System . out . println ( 1 ) ;
    System . out . println ( 3 ) ;
    System . out . println ( 2 ) ;
  }
  else if ( C < B && C < A ) {
    System . out . println ( 1 ) ;
    System . out . println ( 2 ) ;
    System . out . println ( 3 ) ;
  }
  else if ( C < A && B < C ) {
    System . out . println ( 2 ) ;
    System . out . println ( 1 ) ;
    System . out . println ( 3 ) ;
  }
  else if ( C < A && C < B ) {
    System . out . println ( 2 ) ;
    System . out . println ( 1 ) ;
    System . out . println ( 3 ) ;
  }
  else if ( C < A && C < B ) {
    System . out . println ( 2 ) ;
    System . out . println ( 1 ) ;
    System . out . println ( 3 ) ;
  }
  else if ( C < A && C < B ) {
    System . out . println ( 2 ) ;
    System . out . println ( 1 ) ;
    System . out . println ( 3 ) ;
  }
  else if ( C < A && B < C ) {
    System . out . println ( 2 ) ;
    System . out . println ( 1 ) ;
    System . out . println ( 3 ) ;
  }
  else if ( C < A && C < B ) {
    System . out . println ( 2 ) ;
    System . out . println ( 1 ) ;
    System . out . println ( 3 ) ;
  }
  else if ( C < A && C > B ) {
    System . out . println ( 2 ) ;
    System . out . println ( 1 ) ;
  }
  return A ;
  