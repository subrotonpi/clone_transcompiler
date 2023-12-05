public static final int [ ] getBit ( int size ) {
  int H = 0 ;
  int W = 0 ;
  int D = 0 ;
  int [ ] queries = new int [ size + 1 ] ;
  for ( int i = 0 ;
  i < queries . length ;
  i ++ ) {
    queries [ i ] = 0 ;
  }
  int [ ] ans = practicalSkillTest ( H , W , D , A , Q , queries ) ;
  for ( int a : ans ) {
    System . out . println ( a ) ;
  }
  return ans ;
}
