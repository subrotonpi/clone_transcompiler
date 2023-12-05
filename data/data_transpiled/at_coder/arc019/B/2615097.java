public static void input ( Scanner in ) {
  int n = in . nextInt ( ) ;
  if ( n == 1 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  int [ ] r = new int [ n ] ;
  in . nextInt ( ) ;
  int t = 0 ;
  for ( int i = 0 ;
  i < n . length / 2 ;
  i ++ ) {
    if ( n [ i ] != r [ i ] ) {
      t ++ ;
    }
  }
  switch ( t ) {
    case 0 : System . out . println ( 25 * 2 * ( n . length / 2 ) ) ;
    break ;
    case 1 : System . out . println ( 24 * 2 + 25 * ( n . length - 2 ) ) ;
    break ;
    default : System . out . println ( 25 * n . length ) ;
    break ;
  }
}
