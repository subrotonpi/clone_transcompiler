public static double readDouble ( int test ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  X = Math . abs ( X ) ;
  int n = 1 ;
  int t = 1 ;
  int w = 0 ;
  do {
    t += 4 ;
    if ( n + t > N ) break ;
    n += t ;
    w ++ ;
  }
  while ( true ) ;
  t = t / 2 ;
  double ans ;
  if ( ( X + Y ) / 2 <= w ) ans = 1.0 ;
  else if ( ( X + Y ) / 2 >= w + 2 ) ans = 0.0 ;
  else {
    N -= n ;
    double [ ] T = new double [ N ] ;
    T [ 0 ] = 1.0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      double [ ] P = T ;
      Arrays . fill ( P , 0.0 ) ;
      for ( int j = 0 ;
      j < t + 1 ;
      j ++ ) {
        if ( j == t ) T [ j ] += P [ j ] ;
        else if ( i - j == t ) T [ j + 1 ] += P [ j ] ;
        else {
          T [ j ] += P [ j ] / 2 ;
          T [ j + 1 ] += P [ j ] / 2 ;
        }
      }
    }
    ans = Double . valueOf ( T [ Y + 1 ] ) . doubleValue ( ) ;
  }
  System . out . println ( "Case #" + ( test + 1 ) + ": " + ans + " " ) ;
  return ans ;
}
