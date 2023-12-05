@ VisibleForTesting static int [ ] binarySearch ( ) {
  /* inpl */
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] W = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) W [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = N / 2 ;
  int B = N - A ;
  int [ ] C = new int [ A ] ;
  int [ ] D = new int [ B ] ;
  for ( int i = 0 ;
  i < 2 * A ;
  i ++ ) C [ i ] = Integer . parseInt ( W [ a ] * ( i >> a & 1 ) ) ;
  for ( int j = 0 ;
  j < 2 * B ;
  j ++ ) D [ j ] = Integer . parseInt ( W [ b + A ] * ( j >> b & 1 ) ) ;
  int ans = 0 ;
  Arrays . sort ( C ) ;
  Arrays . sort ( D ) ;
  for ( int c : C ) ans += binarySearch ( X - c ) - binarySearch ( D , X - c ) ;
  System . out . println ( ans ) ;
  return C ;
}
