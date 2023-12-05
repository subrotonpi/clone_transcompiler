private static void input ( Scanner in ) {
  int n = in . nextInt ( ) , m = in . nextInt ( ) ;
  double [ ] [ ] d = new double [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = in . nextInt ( ) , b = in . nextInt ( ) ;
    a -- ;
    b -- ;
    d [ a ] [ b ] = 1 ;
    d [ b ] [ a ] = 1 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      for ( int k = 0 ;
      k < n ;
      k ++ ) {
        d [ i ] [ j ] = Math . min ( d [ i ] [ j ] , d [ i ] [ k ] + d [ k ] [ j ] ) ;
      }
    }
  }
  for ( int i = 0 ;
  i < d . length ;
  i ++ ) {
    System . out . println ( Math . max ( 0 , d [ i ] . count ( 2 ) - 1 ) ) ;
  }
}
