public static final Scanner getScanner ( ) throws IOException {
  final Scanner in = new Scanner ( System . in ) ;
  final int numCases = Integer . parseInt ( in . nextLine ( ) ) ;
  for ( int testCase = xrange ( 1 , numCases + 1 ) ;
  testCase <= numCases ;
  testCase ++ ) {
    final String [ ] vals = in . nextLine ( ) . split ( " " ) ;
    final double fly_r = Double . parseDouble ( vals [ 0 ] ) , outer_r = Double . parseDouble ( vals [ 1 ] ) , thickness = Double . parseDouble ( vals [ 2 ] ) , string_r = Double . parseDouble ( vals [ 3 ] ) , gap = Double . parseDouble ( vals [ 4 ] ) ;
    final double outer_r2 = outer_r * outer_r ;
    final double total_area = PI * outer_r2 / 4.0 ;
    final double rim_hit2 = Math . pow ( outer_r - thickness - fly_r , 2 ) ;
    final double space = gap + 2 * string_r ;
    double x = string_r + fly_r ;
    final double eff_gap = gap - 2 * fly_r ;
    if ( eff_gap <= 0 ) {
      System . out . println ( "Case #" + testCase + ": 1.000000" ) ;
      continue ;
    }
    final double interval = eff_gap / 200 ;
    double holes = 0.0 ;
    while ( x < outer_r - fly_r - thickness ) {
      double y = string_r + fly_r ;
      while ( y < outer_r - fly_r - thickness ) {
        final double irad = x * x + y * y ;
        if ( irad < rim_hit2 ) {
          final double orad = ( x + eff_gap ) * ( x + eff_gap ) + ( y + eff_gap ) * ( y + eff_gap ) ;
          if ( orad <= rim_hit2 ) {
            holes += eff_gap * eff_gap ;
          }
          else {
            final double ymax = y + eff_gap ;
            double xcurr = x + interval / 2.0 ;
            while ( xcurr < x + eff_gap && xcurr < outer_r - fly_r - thickness ) {
              final double ycalc = Math . sqrt ( rim_hit2 - xcurr * xcurr ) ;
              if ( ycalc < ymax ) {
                if ( ycalc > y ) holes += interval * ( ycalc - y ) ;
              }
              else {
                holes += interval * eff_gap ;
              }
              xcurr += interval ;
            }
          }
        }
        y +=