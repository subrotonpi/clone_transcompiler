@ MoreRequires public static void main ( String [ ] args ) {
  int N = ( Integer ) input . nextInt ( ) ;
  int M = ( Integer ) input . nextInt ( ) ;
  double [ ] [ ] d = new double [ N ] [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    d [ i ] [ 0 ] = 1e10 ;
  }
  int [ ] a = new int [ N ] ;
  int [ ] b = new int [ N ] ;
  int [ ] c = new int [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int ai = ( Integer ) input . nextInt ( ) ;
    int bi = ( Integer ) input . nextInt ( ) ;
    int ci = ( Integer ) input . nextInt ( ) ;
    d [ ai - 1 ] [ bi - 1 ] = ci ;
    d [ bi - 1 ] [ ai - 1 ] = ci ;
    a [ i ] = ai - 1 ;
    b [ i ] = bi - 1 ;
    c [ i ] = ci ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    d [ i ] [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      for ( int k = 0 ;
      k < N ;
      k ++ ) {
        d [ j ] [ k ] = Math . min ( d [ j ] [ i ] + d [ i ] [ k ] , d [ j ] [ k ] ) ;
      }
    }
  }
  int ans = M ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    boolean isShortest = false ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( ( d [ j ] [ a [ i ] ] + c [ i ] ) == d [ j ] [ b [ i ] ] ) {
        isShortest = true ;
      }
    }
    if ( isShortest ) {
      ans -- ;
    }
  }
  System . out . println ( ans ) ;
}
