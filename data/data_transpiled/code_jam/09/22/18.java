static final HeapPriorityQueue < String > _main = new HeapPriorityQueue < String > ( ) {
  private static final long serialVersionUID = 1L ;
  @ Override public String toString ( ) {
    return "Problem B Case " + ( caseNum + 1 ) ;
  }
  @ Override public String [ ] toArray ( String [ ] args ) {
    return new String [ args . length ] ;
  }
  @ Override public String solve ( ) {
    String [ ] rawChars = new String [ args . length ] ;
    System . arraycopy ( args , 0 , rawChars , 0 , args . length ) ;
    List < String > sorted = new ArrayList < String > ( Arrays . asList ( rawChars ) ) ;
    Collections . sort ( sorted ) ;
    Collections . reverse ( sorted ) ;
    if ( Collections . singletonList ( Arrays . asList ( args ) ) . equals ( sorted ) ) {
      rawChars = new String [ args . length ] ;
      System . arraycopy ( args , 0 , rawChars , 0 , args . length ) ;
    }
    for ( int i = xrange ( rawChars . length - 1 , 0 , - 1 ) ;
    i >= 0 ;
    i -- ) {
      if ( rawChars [ i - 1 ] . compareTo ( rawChars [ i ] ) < 0 ) {
        StringBuilder result = new StringBuilder ( ) ;
        char smallestLarger = 'A' ;
        int smallestBiggerIndex = - 1 ;
        for ( int x : xrange ( i , rawChars . length ) ) {
          if ( rawChars [ x ] . compareTo ( rawChars [ i - 1 ] ) > 0 && rawChars [ x ] . compareTo ( smallestLarger ) < 0 ) {
            smallestLarger = rawChars [ x ] ;
            smallestBiggerIndex = x ;
          }
        }
        System . arraycopy ( rawChars , smallestBiggerIndex , result . length ( ) , smallestLarger , 0 , i ) ;
        StringBuilder remainder = new StringBuilder ( ) ;
        remainder . append ( rawChars , i - 1 , rawChars [ i ] . length ( ) ) ;
        Arrays . sort ( remainder ) ;
        result = result . append ( remainder ) ;
        return result . toString ( ) ;
      }
    }
    return new String [ ] {
      "Problem B Case " + ( caseNum + 1 ) }
      ;
    }
  }
  