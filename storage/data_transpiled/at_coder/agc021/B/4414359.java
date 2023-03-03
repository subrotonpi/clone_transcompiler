@ Nullable public static Point andRange ( Point a , Point b ) {
  if ( a == new Point ( 0 , 0 ) || b == new Point ( 0 , 0 ) ) return new Point ( 0 , 0 ) ;
  if ( a == new Point ( 0 , 1 ) ) return b ;
  if ( b == new Point ( 0 , 1 ) ) return a ;
  if ( a . x > b . x ) a = b ;
  if ( b . y < a . y ) return b ;
  if ( b . x < a . y ) return new Point ( b . x , a . y ) ;
  if ( b . y < a . x + 1 ) return new Point ( 0 , 0 ) ;
  if ( b . y < a . y + 1 ) return new Point ( a . x , b . y - 1 ) ;
  return a ;
}
