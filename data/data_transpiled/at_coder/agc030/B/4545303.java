static final double [ ] [ ] input ( ) {
  final int L = Integer . parseInt ( input [ 0 ] ) ;
  final int N = Integer . parseInt ( input [ 1 ] ) ;
  final double [ ] X = new double [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = ( int ) input [ i ] ;
  }
  final double [ ] X2 = L - X ;
  final double [ ] Y1 = new double [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Y1 [ i ] = X [ i ] ;
  }
  final double [ ] Y2 = Y1 ;
  final double [ ] Z = new double [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Z [ i ] = Y2 [ i ] ;
  }
  /* Compute the sum of the values */
  final double [ ] [ ] mySum = new double [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    mySum [ i ] [ i ] = Y1 [ i ] ;
  }
  int len1 = Z [ N ] ;
  int len2 = Z [ N ] ;
  double [ ] x1 = X ;
  double [ ] x2 = X2 ;
  double ans = Math . max ( len1 , len2 ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    len1 += mySum [ i ] [ i ] ;
    len2 += mySum [ i ] [ i ] ;
    ans = Math . max ( ans , len1 , len2 ) ;
  }
  System . out . println ( ans ) ;
  return X ;
}
