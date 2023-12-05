static final Scanner in = new Scanner ( System . in ) {
  int c = 0 ;
  double phi = ( 1 + 5 * .5 ) / 2 ;
  String line ;
  int tot ;
  while ( ( line = in . nextLine ( ) ) != null ) {
    if ( ( c != 0 ) && ( c < 1 ) ) {
      tot = 0 ;
      int [ ] strline = new int [ 4 ] ;
      for ( int i = 0 ;
      i < strline . length ;
      i ++ ) strline [ i ] = Integer . parseInt ( line . trim ( ) ) ;
      final int A1 = strline [ 0 ] ;
      final int A2 = strline [ 1 ] ;
      final int B1 = strline [ 2 ] ;
      final int B2 = strline [ 3 ] ;
      for ( int a = A1 ;
      a <= A2 ;
      a ++ ) {
        double phihigh = Math . ceil ( phi * a ) ;
        double philow = Math . floor ( a / phi ) ;
        tot += Math . max ( 0 , Math . min ( philow , B2 ) - B1 + 1 ) ;
        tot += Math . max ( 0 , B2 - Math . max ( B1 , phihigh ) + 1 ) ;
      }
      System . out . println ( "Case #" + c + ": " + tot ) ;
    }
    c ++ ;
  }
  return new Scanner ( System . in ) ;
}
