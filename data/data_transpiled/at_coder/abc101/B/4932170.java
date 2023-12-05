public static int N ( ) {
  int S = 0 ;
  for ( String n : N ) {
    S += Integer . parseInt ( n ) ;
  }
  N = Integer . parseInt ( N ) ;
  if ( N % S == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return S ;
}
