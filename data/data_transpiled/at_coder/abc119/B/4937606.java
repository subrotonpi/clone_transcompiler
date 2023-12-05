public static double [ ] getDoubleArray ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] x = new double [ n ] ;
  double [ ] u = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String [ ] xu = new String [ ] {
      input . nextLine ( ) }
      ;
      x [ i ] = Double . parseDouble ( xu [ 0 ] ) ;
      String mon = xu [ 1 ] ;
      if ( mon . equals ( "JPY" ) ) u [ 0 ] = 1 ;
      else u [ 0 ] = 380000 ;
    }
    double s = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) s = s + x [ i ] * u [ i ] ;
    return s ;
  }
  