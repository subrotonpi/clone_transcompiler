public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  HashMap < Integer , Boolean > R = new HashMap < Integer , Boolean > ( ) ;
  for ( int i = 0 ;
  i < B ;
  i ++ ) {
    R . put ( i , false ) ;
  }
  int X = 0 ;
  int r ;
  do {
    X += A ;
    r = X % B ;
  }
  while ( r == C ) ;
  if ( R . get ( r ) ) {
    System . out . println ( "YES" ) ;
    exit ( ) ;
  }
  if ( R . get ( r ) ) {
    System . out . println ( "NO" ) ;
    exit ( ) ;
  }
  R . put ( r , true ) ;
  return R . get ( r ) ;
}
