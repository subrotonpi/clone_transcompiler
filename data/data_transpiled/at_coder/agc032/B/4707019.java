public static int [ ] [ ] ls ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  ls = new int [ N + 1 ] [ ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) ls [ i ] = i ;
  final List < String [ ] > plist = Lists . newArrayList ( ) ;
  for ( String [ ] p : ls ) plist . add ( p ) ;
  ls = new int [ N ] [ ] ;
  int cnt = 0 ;
  int allPattern = plist . size ( ) ;
  int idxX ;
  if ( N % 2 == 0 ) {
    System . out . println ( allPattern - ( N / 2 ) ) ;
    idxX = N ;
  }
  else {
    System . out . println ( allPattern - ( N - 1 ) / 2 ) ;
    idxX = N - 1 ;
  }
  int idxY = 1 ;
  for ( String [ ] p : plist ) {
    if ( p [ 0 ] == idxY && p [ 1 ] == idxX ) {
      idxX = idxX - 1 ;
      idxY = idxY + 1 ;
    }
    else System . out . println ( p [ 0 ] + " " + p [ 1 ] ) ;
  }
  return ls . toArray ( new String [ cnt ] [ ] ) ;
}
