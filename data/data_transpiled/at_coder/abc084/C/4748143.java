public static int [ ] getDigits ( ) {
  int [ ] C = new int [ N ] ;
  int [ ] S = new int [ N ] ;
  int [ ] F = new int [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    int f = Integer . parseInt ( input . nextLine ( ) ) ;
    C [ i ] = c ;
    S [ i ] = s ;
    F [ i ] = f ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int t = 0 ;
    for ( int j = i ;
    j < N - 1 ;
    j ++ ) {
      if ( t <= S [ j ] ) t = S [ j ] ;
      else t = ( t / F [ j ] + ( t % F [ j ] > 0 ? 1 : 0 ) ) * F [ j ] ;
      t += C [ j ] ;
    }
    System . out . println ( t ) ;
  }
  return C ;
}
