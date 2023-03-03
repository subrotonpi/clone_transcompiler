public static int [ ] N = Integer . parseInt ( input ) {
  int [ ] temp = new int [ 6 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double maxTmp = Double . parseDouble ( input . nextLine ( ) ) , minTmp = Double . parseDouble ( input . nextLine ( ) ) ;
    if ( maxTmp >= 35 ) {
      temp [ 0 ] ++ ;
    }
    else if ( 30 <= maxTmp && maxTmp < 35 ) {
      temp [ 1 ] ++ ;
    }
    else if ( 25 <= maxTmp && maxTmp < 30 ) {
      temp [ 2 ] ++ ;
    }
    if ( minTmp >= 25 ) {
      temp [ 3 ] ++ ;
    }
  }
  return temp ;
}
