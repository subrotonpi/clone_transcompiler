public static int y , m , d ;
int ans ;
ans = 0 ;
if ( m == 1 ) {
  y -= 1 ;
  m = 13 ;
}
else if ( m == 2 ) {
  y -= 1 ;
  m = 14 ;
}
ans = 365 * y + ( int ) ( y / 4 ) - ( int ) ( y / 100 ) + ( int ) ( y / 400 ) + ( int ) ( ( 306 * ( m + 1 ) ) / 10 ) + d - 429 ;
return ans ;
}
