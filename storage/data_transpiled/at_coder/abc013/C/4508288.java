static final double N = Double . parseDouble ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int E = Integer . parseInt ( input . nextLine ( ) ) ;
  boolean flag = false ;
  double ans = Double . POSITIVE_INFINITY ;
  for ( int x = 0 ;
  x < N ;
  x ++ ) {
    int ansx = - 1 ;
    int ansy = - 1 ;
    double y = Math . ceil ( ( - ( B + E ) * x / ( D + E ) ) + ( ( E * N - H ) / ( D + E ) ) ) ;
    if ( y != ( ( - ( B + E ) * x / ( D + E ) ) + ( ( E * N - H ) / ( D + E ) ) ) ) {
      if ( y <= 0 ) {
        ansy = 0 ;
        ansx = x ;
      }
      else {
        if ( x + y <= N ) {
          ansy = y ;
          ansx = x ;
        }
      }
    }
    else {
      if ( y <= 0 ) {
        ansy = 1 ;
        ansx = x ;
      }
      else {
        if ( x + y <= N - 1 ) {
          ansy = y + 1 ;
          ansx = x ;
        }
      }
    }
    if ( 0 <= ansx + ansy && 0 <= ansx && ansy <= N ) {
      if ( ans >= A * ansx + C * ansy ) {
        ans = A * ansx + C * ansy ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
