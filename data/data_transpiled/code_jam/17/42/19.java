public static void for ( int t = 0 ;
t < Integer . parseInt ( input ) ;
t ++ ) {
  int n = ( Integer . parseInt ( input . readLine ( ) ) ) ;
  int c = ( Integer . parseInt ( input . readLine ( ) ) ) ;
  int m = ( Integer . parseInt ( input . readLine ( ) ) ) ;
  int [ ] [ ] raw = new int [ n ] [ c ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int p = ( Integer . parseInt ( input . readLine ( ) ) ) ;
    int b = ( Integer . parseInt ( input . readLine ( ) ) ) ;
    raw [ p - 1 ] [ b - 1 ] ++ ;
  }
  int [ ] to = new int [ n ] ;
  int max = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int tp = 0 ;
    for ( int j = 0 ;
    j < c ;
    j ++ ) {
      to [ i ] += raw [ i ] [ j ] ;
      if ( i != 0 ) raw [ i ] [ j ] = raw [ i ] [ j ] + raw [ i - 1 ] [ j ] ;
      if ( raw [ i ] [ j ] > max ) max = raw [ i ] [ j ] ;
      tp += raw [ i ] [ j ] ;
    }
    int avg = ( tp - 1 ) / ( i + 1 ) + 1 ;
    if ( avg > max ) max = avg ;
  }
  int p = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( to [ i ] > max ) p += to [ i ] - max ;
  }
  System . out . println ( "Case #" + ( t + 1 ) + ": " + max + " " + p ) ;
}
