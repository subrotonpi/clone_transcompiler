public static final Function < GF , Iterable < GF >> reader = new Function < GF , Iterable < GF >> ( ) {
  @ Override public Iterable < GF > apply ( final GF inFile ) {
    return FluentIterable . from ( inFile . getInts ( ) ) ;
  }
  @ Override public Iterable < GF > apply ( final GF solver ) {
    return new Iterable < GF > ( ) {
      @ Override public Iterator < GF > iterator ( ) {
        return new Iterator < GF > ( ) {
          private final int [ ] a = new int [ N ] ;
          private final int [ ] s = new int [ N + 1 ] ;
          private int [ ] s = new int [ N + 1 ] ;
          @ Override public boolean hasNext ( ) {
            return s [ 0 ] < s . length ;
          }
          @ Override public GF next ( ) {
            s [ 0 ] = s [ 0 ] + a [ 0 ] ;
          }
          @ Override public void remove ( ) {
            throw new UnsupportedOperationException ( ) ;
          }
        }
        ;
      }
    }
    ;
  }
  @ Override public Iterable < GF > apply ( final GF input ) {
    return new Iterable < GF > ( ) {
      @ Override public Iterator < GF > iterator ( ) {
        return new Iterator < GF > ( ) {
          private int [ ] a = new int [ N ] ;
          private int [ ] s = new int [ N + 1 ] ;
          @ Override public boolean hasNext ( ) {
            return s [ 0 ] < s . length ;
          }
          @ Override public GF next ( ) {
            int [ ] s = new int [ N ] ;
            for ( int i = 1 ;
            i < s . length ;
            i ++ ) {
              s [ i ] = s [ i - 1 ] + a [ i - 1 ] ;
            }
            int smallenough = 0 ;
            int total = s [ s . length - 1 ] ;
            int toobig = total + 1 ;
            while ( smallenough + 1 < toobig ) {
              int mid = ( smallenough + toobig ) / 2 ;
              int solveig = total - mid ;
              int a0 = 0 ;
              int a1 = N + 1 ;
              while ( a0 + 1 < a1 ) {
                int a2 = ( a0 + a1 ) / 2 ;
                if ( s [ a2 ] <= solveig ) {
                  a0 = a2 ;
                }
                else {
                  a1 = a2 ;
                }
              }
              int b0 = N ;
              int b1 = - 1 ;
              while ( b1 + 1 < b0 ) {
                int b2 = ( b0 + b1 ) /