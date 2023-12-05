public static int W = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] src = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) src [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  HashMap < Integer , Integer > mem = new HashMap < Integer , Integer > ( ) ;
  /* opt */
  int x1 = 0 ;
  int y1 = 0 ;
  int x2 = 0 ;
  int y2 = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = src [ i ] ;
    int y = src [ i ] ;
    if ( ! ( x1 <= x && x <= x2 ) || ! ( y1 <= y && y <= y2 ) ) continue ;
    int tmp = ( x2 - x1 + 1 ) + ( y2 - y1 + 1 ) - 1 ;
    tmp += opt ( x1 , y1 , x - 1 , y - 1 ) ;
    tmp += opt ( x + 1 , y1 , x2 , y - 1 ) ;
    tmp += opt ( x + 1 , y + 1 , x2 , y2 ) ;
    ret = Math . max ( ret , tmp ) ;
  }
  System . out . println ( mem . get ( ) ) ;
}
