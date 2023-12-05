public static int x1 = 0 , y1 = 0 , x2 = 0 , y2 = 0 ;
int W = Math . abs ( x1 - x2 ) , H = Math . abs ( y1 - y2 ) ;
boolean flipX = x1 > x2 ;
boolean flipY = y1 > y2 ;
int xo = Math . min ( x1 , x2 ) ;
int yo = Math . min ( y1 , y2 ) ;
int N = Integer . parseInt ( input ) ;
ArrayList < Point > F = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  int x = Integer . parseInt ( input ) , y = Integer . parseInt ( input ) ;
  x -= xo ;
  y -= yo ;
  if ( 0 <= x && x <= W && 0 <= y && y <= H ) {
    if ( flipX ) x = W - x ;
    if ( flipY ) y = H - y ;
    F . add ( new Point ( x , y ) ) ;
  }
}
N = F . size ( ) ;
@ SuppressWarnings ( "unused" ) int L = ( W + H ) * 100 ;
if ( ( W == 0 || H == 0 ) && F . size ( ) > 0 ) L += PI * 10 - 20 ;
else if ( N > 0 ) {
  Collections . sort ( F ) ;
  int [ ] array = F . toArray ( ) ;
  int [ ] dp = new int [ array . length ] ;
  for ( int i = 0 ;
  i < array . length ;
  i ++ ) dp [ i ] = H + 1 ;
  for ( int j = 0 ;
  j < array . length ;
  j ++ ) dp [ j ] = array [ j ] ;
  int n = Arrays . binarySearch ( dp , H ) ;
  L -= ( 20 - PI * 5 ) * n ;
  if ( n == Math . min ( W , H ) + 1 ) L += PI * 5 ;
}
System . out . println ( L ) ;
return L ;
}
