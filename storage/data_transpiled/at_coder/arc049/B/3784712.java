public static int iipt = lambda : Integer . parseInt ( input ) ;
Miipt miipt = lambda : Lists . newArrayList ( ) ;
int n = iipt . nextInt ( ) ;
int [ ] x = new int [ 1123 ] ;
int [ ] y = new int [ 1123 ] ;
int [ ] c = new int [ 1123 ] ;
for ( int i = 0 ;
i < n ;
i ++ ) x [ i ] = miipt . nextInt ( ) ;
int tx = 0 ;
int ty = 0 ;
int p = 0 ;
int q = 212345678 ;
for ( int i = 0 ;
i < 64 ;
i ++ ) {
  int r = ( p + q ) / 2 ;
  int x1 = - 112345 ;
  int x2 = 112345 ;
  int y1 = - 112345 ;
  int y2 = 112345 ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    x1 = Math . max ( x1 , x [ j ] - r / c [ j ] ) ;
    x2 = Math . min ( x2 , x [ j ] + r / c [ j ] ) ;
    y1 = Math . max ( y1 , y [ j ] - r / c [ j ] ) ;
    y2 = Math . min ( y2 , y [ j ] + r / c [ j ] ) ;
  }
  if ( x1 < x2 && y1 < y2 ) q = r ;
  else p = r ;
}
System . out . println ( r ) ;
return 0 ;
}
