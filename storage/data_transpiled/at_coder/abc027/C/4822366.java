static final int input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int H = ( int ) Math . floor ( Math . log ( n ) ) + 1 ;
  int d = 1 ;
  int a = 1 ;
  while ( a <= n ) {
    d ++ ;
    a *= 2 ;
    if ( d % 2 != H % 2 ) {
      a ++ ;
    }
  }
  if ( d % 2 == 1 ) {
    System . out . println ( "Takahashi" ) ;
  }
  else {
    System . out . println ( "Aoki" ) ;
  }
  return d ;
}
