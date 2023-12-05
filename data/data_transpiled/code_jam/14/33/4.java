public static int doit ( ) {
  final int N = input . nextInt ( ) ;
  final int M = input . nextInt ( ) ;
  final int K = input . nextInt ( ) ;
  if ( ( N < 3 ) || ( M < 3 ) ) return K ;
  if ( N > M ) ( N = M ) ;
  if ( N == 3 ) {
    if ( K <= 4 ) return K ;
    int maxsave = M - 2 ;
    int save = ( K - 2 ) / 3 ;
    if ( save > maxsave ) save = maxsave ;
    return K - save ;
  }
  if ( N == 4 ) {
    int maxsave = ( M - 2 ) * ( N - 2 ) ;
    int save ;
    if ( K < 5 ) save = 0 ;
    else if ( K < 8 ) save = 1 ;
    else if ( K < 10 ) save = 2 ;
    else if ( K < 12 ) save = 3 ;
    else if ( K < 14 ) save = 4 ;
    else if ( K < 16 ) save = 5 ;
    else save = 6 ;
    if ( save > maxsave ) save = maxsave ;
    return K - save ;
  }
  else {
    int save ;
    if ( K < 5 ) save = 0 ;
    else if ( K < 8 ) save = 1 ;
    else if ( K < 10 ) save = 2 ;
    else if ( K < 12 ) save = 3 ;
    else if ( K < 14 ) save = 4 ;
    else if ( K < 16 ) save = 5 ;
    else save = 6 ;
    if ( save > maxsave ) save = maxsave ;
    return K - save ;
  }
  int cases = input . nextInt ( ) ;
  for ( int case = 1 ;
  case <= cases ;
  case ++ ) {
    System . out . println ( "Case #" + case + ":" ) ;
    System . out . println ( doit ( ) ) ;
  }
  return cases ;
}
