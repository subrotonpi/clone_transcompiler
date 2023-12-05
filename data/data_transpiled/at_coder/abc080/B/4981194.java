public static int n ( int num ) {
  int ret = 0 ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    ret += ( int ) ( ( num % ( 10 * ( i + 1 ) ) ) / ( 10 * i ) ) ;
  }
  return ret ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a % n ( a ) == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return a ;
}
