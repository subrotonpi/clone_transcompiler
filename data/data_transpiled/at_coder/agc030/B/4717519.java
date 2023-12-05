public static int [ ] getStdOut ( ) {
  int L = Integer . parseInt ( input . readLine ( ) ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  int ans0 = X [ 0 ] ;
  int i = 0 ;
  int j = N - 1 ;
  int direc = 1 ;
  while ( i != j ) {
    direc *= - 1 ;
    ans0 += L + X [ i ] - X [ j ] ;
    if ( direc == - 1 ) i ++ ;
    else if ( direc == 1 ) j -- ;
  }
  int tmpAns ;
  int tmpAns = ans0 ;
  for ( int k = 0 ;
  k < N - 1 ;
  k ++ ) {
    tmpAns += - L - 2 * X [ k ] + X [ i ] + X [ j ] ;
    if ( i == j ) j ++ ;
    else i ++ ;
    ans0 = Math . max ( ans0 , tmpAns ) ;
  }
  int ans1 = L - X [ N - 1 ] ;
  i = 0 ;
  j = N - 1 ;
  direc = - 1 ;
  while ( i != j ) {
    direc *= - 1 ;
    ans1 += L + X [ i ] - X [ j ] ;
    if ( direc == - 1 ) i ++ ;
    else j -- ;
    ans1 = Math . max ( ans1 , tmpAns ) ;
  }
  return X ;
}
