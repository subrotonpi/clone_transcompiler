public static final Function < GATKRead , String > reader = new Function < GATKRead , String > ( ) {
  @ Override public String apply ( GATKRead inFile ) {
    return copyOf ( inFile . getInts ( ) ) ;
  }
  @ Override public String apply ( final int N , final int p ) {
    final boolean [ ] wins = new boolean [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      wins [ i ] = ( ( ( p - 1 ) >> i ) & 1 ) == 0 ;
    }
    return wins [ p ] ? "" : "" ;
  }
}
