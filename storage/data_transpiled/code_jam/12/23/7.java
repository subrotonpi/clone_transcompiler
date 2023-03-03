static void go ( ) {
  final Scanner in = new Scanner ( System . in ) ;
  for ( int tc = 1 ;
  tc <= input . nextInt ( ) ;
  tc ++ ) {
    final int N = 500 ;
    System . out . println ( "Case #" + tc + ":" ) ;
    final Map < Integer , Integer > m = new HashMap < > ( ) ;
    final int [ ] S = map ( in . nextLine ( ) . split ( " " ) ) ;
    Arrays . sort ( S ) ;
    final Map < Integer , Integer > A = new HashMap < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      A . put ( 2 * i , i ) ;
    }
    int s1 = 1 ;
    int sm = S [ 0 ] ;
    synchronized ( A ) {
      while ( true ) {
        int rn = A . get ( ) ;
        if ( s1 & ( 1 << rn ) ) sm -= S [ rn ] ;
        else sm += S [ rn ] ;
      }
    }
  }
}
