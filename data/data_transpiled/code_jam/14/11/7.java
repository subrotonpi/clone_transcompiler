@ Sys public static void main ( String [ ] args ) {
  int T = Integer . parseInt ( args [ 0 ] ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int N = Integer . parseInt ( args [ t ] ) ;
    int L = Integer . parseInt ( args [ t ] ) ;
    BitSet A = new BitSet ( N ) ;
    BitSet B = new BitSet ( L ) ;
    for ( int ch = 0 ;
    ch < N ;
    ch ++ ) {
      A . set ( ch ) ;
    }
    B . set ( lexsort ( B . T ) ) ;
    assert A . cardinality ( ) == N ;
    int fewestFlips = L + 1 ;
    for ( int n = 0 ;
    n < N ;
    n ++ ) {
      BitSet flips = new BitSet ( A . get ( 0 ) ) ;
      B . set ( n ) ;
      BitSet Af = new BitSet ( A . get ( n ) ) ;
      Af . set ( n ) ;
      Af . set ( n ) ;
      if ( ( Af . equals ( B ) ) && ( n < L ) ) fewestFlips = Math . min ( fewestFlips , flips . cardinality ( ) ) ;
    }
    System . out . println ( "Case #" + t + ":" ) ;
    if ( fewestFlips == L + 1 ) System . out . println ( "NOT POSSIBLE" ) ;
    else System . out . println ( fewestFlips ) ;
  }
}
