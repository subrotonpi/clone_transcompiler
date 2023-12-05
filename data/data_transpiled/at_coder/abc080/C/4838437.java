public static double [ ] [ ] N = Integer . parseInt ( input ) {
  int [ ] [ ] F = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) F [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] P = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) P [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  double ans = - Double . MAX_VALUE ;
  for ( int i = 1 ;
  i <= 2 * 10 ;
  i ++ ) {
    double t = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int c = 0 ;
      for ( int k = 0 ;
      k < 10 ;
      k ++ ) c += ( ( i >> k ) & 1 ) & F [ j ] [ k ] ;
      t += P [ j ] [ c ] ;
    }
    ans = Math . max ( ans , t ) ;
  }
  System . out . println ( ans ) ;
  return F ;
}
