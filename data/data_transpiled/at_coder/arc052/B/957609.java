public static double [ ] [ ] getStdDev ( int N , int Q ) {
  int [ ] X = new int [ N ] ;
  int [ ] R = new int [ N ] ;
  int [ ] H = new int [ N ] ;
  double [ ] V = new double [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    R [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    H [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    V [ i ] = ( H [ i ] * R [ i ] * R [ i ] * 3.14159265 ) / 3 ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int A = Integer . parseInt ( input . nextLine ( ) ) ;
    int B = Integer . parseInt ( input . nextLine ( ) ) ;
    double s = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int a = H [ j ] - ( Math . min ( ( X [ j ] + H [ j ] ) , Math . max ( ( A ) , X [ j ] ) ) - X [ j ] ) ;
      int b = H [ j ] - ( Math . max ( ( X [ j ] + H [ j ] ) , Math . min ( ( B ) , H [ j ] + X [ j ] ) ) - X [ j ] ) ;
      double aH = a / H [ j ] ;
      double bH = b / H [ j ] ;
      double ans = V [ j ] * ( aH - bH ) * ( aH * aH + aH * bH + bH * bH ) ;
      s += ans ;
    }
    System . out . println ( s ) ;
  }
  return V ;
}
