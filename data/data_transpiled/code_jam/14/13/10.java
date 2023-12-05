static final Scanner in = new Scanner ( System . in ) {
  private final Iterator < String > fin = new Iterator < String > ( ) {
    private final int T = Integer . parseInt ( next ( ) ) ;
    private int N ;
    private final int [ ] perm ;
    @ Override public boolean hasNext ( ) {
      return ( T == N ) || ( T == N ) ;
    }
    @ Override public String next ( ) {
      N = Integer . parseInt ( next ( ) ) ;
      perm = ArrayUtil . toPrimitive ( next ( ) . split ( " " ) ) ;
      int cnt = 0 ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        if ( perm [ i ] > N ) {
          cnt ++ ;
        }
      }
      if ( cnt < 487 ) {
        System . out . println ( "Case #" + ( T + 1 ) + ": BAD" ) ;
      }
      else {
        System . out . println ( "Case #" + ( T + 1 ) + ": GOOD" ) ;
      }
      return true ;
    }
  }
}
