public static Solver < Double > solve ( ) {
  @ SuppressWarnings ( "resource" ) Scanner in = new Scanner ( System . in ) ;
  data = new HashMap < > ( ) ;
  Solver < Double > solver = new Solver < > ( ) {
    @ Override public void setup ( ) {
      super . setup ( ) ;
    }
    @ Override public void init ( ) {
      super . init ( ) ;
      this . tc = tc ;
      this . I = I = map . get ( in . next ( ) ) ;
    }
    @ Override public String solve ( ) {
      List < Double > JJ = J = this . I . get ( 1 ) ;
      double X = ( double ) Math . pow ( J . size ( ) , 2 ) ;
      List < Double > win = new ArrayList < > ( ) ;
      int lw = - 1 ;
      while ( win . size ( ) > lw ) {
        lw = win . size ( ) ;
        win . addAll ( Arrays . asList ( J ) ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
        win . remove ( 0 ) ;
      }
      Map < Double , Double > res = new HashMap < > ( win . size ( ) ) ;
      for ( Double w : win ) res . put ( w , 0d ) ;
      for ( Double j : J ) res . put ( j , ( ( X + Math . pow ( J . size ( ) , 2 ) ) / J . size ( ) - j ) / X * 100. ) ;
      return "Case #" + solver . getName ( ) + ": " + res .