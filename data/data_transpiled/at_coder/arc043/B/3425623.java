static final Scanner getScanner ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] a = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = input . nextInt ( ) ;
  int [ ] prev = new int [ N + 1 ] ;
  int [ ] dp = new int [ N + 1 ] ;
  int mod = 10 * 9 + 7 ;
  for ( ;
  ;
  ) {
    for ( int i = 0 , n = a . length ;
    i < n ;
    i ++ ) {
      int j = a [ i ] ;
      dp [ j ] += prev [ i ] ;
    }
    dp = dp ;
    prev = dp ;
    dp = 0 ;
  }
  return new Scanner ( ) ;
}
