public static Solver < Integer > solve ( ) {
  @ SuppressWarnings ( "resource" ) Scanner in = new Scanner ( System . in ) ;
  data = new HashMap < Integer , Integer > ( ) ;
  Solver < Integer > solver = new Solver < Integer > ( ) {
    @ Override public void setup ( final Scanner in ) {
      super . setup ( in ) ;
      this . tc = tc ;
      this . I = I = CollectionUtils . parseInt ( in . next ( ) . split ( " " ) ) ;
    }
    @ Override public String solve ( ) {
      final int [ ] S = this . I . toArray ( ) ;
      final Map < Integer , Integer > seen = new HashMap < Integer , Integer > ( ) ;
      for ( int n : xrange ( 1 , 4 ) ) {
        for ( int s : it . combinations ( S , n ) ) {
          final int ss = Integer . valueOf ( s ) ;
          if ( seen . containsKey ( ss ) ) {
            return "Case #" + this . tc + ":\n" + Arrays . toString ( s ) + "\n" + seen . get ( ss ) + "\n" ;
          }
          seen . put ( ss , s ) ;
        }
      }
      return "Case #" + this . tc + ": Impossible\n" ;
    }
  }
  ;
  if ( className . equals ( Solver . class . getName ( ) ) ) {
    final int T = Integer . parseInt ( in . nextLine ( ) ) ;
    solver . setup ( in ) ;
    for ( int t : xrange ( 1 , T + 1 ) ) System . out . print ( new Solver < Integer > ( in , t ) . solve ( ) ) ;
  }
  return solver ;
}
