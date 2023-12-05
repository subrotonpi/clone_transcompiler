static final int [ ] getLevels ( ) {
  int [ ] th = {
    0 , 1 , 2 }
    ;
    {
      int [ ] counts = new int [ n ] ;
      for ( int r = 0 ;
      r < th . length ;
      r ++ ) {
        for ( int s = 0 ;
        s < th . length ;
        s ++ ) {
          counts [ new Integer ( th [ r ] ) . intValue ( ) ] = 0 ;
        }
      }
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        counts [ new Integer ( x % 3 ) . intValue ( ) ] ++ ;
        x = ( a * x + b ) % m ;
        y = ( c * y + d ) % m ;
      }
      return counts ;
    }
    private static double pocty ( double [ ] counts ) {
      double sum = 0 ;
      double dupl = 0 ;
      double trupl = 0 ;
      for ( int a = 0 ;
      a < th . length ;
      a ++ ) {
        for ( int b = 0 ;
        b < th . length ;
        b ++ ) {
          trupl += counts [ new Integer ( th [ a ] ) . intValue ( ) ] ++ ;
          dupl += counts [ new Integer ( th [ a ] ) . intValue ( ) ] * counts [ new Integer ( th [ b ] ) . intValue ( ) ] ;
          for ( int c = 0 ;
          c < th . length ;
          c ++ ) {
            for ( int d = 0 ;
            d < th . length ;
            d ++ ) {
              int e = ( 6 - a - c ) % 3 ;
              int f = ( 6 - b - d ) % 3 ;
              double poc = counts [ new Integer ( th [ a ] ) . intValue ( ) ] * counts [ new Integer ( th [ b ] ) . intValue ( ) ] * counts [ new Integer ( th [ c ] ) . intValue ( ) ] * counts [ new Integer ( e ) . intValue ( ) ] ;
              sum += poc ;
            }
          }
        }
      }
      return ( sum - 3 * dupl + 2 * trupl ) / 6 ;
    }
  }
  