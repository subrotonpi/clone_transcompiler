public static void solve ( int test ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int p = Integer . parseInt ( input . nextLine ( ) ) ;
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] D = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    D [ i ] = ( i * p + q ) % r + s ;
  }
  int S = Integer . parseInt ( D [ 0 ] ) ;
  double ans = S ;
  int A = 0 , B = 0 , C = S ;
  int a = 0 ;
  int b = - 1 ;
  while ( b < N - 1 ) {
    b ++ ;
    C -= D [ b ] ;
    B += D [ b ] ;
    p = Math . max ( A , B , C ) ;
    while ( a < b ) {
      B -= D [ a ] ;
      A += D [ a ] ;
      a ++ ;
      int t = Math . max ( A , B , C ) ;
      if ( t >= p ) {
        a -- ;
        B += D [ a ] ;
        A -= D [ a ] ;
        break ;
      }
      p = t ;
    }
    ans = Math . min ( ans , p ) ;
  }
  ans = ( double ) ( S - ans ) / S ;
  System . out . println ( "Case #" + ( test + 1 ) + ": " + ans + " " + " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -