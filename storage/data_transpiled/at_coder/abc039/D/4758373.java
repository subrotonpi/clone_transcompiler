public static void print ( String input ) {
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  StringBuilder sb = new StringBuilder ( w + 2 ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) sb . append ( "#" ) ;
  sb . append ( input ) ;
  sb . append ( "#" ) ;
  String [ ] [ ] oldS = new String [ h + 2 ] [ w + 2 ] ;
  for ( int i = 1 ;
  i <= h ;
  i ++ ) for ( int j = 1 ;
  j <= 1 + w ;
  j ++ ) if ( sb . substring ( i - 1 , j - 1 , j + 2 ) . equals ( "###" ) && sb . substring ( i , j - 1 , j + 2 ) . equals ( "###" ) && sb . substring ( i + 1 , j - 1 , j + 2 ) . equals ( "###" ) ) oldS [ i ] [ j ] = "#" ;
  String [ ] [ ] newS = new String [ h + 2 ] [ w + 2 ] ;
  for ( int i = 1 ;
  i <= h ;
  i ++ ) for ( int j = 1 ;
  j <= 1 + w ;
  j ++ ) if ( oldS [ i ] [ j ] . equals ( "#" ) ) for ( int k = - 1 ;
  k <= 0 ;
  k ++ ) for ( int l = - 1 ;
  l <= 0 ;
  l ++ ) newS [ i + k ] [ j + l ] = "#" ;
  for ( int i = 1 ;
  i <= h ;
  i ++ ) if ( sb . substring ( newS [ i ] [ 1 ] , 1 + w ) . equals ( s [ i ] [ 1 ] ) ) {
    System . out . println ( "impossible" ) ;
    break ;
  }
  else {
    System . out . println ( "possible" ) ;
    for ( int i = 1 ;
    i <= h ;
    i ++ ) System . out . println ( sb . substring ( oldS [ i ] [ 1 ] , 1 + w ) ) ;
  }
}
