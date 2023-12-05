static final double asin ( double a ) {
  if ( a >= 1.0 ) return Math . PI / 2.0 ;
  if ( a <= - 1.0 ) return - Math . PI / 2.0 ;
  if ( Class . isPrimitive ( "java.util.logging.SimpleLog" ) ) {
    main ( System . in ) ;
  }
  else {
    int n = Integer . parseInt ( iScanner . nextLine ( ) ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      System . out . printf ( "Case #%s: %s%n" , i + 1 , foo ( iScanner ) ) ;
    }
  }
  if ( Class . isPrimitive ( "java.util.logging.SimpleLog" ) ) {
    main ( System . in ) ;
  }
  else {
    int n = Integer . parseInt ( iScanner . nextLine ( ) ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      System . out . printf ( "Case #%s: %s%n" , i + 1 , foo ( iScanner ) ) ;
    }
  }
  double [ ] p = new double [ n ] ;
  double [ ] q = new double [ n ] ;
  int i = 0 ;
  for ( ;
  i < n ;
  i ++ ) {
    double ab = dis ( p [ i ] , p [ i + 1 ] ) ;
    double ax = dis ( p [ i + 0 ] , q [ i + 1 ] ) ;
    double bx = dis ( p [ i + 1 ] , q [ i + 1 ] ) ;
    int dunjiao = 0 ;
    if ( ( ab * ab + ax * ax ) < bx * bx ) {
      return run ( p , 0 , q ) ;
    }
    if ( ( bx * bx + ab * ab ) < ax * ax ) {
      dunjiao = 1 ;
    }
    double p = ( ab + ax + bx ) / 2.0 ;
    double area = Math . sqrt ( p * ( p - ab ) * ( p - ax ) * ( p - bx ) ) ;
    double height = area / ab * 2.0 ;
    double angle1 = asin ( height / ax ) ;
    double angle2 = asin ( height / bx ) ;
    double res = 0.0 ;
    if ( ! dunjiao ) {
      double d1 = ax * ax * angle1 ;
      double d2 = bx * bx * angle2 / 2.0 ;
      res = d2 + area - d1 ;
      return bx * bx * Math . PI - res * 2 ;
    }
    