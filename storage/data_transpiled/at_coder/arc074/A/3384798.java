public static int input ( ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) , w = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans_min = 10 * 10 ;
  int sa , sb , sc ;
  if ( h % 3 == 0 || w % 3 == 0 ) {
    ans_min = 0 ;
  }
  else {
    for ( int a = 0 ;
    a < w + 1 ;
    a ++ ) {
      sa = h * a ;
      if ( h % 2 == 0 ) {
        sb = ( w - a ) * ( h / 2 ) ;
        sc = ( w - a ) * ( h / 2 ) ;
      }
      else {
        sb = ( w - a ) * ( h / 2 + 1 ) ;
        sc = ( w - a ) * ( h / 2 ) ;
      }
    }
  }
  return ans_min ;
}
