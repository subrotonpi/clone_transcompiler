public static String bCard ( int X , int Y , String W , String [ ] [ ] C ) {
  int h = Y - 1 , w = X - 1 ;
  int dw ;
  int dh ;
  if ( W . contains ( "R" ) ) dw = 1 ;
  else if ( W . contains ( "L" ) ) dw = - 1 ;
  else dw = 0 ;
  if ( W . contains ( "U" ) ) dh = - 1 ;
  else if ( W . contains ( "D" ) ) dh = 1 ;
  else dh = 0 ;
  StringBuffer ans = new StringBuffer ( ) ;
  for ( int k = 0 ;
  k < 4 ;
  k ++ ) {
    ans . append ( C [ h ] [ w ] ) ;
    boolean isChanged = false ;
    int nh = h + dh , nw = w + dw ;
    moveTmp = new StringBuffer ( ) ;
  }
  return ans . toString ( ) ;
}
