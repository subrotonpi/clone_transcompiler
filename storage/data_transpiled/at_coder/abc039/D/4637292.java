public static String [ ] [ ] [ ] getStrings ( int h , int w ) {
  int [ ] [ ] s = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) s [ i ] = new String [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) s [ i ] [ i ] = new String ( input . nextLine ( ) ) ;
  String [ ] [ ] t = new String [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) t [ i ] = new String [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) t [ i ] [ i ] = new String [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) for ( int j = 0 ;
  j < w ;
  j ++ ) if ( s [ i ] [ j ] . equals ( "." ) ) for ( int x = Math . max ( 0 , i - 1 ) ;
  x < Math . min ( h , i + 2 ) ;
  x ++ ) for ( int y = Math . max ( 0 , j - 1 ) ;
  y < Math . min ( w , j + 2 ) ;
  y ++ ) t [ x ] [ y ] = "." ;
  String [ ] [ ] u = new String [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) u [ i ] = new String [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) u [ i ] [ j ] = new String [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) for ( int j = 0 ;
  j < w ;
  j ++ ) if ( t [ i ] [ j ] . equals ( "#" ) ) for ( int x = Math . max ( 0 , i - 1 ) ;
  x < Math . min ( h , i + 2 ) ;
  x ++ ) for ( int y = Math . max ( 0 , j - 1 ) ;
  y < Math . min ( w , j + 2 ) ;
  y ++ ) u [ x ] [ y ] = "#" ;
  if ( s == u ) {
    System . out . println ( "possible" ) ;
    for ( int i = 0 ;
    i < h ;
    i ++ ) System . out . println (