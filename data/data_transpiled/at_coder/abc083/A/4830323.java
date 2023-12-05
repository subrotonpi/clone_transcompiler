public static int [ ] getBalanced ( ) {
  int a = Integer . parseInt ( input . readLine ( ) ) ;
  int b = Integer . parseInt ( input . readLine ( ) ) ;
  int c = Integer . parseInt ( input . readLine ( ) ) ;
  int d = Integer . parseInt ( input . readLine ( ) ) ;
  if ( a + b > c + d ) {
    System . out . println ( "Left" ) ;
  }
  else if ( a + b < c + d ) {
    System . out . println ( "Right" ) ;
  }
  else {
    System . out . println ( "Balanced" ) ;
  }
  return new int [ ] {
    a , b , c , d }
    ;
  }
  