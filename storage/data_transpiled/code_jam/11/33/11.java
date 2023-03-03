static final int [ ] solve ( int [ ] args ) {
  final int N = Integer . parseInt ( args [ 0 ] ) ;
  final int L = Integer . parseInt ( args [ 1 ] ) ;
  final int H = Integer . parseInt ( args [ 2 ] ) ;
  final int [ ] notes = new int [ N ] ;
  for ( int test : xrange ( 1 , T + 1 ) ) {
    N = Integer . parseInt ( args [ 0 ] ) ;
    L = Integer . parseInt ( args [ 1 ] ) ;
    H = Integer . parseInt ( args [ 2 ] ) ;
    notes [ test ] = N ;
  }
  int l = Stream . of ( notes ) . reduce ( gcd ) . get ( ) ;
  int h = Stream . of ( notes ) . reduce ( lcm ) . get ( ) ;
  System . out . println ( l + " " + h + " " + L + " " + H ) ;
  if ( l >= L && l <= H ) System . out . println ( "Case #" + test + ": " + l ) ;
  else if ( h >= L && h <= H ) System . out . println ( "Case #" + test + ": " + 'NO' ) ;
  return notes ;
}
