static final int MAX_LIMIT = 2000000 ;
int [ ] min_mapped = new int [ MAX_LIMIT + 1 ] ;
int n_min = n ;
String x = Integer . toString ( n ) ;
for ( int i : xrange ( 1 , x . length ( ) ) ) {
  x = x . substring ( 1 ) + x . charAt ( 0 ) ;
  if ( x . charAt ( 0 ) == '0' ) continue ;
  n_min = Math . min ( n_min , Integer . parseInt ( x ) ) ;
}
if ( __name__ . equals ( "java.util.Scanner" ) ) {
  int T = Integer . parseInt ( System . in . nextLine ( ) ) ;
  minMapped = new int [ MAX_LIMIT + 1 ] ;
  for ( int i : xrange ( 1 , MAX_LIMIT + 1 ) ) minMapped [ i ] = min_mapped [ i ] ;
  for ( int r = 0 ;
  r < T ;
  r ++ ) {
    int [ ] values = Integer . parseInt ( System . in . nextLine ( ) ) ;
    int A = values [ 0 ] ;
    int B = values [ 1 ] ;
    int [ ] cnMapped = new int [ B + 1 ] ;
    for ( int i : xrange ( A , B + 1 ) ) cnMapped [ minMapped [ i ] ] ++ ;
    int total = 0 ;
    for ( int i : xrange ( B + 1 ) ) if ( cnMapped [ i ] > 1 ) total += ( cnMapped [ i ] * ( cnMapped [ i ] - 1 ) ) / 2 ;
    System . out . println ( "Case #" + ( r + 1 ) + ": " + total ) ;
  }
}
