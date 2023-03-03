public static int check ( int q2 , int q3 , int q4 , int num ) {
  int ret = 0 ;
  int u4 = Math . min ( q4 , num ) ;
  ret += u4 * 4 ;
  num -= u4 ;
  int u3 = Math . min ( q3 , num ) ;
  ret += u3 * 3 ;
  num -= u3 ;
  int u2 = Math . min ( q2 , num ) ;
  ret += u2 * 2 ;
  num -= u2 ;
  if ( num > 0 ) {
    return 0 ;
  }
  return ret ;
}
