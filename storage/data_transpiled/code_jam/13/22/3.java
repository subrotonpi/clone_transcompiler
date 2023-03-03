public static int calLayer ( int x , int y ) {
  if ( x == 0 && y == 0 ) {
    return 1 ;
  }
  if ( x == 0 ) {
    return ( y / 2 ) + 1 ;
  }
  int xx = x ;
  if ( xx < 0 ) {
    xx -= y ;
    xx = - xx ;
  }
  else {
    xx += y ;
  }
  return ( xx / 2 ) + 1 ;
  /* numlayer */
  int l = ( l * 2 - 1 ) * ( l * 2 ) / 2 ;
  HashMap < Integer , Integer > ctab = new HashMap < Integer , Integer > ( ) ;
  /* C */
  int n = 0 , x , y ;
  if ( ( n = ctab . containsKey ( new Integer ( x ) ) ) ) {
    return ctab . get ( new Integer ( x ) ) ;
  }
  if ( k == 0 ) {
    return 1 ;
  }
  if ( n < k ) {
    ctab . put ( new Integer ( n ) , 0 ) ;
    return 0 ;
  }
  int c1 = C ( n - 1 , k - 1 ) ;
  int c2 = C ( n - 1 , k ) ;
  int val = c1 + c2 ;
  ctab . put ( new Integer ( x ) , val ) ;
  return val ;
}
