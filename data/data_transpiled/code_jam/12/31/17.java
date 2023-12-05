@ Test ( "A-large" ) public static void solve ( int N , int [ ] [ ] parents ) throws IOException {
  Scanner input = new Scanner ( new FileInputStream ( test + ".in" ) ) ;
  PrintWriter output = new PrintWriter ( test + ".out" ) ;
  int t ;
  int T = input . nextInt ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ancestors [ i ] = null ;
  }
  /* Calculate ancestors of the array */
  if ( ancestors [ t ] != null ) {
    return ancestors [ t ] ;
  }
  Set < Integer > a = new HashSet < Integer > ( ) ;
  for ( int p : parents [ t ] ) {
    a . addAll ( calculateAncestors ( p ) ) ;
  }
  a . addAll ( parents [ t ] ) ;
  ancestors [ t ] = a ;
  /* Calculate ancestors of the array */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    calculateAncestors ( i ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int sum = 0 ;
    for ( int p : parents [ i ] ) {
      sum += ancestors [ p ] . size ( ) + 1 ;
    }
    if ( sum != ancestors [ i ] . size ( ) ) {
      return ;
    }
  }
  /* Determine the number of parents */
  T = input . nextInt ( ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    N = Integer . parseInt ( input . nextLine ( ) ) ;
    parents = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int p = Integer . parseInt ( input . nextLine ( ) ) ;
      p = Integer . parseInt ( p ) ;
      parents [ i ] = p ;
    }
    if ( solve ( N , parents ) ) {
      print ( output , "Case #" + ( t + 1 ) + ": Yes" ) ;
    }
    else {
      print ( output , "Case #" + ( t + 1 ) + ": No" ) ;
    }
  }
}
