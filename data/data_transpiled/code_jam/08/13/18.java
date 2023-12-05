static final int N = Integer . parseInt ( input ) {
  int N = input . nextInt ( ) ;
  int n ;
  int res ;
  for ( int step = 0 ;
  step < N ;
  step ++ ) {
    n = input . nextInt ( ) ;
    res = 1 ;
    for ( int i = 0 ;
    i < k ;
    i ++ ) {
      res *= n - i ;
      res /= i + 1 ;
    }
  }
  return res ;
}
