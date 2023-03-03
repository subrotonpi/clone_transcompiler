public static int x ( ) {
  int x = input . nextInt ( ) ;
  List < Integer > L = new ArrayList < Integer > ( ) ;
  L . add ( x ) ;
  int n = 1 ;
  while ( true ) {
    n ++ ;
    x = x % 2 != 0 ? 3 * x + 1 : x / 2 ;
    if ( L . contains ( x ) ) {
      System . out . println ( n ) ;
      break ;
    }
    else {
      L . add ( x ) ;
    }
  }
}
