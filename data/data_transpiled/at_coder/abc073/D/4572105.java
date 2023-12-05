@ Test public static void solve ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] rs = new int [ N ] [ R ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    rs [ i ] = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
  }
  double [ ] [ ] dist = new double [ M ] [ N ] , ans = new double [ M ] [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int v1 = Integer . parseInt ( input . nextLine ( ) ) ;
    int v2 = Integer . parseInt ( input . nextLine ( ) ) ;
    double d = Double . parseDouble ( input . nextLine ( ) ) ;
    dist [ v1 - 1 ] [ v2 - 1 ] = dist [ v2 - 1 ] [ v1 - 1 ] = d ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dist [ i ] [ i ] = 0 ;
  }
  for ( int k = 0 ;
  k < N ;
  k ++ ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        if ( dist [ i ] [ j ] > dist [ i ] [ k ] + dist [ k ] [ j ] ) {
          dist [ i ] [ j ] = dist [ i ] [ k ] + dist [ k ] [ j ] ;
        }
      }
    }
  }
  for ( int [ ] r : permutations ( rs ) ) {
    double t = 0 ;
    for ( int i = 0 ;
    i < R - 1 ;
    i ++ ) {
      t += dist [ r [ i ] ] [ r [ i + 1 ] ] ;
    }
    ans = Math . min ( t , ans ) ;
  }
  System . out . println ( ans ) ;
}
