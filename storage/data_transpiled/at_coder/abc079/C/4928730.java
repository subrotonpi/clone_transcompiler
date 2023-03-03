public static void dfs ( int depth , String op ) {
  if ( depth == 3 ) {
    String res = A + op . charAt ( 0 ) + B + op . charAt ( 1 ) + C + op . charAt ( 2 ) + D ;
    if ( new Integer ( res ) == 7 ) return ;
  }
}
