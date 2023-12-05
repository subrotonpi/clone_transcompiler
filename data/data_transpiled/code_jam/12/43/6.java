@ VisibleForTesting static final int MAX_HEIGHT = 1000000000 ;
final int N = 1 ;
final int T = 1 ;
final Scanner in = new Scanner ( System . in ) {
  @ Override public String nextLine ( ) {
    return "" ;
  }
  @ Override public String [ ] getInputWords ( ) {
    String line = IN . nextLine ( ) . trim ( ) . split ( " " ) ;
    return line . split ( " " ) ;
  }
  @ Override public int [ ] getInputInts ( ) {
    return ArrayUtil . toIntArray ( inputWords ) ;
  }
  @ Override public float [ ] getInputFloats ( ) {
    return ArrayUtil . toFloatArray ( inputWords ) ;
  }
  @ Override public String formatSequence ( String s , NumberFormat formatter ) {
    return Arrays . toString ( s ) ;
  }
  @ Override public String format ( ) {
    return " " + formatter . format ( s ) ;
  }
  @ Override public String solveOne ( ) {
    int N = in . nextInt ( ) ;
    int [ ] hi = ArrayHelper . intArrayListOf ( in . nextInt ( ) ) - 1 ;
    for ( int i = 0 ;
    i < hi . length ;
    i ++ ) {
      for ( int j = i + 1 ;
      j < hi [ i ] ;
      j ++ ) {
        if ( hi [ j ] > hi [ i ] ) {
          return "Impossible" ;
        }
      }
    }
    int [ ] result = new int [ hi . length + 1 ] ;
    int [ ] bounds = oneOf ( result ) * MAX_HEIGHT ;
    for ( int j = result . length - 1 ;
    j >= 0 ;
    j -- ) {
      if ( ! hi [ j ] ) {
        continue ;
      }
      result [ j ] = ( int ) bounds [ j ] - 1 ;
      if ( j < hi . length ) {
        for ( int m = hi [ j ] + 1 ;
        m < result . length ;
        m ++ ) {
          double slope = ( result [ m ] - result [ hi [ j ] ] ) / ( double ) ( m - hi [ j ] ) ;
          double targetHeight = result [ hi [ j ] ] - slope * ( hi [ j ] - j ) ;
          if ( targetHeight < result [ j ] ) {
            result [ j ] = Math . min ( result [ j ] , ( int ) ( targetHeight - 1 ) ) ;
          }
        }
      }
      for ( int i = 0 ;
      i < j ;
      i ++ ) {
        if ( hi [ i ] != j ) {
          continue ;
        }
        double slope = result [ j ]