@ GwtIncompatible ( "java.util.Scanner" ) private static double [ ] [ ] solve ( ) {
  String s = System . getProperty ( "line.separator" ) ;
  /*if ((k < 0) || (k > n)) return 0;
  double t = 1;
  for (int x = 0; x < k; x++) {
  t = t*(n-x)/(x+1);
  }*/
  /*do a = new double[n+1][n+1];
  double den = 1.0/bin(n, c);
  for (int i = 0; i < n; i++) {
  for (int j = i; j < n; j++) {
  int k = j - i;
  a[i][j] = bin(n-i, k)*bin(i, c-k)*den;
  }
  double b = eye(n+1)-a;
  a = MatrixOps.dot(b, b);
  }
  return a;*/
  for ( int i = 1 ;
  i <= Integer . MAX_VALUE ;
  i ++ ) {
    s = System . getProperty ( "line.separator" ) ;
    Arrays . fill ( Ints . split ( s ) , Integer . parseInt ( i ) ) ;
    double [ ] [ ] solve = new double [ i ] [ 2 ] ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      solve [ i ] [ j ] = Integer . parseInt ( s . substring ( j , j + 1 ) ) ;
    }
    System . out . println ( String . format ( "Case #%d: %0.8f" , i , solve [ i ] [ j ] ) ) ;
  }
  return solve ;
}
