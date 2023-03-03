@ VisibleForTesting static int [ ] [ ] floydWarshall ( final int [ ] input ) {
  final int n = input . length ;
  final int m = input . length ;
  final double [ ] [ ] d = new double [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    d [ i ] [ 0 ] = Double . MAX_VALUE ;
  }
  final int [ ] s = new int [ m ] ;
  final int [ ] p = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = input [ i ] ;
    int b = input [ i ] ;
    int c = input [ i ] ;
    a -= 2 ;
    b -= 2 ;
    if ( a < 0 ) {
      s [ i ] = b ;
      p [ b ] = c ;
    }
    else {
      d [ a ] [ b ] = c ;
      d [ b ] [ a ] = c ;
    }
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    d [ i ] [ i ] = 0 ;
  }
  final int [ ] [ ] d = floydWarshall ( new CSGraph ( d , false , false ) ) ;
  int ans = Double . MAX_VALUE ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    final int j = s [ i ] ;
    final double x = d [ i ] [ j ] ;
    if ( x != Double . MAX_VALUE ) {
      ans = Math . min ( ( int ) x + p [ i ] + p [ j ] , ans ) ;
    }
  }
  if ( ans == Double . MIN_VALUE ) {
    System . out . println ( - 1 ) ;
  }
  else {
    System . out . println ( ans ) ;
  }
  return d ;
}
