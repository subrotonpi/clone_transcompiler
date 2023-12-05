@ Sys public static void main ( String [ ] args ) {
  final int ntest = input . nextInt ( ) ;
  for ( int test = xrange ( ntest ) ;
  test < ntest ;
  test ++ ) {
    final int N = input . nextInt ( ) ;
    final ArrayList < Attack > attacks = new ArrayList < > ( ) ;
    for ( int i = xrange ( N ) ;
    i < N ;
    i ++ ) {
      int d = Integer . parseInt ( input . nextLine ( ) ) ;
      int n = Integer . parseInt ( input . nextLine ( ) ) ;
      int w = Integer . parseInt ( input . nextLine ( ) ) ;
      int e = Integer . parseInt ( input . nextLine ( ) ) ;
      int s = Integer . parseInt ( input . nextLine ( ) ) ;
      int delta_d = Integer . parseInt ( input . nextLine ( ) ) ;
      int delta_p = Integer . parseInt ( input . nextLine ( ) ) ;
      int delta_s = Integer . parseInt ( input . nextLine ( ) ) ;
      for ( int j = xrange ( n ) ;
      j < d ;
      j ++ ) {
        attacks . add ( new Attack ( d , w , e , s ) ) ;
        d += delta_d ;
        w += delta_p ;
        e += delta_p ;
        s += delta_s ;
      }
    }
    Collections . sort ( attacks ) ;
    final int [ ] newWall = new int [ 500 ] ;
    final int [ ] wall = new int [ 500 ] ;
    int day = 0 ;
    int result = 0 ;
    for ( int i = 0 ;
    i < attacks . size ( ) ;
    i ++ ) {
      int d = attacks . get ( i ) ;
      int w = attacks . get ( i ) ;
      int e = attacks . get ( i ) ;
      int s = attacks . get ( i ) ;
      if ( d > day ) {
        wall = newWall [ i ] ;
        day = d ;
      }
      if ( wall [ w + 250 ] < s ) {
        result ++ ;
        System . arraycopy ( wall , w + 250 , newWall , 0 , w ) ;
      }
    }
    System . out . println ( "Case #" + ( test + 1 ) + ": " + result ) ;
  }
}
