static final int input ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int x = 1 ;
  int num = Integer . SIZE - 2 ;
  if ( num % 2 == 0 ) {
    do {
      x = 2 * x ;
    }
    while ( x > n ) ;
    if ( x > n ) {
      System . out . println ( "Aoki" ) ;
      exit ( ) ;
    }
    x = 2 * x + 1 ;
    if ( x > n ) {
      System . out . println ( "Takahashi" ) ;
      exit ( ) ;
    }
  }
  else {
    do {
      x = 2 * x + 1 ;
    }
    while ( x > n ) ;
    if ( x > n ) {
      System . out . println ( "Aoki" ) ;
      exit ( ) ;
    }
    x = 2 * x ;
    if ( x > n ) {
      System . out . println ( "Takahashi" ) ;
      exit ( ) ;
    }
  }
  return x ;
}
