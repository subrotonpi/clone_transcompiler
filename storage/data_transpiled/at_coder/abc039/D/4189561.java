public static void print ( String input ) {
  int h = ( int ) input . length ( ) , w = ( int ) input . charAt ( 0 ) ;
  List < List < String >> l = new ArrayList < List < String >> ( ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) l . add ( Collections . singletonList ( input . charAt ( i ) ) ) ;
  String [ ] [ ] ans = new String [ h ] [ w ] ;
  String [ ] ans2 = new String [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) for ( int j = 0 ;
  j < w ;
  j ++ ) if ( l [ i ] [ j ] . equals ( "." ) ) for ( int dx = - 1 ;
  dx <= 0 && i + dx < w ;
  dx ++ ) for ( int dy = - 1 ;
  dy <= 0 && i + dy < h ;
  dy ++ ) if ( 0 <= j + dx && j + dx < w && 0 <= i + dy && ans [ i + dy ] [ j + dx ] . equals ( "#" ) ) ans [ i + dy ] [ j + dx ] = "." ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) for ( int j = 0 ;
  j < w ;
  j ++ ) for ( int dy = - 1 ;
  dy <= 0 && i + dy < h ;
  dy ++ ) for ( int dx = - 1 ;
  dx <= 0 && j + dx < w && ans [ i + dy ] [ j + dx ] . equals ( "#" ) ) ans2 [ i ] [ j ] = "#" ;
  if ( l == ans2 ) {
    System . out . println ( "possible" ) ;
    for ( int i = 0 ;
    i < ans . length ;
    i ++ ) System . out . println ( Arrays . toString ( ans [ i ] ) ) ;
  }
  else System . out . println ( "impossible" ) ;
}
