public static int H = Integer . parseInt ( input ) {
  int ans ;
  if ( H == 1 && W == 1 ) {
    ans = 0 ;
  }
  else if ( H == 1 ) {
    ans = W - 1 ;
  }
  else if ( W == 1 ) {
    ans = H - 1 ;
  }
  else {
    ans = ( H - 1 ) * W + H * ( W - 1 ) ;
  }
  return ans ;
}
