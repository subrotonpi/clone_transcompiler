static final int [ ] [ ] dfs ( int start , int dest , int pre , int [ ] [ ] d ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = input . nextInt ( ) ;
  final int [ ] [ ] d = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( d [ start ] [ i ] > 0 && i != pre ) {
      int c = dfs ( i , dest , start , d ) ;
      if ( c > 0 ) {
        return d [ start ] [ i ] + dfs ( i , dest , start , d ) ;
      }
    }
  }
  return d ;
}
