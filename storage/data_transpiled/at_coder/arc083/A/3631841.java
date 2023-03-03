public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int E = Integer . parseInt ( input . nextLine ( ) ) ;
  int F = Integer . parseInt ( input . nextLine ( ) ) ;
  Set < Integer > waters = new HashSet < Integer > ( ) ;
  for ( int a = 0 ;
  a <= F ;
  a += 100 * A ) {
    for ( int b = 0 ;
    b <= F ;
    b += 100 * B ) {
      if ( a + b > F ) break ;
      waters . add ( a + b ) ;
    }
  }
  waters . remove ( 0 ) ;
  Set < Integer > sugars = new HashSet < Integer > ( ) ;
  for ( int w : waters ) {
    for ( int s : sugars ) {
      if ( w + s > F ) continue ;
      if ( E * w < s * 100 ) continue ;
      int r = s / ( w + s ) ;
      if ( r > bestR ) {
        bestR = r ;
        bestS = s ;
        bestW = w ;
      }
    }
  }
  return bestW + bestS ;
}
