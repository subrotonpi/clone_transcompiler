public static int a = Integer . parseInt ( input ) {
  int b = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int mx = Math . max ( a , b , c ) ;
  int mn = Math . min ( a , b , c ) ;
  if ( a == mx ) {
    System . out . println ( 1 ) ;
  }
  else if ( a == mn ) {
    System . out . println ( 3 ) ;
  }
  else {
    System . out . println ( 2 ) ;
  }
  if ( b == mx ) {
    System . out . println ( 1 ) ;
  }
  else if ( b == mn ) {
    System . out . println ( 3 ) ;
  }
  else {
    System . out . println ( 2 ) ;
  }
  if ( c == mx ) {
    System . out . println ( 1 ) ;
  }
  else if ( c == mn ) {
    System . out . println ( 3 ) ;
  }
  else {
    System . out . println ( 2 ) ;
  }
  return mx ;
}
