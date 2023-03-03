static final String print ( String input ) {
  final int N = Integer . parseInt ( input ) ;
  final int M = Integer . parseInt ( input ) ;
  final int [ ] a = new int [ M ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  Arrays . sort ( a ) ;
  final Set < Integer > b = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( ! a [ i ] . equals ( b . remove ( i ) ) ) {
      System . out . println ( a [ i ] ) ;
      b . add ( a [ i ] ) ;
    }
  }
  if ( b . size ( ) < N ) {
    final Set < Integer > d = new HashSet < Integer > ( ) ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      d . add ( i ) ;
    }
    for ( int i : new ArrayList < Integer > ( Collections . list ( d ) ) ) {
      System . out . println ( i ) ;
    }
  }
  return input ;
}
