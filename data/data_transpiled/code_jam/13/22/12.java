static final double solve ( int n , int x , int y ) {
  /* Compute the size of the number of numbers */
  int ncases = 2 * n * n - n ;
  /* Compute the coordinates */
  if ( x == 0 ) {
    return y / 2 + 1 ;
  }
  /* Compute the maximum of the number of numbers */
  if ( y == 0 ) {
    return y / 2 + 1 ;
  }
  /* Compute the maximum of the number of numbers */
  double [ ] [ ] p = new double [ 2 * level + 1 ] [ 2 * level + 1 ] ;
  p [ 0 ] [ 0 ] = 1.0 ;
  double s = 0.0 ;
  for ( int l : xrange ( 0 , 4 * level + 1 ) ) {
    for ( int x : xrange ( 0 , 2 * level + 1 ) ) {
      int y = l - x ;
      if ( y < 0 || y > 2 * level ) continue ;
      if ( x + y == rem && x >= h ) {
        s += p [ x ] [ y ] ;
      }
      if ( x < 2 * level && y < 2 * level ) {
        p [ x + 1 ] [ y ] += 0.5 * p [ x ] [ y ] ;
        p [ x ] [ y + 1 ] += 0.5 * p [ x ] [ y ] ;
      }
      else if ( x < 2 * level && y == 2 * level ) {
        p [ x + 1 ] [ y ] += p [ x ] [ y ] ;
      }
      else if ( x == 2 * level && y < 2 * level ) {
        p [ x ] [ y + 1 ] += p [ x ] [ y ] ;
      }
    }
  }
  /* Solve */
  int level = x ;
  int h = y ;
  if ( pyramidSize ( level ) + h > n ) return 0.0 ;
  if ( pyramidSize ( level + 1 ) <= n ) return 1.0 ;
  /* Solve */
  if ( __name__ == "java.awt.EventQueue" ) {
    int ncases = Integer . parseInt ( readLine ( ) ) ;
    for ( int ncase = 1 ;
    ncase <= ncases ;
    ncase ++ ) {
      int n = Integer . parseInt ( readLine ( ) ) ;
      int x = Integer . parseInt ( readLine ( ) ) ;
      int y = Integer . parseInt ( readLine ( ) ) ;
      System . out . println ( " Case