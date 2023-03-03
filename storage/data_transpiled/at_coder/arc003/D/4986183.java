static final long print ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  @ SuppressWarnings ( "unused" ) final long start = System . currentTimeMillis ( ) ;
  final int n = Integer . parseInt ( input ) ;
  final int m = Integer . parseInt ( input ) ;
  final int k = Integer . parseInt ( input ) ;
  final int [ ] AB = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) AB [ i ] = Integer . parseInt ( input ) ;
  return start + n ;
}
