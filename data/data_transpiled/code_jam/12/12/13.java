public static String work ( int [ ] A , int [ ] B , int NL ) {
  int res = 0 ;
  int pts = 0 ;
  int [ ] S = new int [ NL ] ;
  int R2 = 0 ;
  boolean cont ;
  do {
    cont = true ;
    while ( cont ) {
      cont = false ;
      for ( int k = 0 ;
      k < NL ;
      k ++ ) {
        if ( S [ k ] < 2 && B [ k ] <= pts ) {
          cont = true ;
          pts += ( 2 - S [ k ] ) ;
          S [ k ] = 2 ;
          res ++ ;
          R2 ++ ;
          if ( R2 == NL ) return res ;
        }
      }
    }
    cont = false ;
    int [ ] Sel = new int [ NL ] ;
    for ( int k = 0 ;
    k < NL ;
    k ++ ) {
      Sel [ k ] = S [ k ] ;
    }
    if ( Sel . length == 0 ) return "Too Bad" ;
    int k = Collections . max ( Sel , new Comparator < Integer > ( ) {
      public int compare ( Integer i , Integer j ) {
        return B [ i ] ;
      }
    }
    ) ;
    pts ++ ;
    res ++ ;
    S [ k ] = 1 ;
  }
  while ( sc . hasNext ( ) ) ;
  int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int k = 1 ;
  k <= T ;
  k ++ ) {
    NL = Integer . parseInt ( scanner . nextLine ( ) ) ;
    A = new int [ NL ] ;
    B = new int [ NL ] ;
    for ( int i = 0 ;
    i < NL ;
    i ++ ) {
      A [ i ] = Integer . parseInt ( scanner . nextLine ( ) ) ;
      B [ i ] = Integer . parseInt ( scanner . nextLine ( ) ) ;
    }
    System . out . println ( "Case #" + k + ": " + work ( A , B , NL ) ) ;
  }
  return "" ;
}
