static final int [ ] G ( ) {
  int h = Integer . parseInt ( input . readLine ( ) ) , w = Integer . parseInt ( input . readLine ( ) ) , t = Integer . parseInt ( input . readLine ( ) ) ;
  String [ ] s = Arrays . stream ( input . split ( " " ) ) . map ( s :: trim ) . toArray ( ) ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    String si = s [ i ] ;
    for ( int j = 0 ;
    j < si . length ( ) ;
    j ++ ) {
      String sij = si . substring ( j , i + 1 ) ;
      if ( sij . equals ( "S" ) ) {
        S = i ;
      }
      else if ( sij . equals ( "G" ) ) {
        G = i ;
      }
    }
  }
  return new int [ ] {
    h , w , t }
    ;
  }
  