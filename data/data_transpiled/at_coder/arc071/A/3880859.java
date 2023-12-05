public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] S = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S [ i ] = input . nextInt ( ) ;
  }
  TreeSet < Integer > anSet = new TreeSet < Integer > ( S [ 0 ] ) ;
  for ( int k = 1 ;
  k < N ;
  k ++ ) {
    TreeSet < Integer > newSet = new TreeSet < Integer > ( ) ;
    TreeSet < Integer > checkSet = new TreeSet < Integer > ( S [ k ] ) ;
    int start = - 1 ;
    for ( int i = 0 ;
    i < anSet . size ( ) ;
    i ++ ) {
      int j = start ;
      while ( j != checkSet . size ( ) - 1 ) {
        j ++ ;
        if ( anSet . get ( i ) == checkSet . get ( j ) ) {
          newSet . add ( anSet . get ( i ) ) ;
          start = j ;
          break ;
        }
      }
    }
    anSet = newSet ;
  }
  System . out . println ( anSet . toString ( ) ) ;
}
