public static int judge ( int k ) {
  int r , nxt , prv ;
  int tr , tb , tx , ty ;
  tr = R - k ;
  tb = B - k ;
  tx = x - 1 ;
  ty = y - 1 ;
  return tr / tx + tb / ty >= k ? 1 : 0 ;
}
