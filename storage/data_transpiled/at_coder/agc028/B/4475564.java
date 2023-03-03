public static int [ ] getN ( ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int mod = 10 * 9 + 7 ;
  BigInteger F = BigInteger . ONE ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) F = F . multiply ( i ) . mod ( mod ) ;
  int [ ] D = new int [ N + 1 ] ;
  D [ 0 ] = 0 ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) D [ i ] = D [ i - 1 ] + Math . pow ( i , mod - 2 ) ;
  int [ ] L = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) L [ i ] = i ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) L [ j ] = i ;
  return L ;
}
