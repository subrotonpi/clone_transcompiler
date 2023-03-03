public static char [ ] [ ] input ( ) {
  char a , b ;
  a = input . charAt ( 0 ) ;
  b = input . charAt ( 1 ) ;
  if ( ( a == 'H' && b == 'H' ) || ( a == 'D' && b == 'D' ) ) {
    System . out . println ( 'H' ) ;
  }
  else {
    System . out . println ( 'D' ) ;
  }
  return new char [ ] [ ] {
    a , b }
    ;
  }
  