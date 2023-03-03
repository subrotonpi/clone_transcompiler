static final Scanner getScanner ( ) throws IOException {
  final Scanner fin = new Scanner ( System . in ) ;
  final int T = Integer . parseInt ( fin . nextLine ( ) ) ;
  return new Scanner ( fin ) {
    private final BitSet prev = new BitSet ( ) ;
    private final BitSet b = new BitSet ( ) ;
    @ Override public boolean happy ( int x , int b ) {
      BitSet prev = b ;
      prev . clear ( 0 ) ;
      do {
        int v = 0 ;
        while ( x > 0 ) {
          v += ( x % b ) * ( x % b ) ;
          x = x / b ;
        }
        if ( v == 1 ) return true ;
        if ( prev . get ( v ) ) return false ;
        prev . set ( v ) ;
        x = v ;
      }
      while ( true ) ;
      return true ;
    }
    @ Override public int next ( int t ) {
      int [ ] bases = Arrays . stream ( fin . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
      int m = 2 ;
      while ( true ) {
        if ( Arrays . binarySearch ( bases , b ) >= 0 ) break ;
        m ++ ;
      }
      System . out . println ( "Case #" + t + ": " + m ) ;
      return true ;
    }
  }
  ;
}
