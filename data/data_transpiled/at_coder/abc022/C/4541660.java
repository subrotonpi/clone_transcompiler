@ VisibleForTesting static int [ ] [ ] floydWarshall ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] [ ] d = new double [ n ] [ n ] ;
  int [ ] [ ] L = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    d [ i ] [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( a == 1 ) {
      L [ i ] [ b ] = l ;
    }
    else {
      d [ a - 1 ] [ b - 1 ] = l ;
      d [ b - 1 ] [ a - 1 ] = l ;
    }
  }
  d = floydWarshall ( d ) ;
  double ans = Double . MIN_VALUE ;
  for ( int i = 0 ;
  i < L . length - 1 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < L . length ;
    j ++ ) {
      ans = Math . min ( ans , L [ i ] [ 2 ] + L [ j ] [ 2 ] + d [ L [ i ] [ 1 ] - 1 ] [ L [ j ] [ 1 ] - 1 ] ) ;
    }
  }
  if ( ans == Double . MIN_VALUE ) {
    System . out . println ( - 1 ) ;
  }
  else {
    System . out . println ( ( int ) ans ) ;
  }
  return L ;
}
