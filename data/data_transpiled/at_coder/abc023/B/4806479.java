public static int N = Integer . parseInt ( input ) {
  String S = input . nextLine ( ) ;
  int c = 0 ;
  String x = "b" ;
  if ( x . equals ( S ) ) {
    System . out . println ( c ) ;
    exit ( ) ;
  }
  int f = 1 ;
  for ( int i = 0 ;
  i < 100 ;
  i ++ ) {
    switch ( f ) {
      case 1 : x = "a" + x + "c" ;
      f = 2 ;
      break ;
      case 2 : x = "c" + x + "a" ;
      f = 3 ;
      break ;
      case 3 : x = "b" + x + "b" ;
      f = 1 ;
    }
    c ++ ;
    if ( x . equals ( S ) ) {
      System . out . println ( c ) ;
      exit ( ) ;
    }
  }
  System . out . println ( - 1 ) ;
  return c ;
}
