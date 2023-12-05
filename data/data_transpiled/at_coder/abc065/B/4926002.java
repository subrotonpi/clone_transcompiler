public static void main ( Scanner input ) {
  int n = input . nextInt ( ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = input . nextInt ( ) ;
  }
  int count = 0 ;
  int i = 0 ;
  while ( count <= 10e+5 ) {
    count ++ ;
    if ( a [ i ] == 2 ) {
      System . out . println ( count ) ;
      break ;
    }
    else {
      i = a [ i ] - 1 ;
    }
  }
  else {
    System . out . println ( - 1 ) ;
  }
}
