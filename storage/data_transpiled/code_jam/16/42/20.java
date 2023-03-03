public static double [ ] [ ] prob = new double [ n + 1 ] [ n + 1 ] ;
double [ ] [ ] dp = new double [ n + 1 ] [ n + 1 ] ;
int i , j , n = 0 ;
for ( i = 0 ;
i < n ;
i ++ ) {
  if ( i < 0 ) {
    if ( j > 0 || j < 0 ) {
      return 0.0 ;
    }
    else {
      return 1.0 ;
    }
  }
  if ( j < 0 ) {
    return 0.0 ;
  }
  if ( dp [ i ] [ j ] < 0 ) {
    dp [ i ] [ j ] = dp [ i ] [ j ] = dp [ i ] [ j ] * ( 1 - prob [ i ] ) ;
    dp [ i ] [ j ] += dp [ i ] [ j ] * prob [ i ] ;
  }
  i = i ;
}
int t = input . nextInt ( ) ;
for ( int tcase = 1 ;
tcase <= t ;
tcase ++ ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  k = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] ar = new double [ n ] ;
  for ( int x = 0 ;
  x < n ;
  x ++ ) {
    ar [ x ] = Double . parseDouble ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( ar ) ;
  double res = 0.0 ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    prob = new double [ n ] ;
    for ( j = i ;
    j < n ;
    j ++ ) {
      for ( j = 0 ;
      j < i ;
      j ++ ) {
        prob [ j ] [ j ] = ar [ j ] ;
      }
    }
    dp [ i ] = new double [ n + 1 ] ;
    for ( int i1 = 0 ;
    i1 < n ;
    i1 ++ ) {
      for ( int j1 = 0 ;
      j1 < n ;
      j1 ++ ) {
        dp [ i ] [ i1 ] = - 1 ;
      }
    }
    res = Math . max ( res , dp [ i ] [ j ] ) ;
  }
  System . out . println ( "Case #" + tcase + ": " + 0.9 lf ) ;
}
