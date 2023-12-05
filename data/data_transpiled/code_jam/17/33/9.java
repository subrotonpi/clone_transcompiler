public static final void init ( ) throws IOException {
  System . setIn ( new FileInputStream ( "C-small-1-attempt0.in" ) ) ;
  System . setOut ( new FileOutputStream ( "C-small-1-attempt0.out" ) ) ;
  for ( int tc = 0 ;
  tc < Integer . parseInt ( input ( ) ) ;
  tc ++ ) {
    int n = Integer . parseInt ( input ( ) ) ;
    int k = Integer . parseInt ( input ( ) ) ;
    double u = Double . parseDouble ( input ( ) ) ;
    int [ ] a = new int [ k ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a [ i ] = i ;
    }
    Arrays . sort ( a ) ;
    Arrays . fill ( a , 1 ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      double mx = ( i + 1 ) * ( a [ i + 1 ] - a [ i ] ) ;
      double tar = 0 ;
      if ( u < mx ) {
        tar = a [ i ] + u / ( i + 1 ) ;
        for ( int j = 0 ;
        j < i + 1 ;
        j ++ ) a [ j ] = tar ;
        break ;
      }
      else {
        tar = a [ i + 1 ] ;
        for ( int j = 0 ;
        j < i + 1 ;
        j ++ ) a [ j ] = tar ;
        u = Math . max ( u - mx , 0 ) ;
      }
    }
    double r = 1 ;
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) r *= a [ i ] ;
    System . out . println ( "Case #" + ( tc + 1 ) + ": " + r + " " + ( r * ( u - mx ) ) ) ;
  }
}
