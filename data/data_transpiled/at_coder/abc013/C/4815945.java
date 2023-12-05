public static int N = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int E = Integer . parseInt ( input . nextLine ( ) ) ;
  final int a ;
  for ( int X = 0 ;
  X < N + 1 ;
  X ++ ) {
    if ( X == 0 ) {
      if ( ( ( N - X ) * E - H - B * X ) >= 0 ) {
        a = A * X + C * ( ( ( ( N - X ) * E - H - B * X ) / ( D + E ) ) + 1 ) ;
      }
      else {
        a = 0 ;
      }
    }
    else {
      if ( ( ( N - X ) * E - H - B * X ) >= 0 ) {
        a = Math . min ( a , A * X ) ;
      }
    }
  }
  System . out . println ( a ) ;
  return a ;
}
