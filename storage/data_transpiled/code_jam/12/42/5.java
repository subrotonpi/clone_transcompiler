@ GwtIncompatible ( "java.io.BufferedReader" ) private static final String [ ] inputWords ( ) throws IOException {
  return new String [ ] {
    "" }
    ;
    /* input words */
    @ Override public Iterable < Integer > inputInts ( ) throws IOException {
      return Arrays . asList ( inputInts ( ) ) ;
    }
    @ Override public Iterable < Double > inputDoubles ( ) {
      return Arrays . asList ( inputDoubles ( ) ) ;
    }
    @ Override public String formatSequence ( String s , NumberFormat formatter ) {
      return Arrays . toString ( s ) ;
    }
    /* solve one step */
    @ Override public String solve ( ) {
      int N = inputInts ( ) ;
      int W = inputInts ( ) ;
      int L = inputInts ( ) ;
      double [ ] r = new double [ N ] ;
      double [ ] x = new double [ N ] ;
      double [ ] y = new double [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        x [ i ] = formatter . format ( i ) ;
      }
      boolean flip = ( W < L ) ;
      if ( flip ) {
        L = W ;
        W = L ;
      }
      int [ ] ranks = new int [ N ] ;
      Arrays . sort ( r ) ;
      double trackX = - r [ ranks [ 0 ] ] ;
      double trackY = r [ ranks [ 0 ] ] ;
      double currentY = 0 ;
      for ( int i = 0 ;
      i < ranks . length ;
      i ++ ) {
        if ( trackX + r [ ranks [ i ] ] <= W ) {
          x [ ranks [ i ] ] = trackX + r [ ranks [ i ] ] ;
          trackX = trackX + 2 * r [ ranks [ i ] ] ;
          y [ ranks [ i ] ] = currentY ;
        }
        else {
          x [ ranks [ i ] ] = 0 ;
          trackX = r [ ranks [ i ] ] ;
          currentY = trackY + r [ ranks [ i ] ] ;
          if ( currentY > L ) throw new RuntimeException ( "bad news" ) ;
          trackY = trackY + 2 * r [ ranks [ i ] ] ;
          y [ ranks [ i ] ] = currentY ;
        }
      }
      if ( flip ) {
        x [ ranks . length - 1 ] = y [ ranks . length - 1 ] ;
      }
      double [ ] result = new double [ 2 * N ] ;
      System . arraycopy ( x , 0 , result , 0 , 2 ) ;
      result [ N -