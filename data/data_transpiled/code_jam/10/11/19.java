public static String file = "A-large.in" ;
String [ ] lines = new String [ ] {
}
;
BufferedReader br = new BufferedReader ( new FileReader ( file ) ) ;
int no = 1 ;
int ll = 1 ;
while ( ll < lines . length ) {
  int len = Integer . parseInt ( lines [ ll ] ) ;
  String ret ;
  if ( red && blue ) {
    ret = "Both" ;
  }
  else if ( blue ) {
    ret = "Blue" ;
  }
  else {
    ret = "Neither" ;
  }
  System . out . format ( "Case #%d: %s" , no ++ , ret ) ;
}
int len = lines . length ;
String [ ] [ ] cells = new String [ len ] [ ] ;
for ( int i = 0 ;
i < len ;
i ++ ) {
  cells [ i ] = lines [ ll ] ;
  ll ++ ;
}
int [ ] [ ] newCells = new int [ len ] [ ] ;
int [ ] floors = new int [ len ] ;
for ( int i = 0 ;
i < len ;
i ++ ) {
  newCells [ i ] = new int [ 3 ] ;
  for ( int j = 0 ;
  j < len ;
  j ++ ) {
    newCells [ i ] [ j ] = null ;
  }
  floors [ 0 ] = floors [ 0 ] ;
  for ( int x = 0 ;
  x < len ;
  x ++ ) {
    for ( int y = 0 ;
    y < len ;
    y ++ ) {
      if ( cells [ x ] [ y ] != '.' ) {
        newCells [ len - floors [ x ] ] [ data [ 0 ] - x - 1 ] = cells [ x ] [ y ] ;
        floors [ x ] ++ ;
      }
    }
  }
  red = false ;
  blue = false ;
  for ( int x = 0 ;
  x < len ;
  x ++ ) {
    for ( int y = 0 ;
    y < len ;
    y ++ ) {
      if ( newCells [ x ] [ y ] == null ) continue ;
      boolean [ ] mode = new boolean [ 3 ] ;
      mode [ 0 ] = x <= len - data [ 1 ] ;
      mode [ 1 ] = y <= len - data [ 1 ] ;
      mode [ 2 ] = mode [ 0 ] && mode [ 1 ] ;
      mode [ 3 ] = mode [ 3 ] && mode [ 1 ] ;
      for ( int i = 0 ;
      i < len ;
      i ++ ) {
        if ( mode [ 0 ] && newCells