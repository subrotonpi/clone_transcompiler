public static int input ( ) {
  int d = Integer . parseInt ( input . readLine ( ) ) , g = Integer . parseInt ( input . readLine ( ) ) ;
  List < Integer > [ ] p = new List [ d ] ;
  for ( int i = 0 ;
  i < 1 << d ;
  i ++ ) p [ i ] = new List < Integer > ( ) ;
  for ( int i = 0 ;
  i < d ;
  i ++ ) p [ i ] . add ( new Integer ( i ) ) ;
  int ans = 1000 ;
  for ( int i = 0 ;
  i < 1 << d ;
  i ++ ) {
    int score = 0 ;
    int num = 0 ;
    int remainMax = - 1 ;
    for ( int j = 0 ;
    j < d ;
    j ++ ) {
      if ( i >> j & 1 ) {
        score += p [ j ] . get ( ) * 100 * ( j + 1 ) + p [ j ] . get ( ) ;
        num += p [ j ] . get ( ) ;
      }
      else remainMax = j ;
    }
    if ( score < g ) {
      int remain = 100 * ( remainMax + 1 ) ;
      int need = - ( - ( g - score ) / remain ) ;
      if ( need >= p [ remainMax ] . get ( ) ) continue ;
      num += need ;
    }
    ans = Math . min ( ans , num ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
