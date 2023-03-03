public static List < Integer > get1D ( int H , int h ) {
  int [ ] ret = new int [ H + 1 ] ;
  for ( int s = 0 ;
  s < h ;
  s ++ ) {
    for ( int x = s , i = 0 ;
    x < H ;
    x += h ) {
      ret [ i ] = - x ;
    }
  }
  for ( int x = H , i = 0 ;
  x > - h ;
  x ++ , i ++ ) {
    ret [ i ] = x + 1 ;
  }
  return Arrays . asList ( ret ) ;
}
