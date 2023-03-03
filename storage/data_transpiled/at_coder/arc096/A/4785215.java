public static int A = Integer . parseInt ( input ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  int best = 10 * 9 ;
  for ( int c = 0 ;
  c < Math . max ( X , Y ) ;
  c ++ ) {
    int a = X - c ;
    int b = Y - c ;
    if ( a < 0 ) a = 0 ;
    if ( b < 0 ) b = 0 ;
    int p = A * a + B * b + C * c * 2 ;
    if ( p < best ) best = p ;
  }
  return best ;
}
