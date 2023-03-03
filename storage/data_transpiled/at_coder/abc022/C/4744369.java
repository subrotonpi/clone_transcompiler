static final String getStdOut ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int inf = 10 * 18 ;
  final int N = Integer . parseInt ( input ) ;
  final int M = Integer . parseInt ( input ) ;
  final List < Integer > uvl = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) uvl . add ( Integer . parseInt ( input ) ) ;
  final List < Integer > start = new ArrayList < > ( ) ;
  final int [ ] [ ] d = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) d [ i ] [ 0 ] = inf ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int ui = uvl . get ( i ) ;
    final int vi = uvl . get ( i ) ;
    if ( ui == 1 ) start . add ( vi ) ;
    else d [ i ] [ 0 ] = li ;
  }
  for ( int i = 1 ;
  i < N ;
  i ++ ) d [ i ] [ i ] = i ;
  return d [ N ] [ N ] ;
}
