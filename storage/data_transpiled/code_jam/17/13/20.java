public static int getnba ( int a , int b , int h ) {
  int nb = 0 ;
  int na = ( h + a - 1 ) / a ;
  int minna = nb ;
  int minnb = na ;
  if ( b == 0 ) {
    return minnb + minna ;
  }
  while ( a <= h ) {
    nb ++ ;
    a += b ;
    na = ( h + a - 1 ) / a ;
    if ( nb + na < minna + minnb ) {
      minnb = nb ;
      minna = na ;
    }
  }
  return minnb + minna ;
}
