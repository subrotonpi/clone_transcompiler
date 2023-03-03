public static int N ( Scanner input ) {
  int M = input . nextInt ( ) ;
  int [ ] nums = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int j = input . nextInt ( ) ;
    int k = input . nextInt ( ) ;
    nums [ i ] = j ;
    nums [ i ] = k ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( nums [ i ] + 1 ) ;
  }
  return N ;
}
