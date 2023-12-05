@ VisibleForTesting static final Reader < Fraction > reader = new Reader < Fraction > ( ) {
  @ Override public Fraction read ( BufferedReader inFile ) throws IOException {
    final String N = inFile . getWord ( ) ;
    final String F = inFile . getWord ( ) ;
    final int N = Integer . parseInt ( N ) ;
    final Fraction F = Fraction . valueOf ( F ) ;
    return new Fraction ( N , F , inFile . readLine ( ) ) ;
  }
  @ Override public Fraction solver ( final int N , final Fraction F , final String word ) throws IOException {
    final int [ ] t = new int [ N + 1 ] ;
    for ( int i : xrange ( N ) ) {
      t [ i + 1 ] = t [ i ] + Integer . parseInt ( word . charAt ( i ) ) ;
    }
    Fraction rec = new Fraction ( 2 , 0 ) ;
    for ( int j : xrange ( 1 , N + 1 ) ) {
      for ( int i : xrange ( j ) ) {
        final Fraction ratio = new Fraction ( t [ j ] - t [ i ] , j - i ) ;
        final Fraction scr = new Fraction ( Math . abs ( ratio . subtract ( F ) ) , i ) ;
        if ( scr . compareTo ( rec ) < 0 ) {
          rec = scr ;
        }
      }
    }
    return rec . getSecond ( ) ;
  }
}
