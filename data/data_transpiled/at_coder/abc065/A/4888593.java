public static int x ( int a , int b ) {
  int x = 0 ;
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) {
    x = input . nextInt ( ) ;
    a = input . nextInt ( ) ;
    b = input . nextInt ( ) ;
    if ( ( a - b ) >= 0 ) {
      System . out . println ( "delicious" ) ;
    }
    else if ( ( b - a ) <= x ) {
      System . out . println ( "safe" ) ;
    }
    else {
      System . out . println ( "dangerous" ) ;
    }
  }
  return x ;
}
