public static void a = 0 , b = 0 , c = 0 , x = 0 , y = 0 ;
int min_val = 2 * 30 ;
if ( x < y ) {
  int tmp = x ;
  x = y ;
  y = tmp ;
  tmp = a ;
  a = b ;
  b = tmp ;
}
for ( int i = x + 1 ;
i < y ;
i ++ ) {
  int k = ( x - i ) * 2 ;
  k = k < 0 ? 0 : k ;
  int j = y - ( k / 2 ) ;
  j = j < 0 ? 0 : j ;
  int val = i * a + j * b + k * c ;
  if ( val < min_val ) {
    min_val = val ;
  }
}
System . out . println ( min_val ) ;
}
