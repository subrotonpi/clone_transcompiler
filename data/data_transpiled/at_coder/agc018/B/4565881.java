static final Scanner getScanner ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int n = Integer . parseInt ( input ) ;
  final int m = Integer . parseInt ( input ) ;
  final Tuple [ ] a = new Tuple [ n ] ;
  final Tuple [ ] b = new Tuple [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = new Tuple ( Integer . parseInt ( input ) - 1 ) ;
    b [ i ] = a [ i ] . get ( 0 ) ;
  }
  final boolean [ ] used = new boolean [ m ] ;
  final int [ ] idx = new int [ n ] ;
  int res = n ;
  for ( int i = 0 ;
  i < m - 1 ;
  i ++ ) {
    final Counter ctr = new Counter ( b ) ;
    final Tuple d = ctr . getValue ( ) ;
    final int p = d . p ;
    final int num = d . num ;
    res = Math . min ( res , num ) ;
    used [ p ] = true ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      while ( used [ a [ j ] . get ( idx [ j ] ) ] ) {
        idx [ j ] = idx [ j ] + 1 ;
      }
      b [ j ] = a [ j ] . get ( idx [ j ] ) ;
    }
  }
  System . out . println ( res ) ;
}
