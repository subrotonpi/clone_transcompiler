public static int n ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  n -= ( a + b ) * ( n / ( a + b ) ) ;
  if ( n == 0 ) {
    System . out . println ( "Bug" ) ;
  }
  else {
    n -= a ;
    if ( n > 0 ) {
      System . out . println ( "Bug" ) ;
    }
    else {
      System . out . println ( "Ant" ) ;
    }
  }
  return n ;
}
