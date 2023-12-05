public static int [ ] getNegativeInstances ( ) {
  int x = 0 ;
  int a = Integer . parseInt ( input . readLine ( ) ) ;
  int b = Integer . parseInt ( input . readLine ( ) ) ;
  if ( b <= a ) {
    System . out . println ( "delicious" ) ;
  }
  else if ( x >= b - a ) {
    System . out . println ( "safe" ) ;
  }
  else {
    System . out . println ( "dangerous" ) ;
  }
  return new int [ ] {
    x }
    ;
  }
  