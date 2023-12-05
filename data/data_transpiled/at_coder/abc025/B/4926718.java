public static int twinAndWatermellon ( int N , int A , int B , @ Nonnull String [ ] command ) {
  String WEST = "West" ;
  String EAST = "East" ;
  int x = 0 ;
  for ( int i = 0 ;
  i < command . length ;
  i ++ ) {
    String s = command [ i ] ;
    int d = command [ i ] . charAt ( 0 ) ;
    int dx = d ;
    if ( d < A ) dx = A ;
    else if ( B < d ) dx = B ;
    if ( s . equals ( WEST ) ) x -= dx ;
    else x += dx ;
  }
  String direction = "" ;
  if ( x < 0 ) direction = WEST ;
  else if ( x > 0 ) direction = EAST ;
  return direction + Math . abs ( x ) ;
}
if ( getClass ( ) . isEnum ( ) ) {
  int i = 0 ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  A = Integer . parseInt ( input . nextLine ( ) ) ;
  B = Integer . parseInt ( input . nextLine ( ) ) ;
  command = new String [ N ] ;
  for ( i = 0 ;
  i < command . length ;
  i ++ ) {
    String s = input . nextLine ( ) ;
    int d = command [ i ] . charAt ( 0 ) ;
    command [ i ] = new String ( s ) ;
  }
  int d = twinAndWatermellon ( N , A , B , command ) ;
  int x = twinAndWatermellon ( i , x ) ;
  if ( x == 0 ) System . out . println ( 0 ) ;
  else System . out . println ( d + " " + x ) ;
}
