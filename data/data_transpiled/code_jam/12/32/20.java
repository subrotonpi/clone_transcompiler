static final Scanner in = new Scanner ( System . in ) {
  private double v0 ;
  private int T = Integer . parseInt ( in . nextLine ( ) ) ;
  for ( int tc = xrange ( 1 , T + 1 ) ;
  tc <= 0 ;
  tc ++ ) {
    System . out . printf ( "Case #%d:" , tc ) ;
    String [ ] l = in . nextLine ( ) . split ( " " ) ;
    double D = Double . parseDouble ( l [ 0 ] ) ;
    int N = Integer . parseInt ( l [ 1 ] ) , A = Integer . parseInt ( l [ 2 ] ) ;
    Object [ ] Nl = new Object [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      Nl [ i ] = new Object [ ] {
        Double . parseDouble ( in . nextLine ( ) ) }
        ;
      }
      Object [ ] Al = new Object [ ] {
        Double . parseDouble ( in . nextLine ( ) ) }
        ;
        if ( N == 1 ) {
          for ( double ai : Al ) {
            System . out . println ( Math . sqrt ( 2 * D / ai ) ) ;
          }
        }
        else if ( N == 2 ) {
          double v0 = ( Nl [ 1 ] . y - Nl [ 0 ] . y ) / ( Nl [ 1 ] . x - Nl [ 0 ] . x ) ;
          for ( double ai : Al ) {
            double tcar = ( D - Nl [ 0 ] . y ) / v0 ;
            System . out . println ( Math . max ( Math . sqrt ( 2 * D / ai ) , tcar ) ) ;
          }
        }
      }
      return new Scanner ( in ) ;
    }
    