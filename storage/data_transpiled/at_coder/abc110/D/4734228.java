public static int n , m = Integer . parseInt ( input ) {
  for ( int i = 2 ;
  i < n ;
  i ++ ) {
    if ( n % i == 0 ) {
      return 0 ;
    }
  }
  return 1 ;
}
{
  int [ ] l = new int [ n + 1 ] ;
  for ( int i = 2 ;
  i < n ;
  i ++ ) {
    l [ i ] = 1 ;
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( l [ i ] == 1 ) {
      for ( int j = 2 * ( i + 2 ) ;
      j <= n ;
      j += i + 2 ) {
        l [ j - 2 ] = 0 ;
      }
    }
  }
  int [ ] l1 = new int [ n - 1 ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( l [ i ] == 1 ) {
      l1 [ i + 2 ] = 0 ;
    }
  }
  return l1 ;
}
private static int modpow ( int a , int n , int p ) {
  int res = 1 ;
  while ( n > 0 ) {
    if ( n & 1 ) {
      res = res * a % p ;
    }
    a = a * a % p ;
    n >>= 1 ;
  }
  return res ;
}
public static int modpow ( int a , int n , int p ) {
  int res = 1 ;
  while ( n > 0 ) {
    if ( n & 1 ) {
      res = res * a % p ;
    }
    a = a * a % p ;
    n >>= 1 ;
  }
  return res ;
}
public static int mod ( int n ) {
  int n_fac = 1 ;
  int [ ] fac_l = new int [ n + 1 ] ;
  int d_max = Math . max ( d . values ( ) . length , n ) ;
  for ( int i = n + d_max - 1 ;
  i < n ;
  i ++ ) {
    n_fac *= i + 1 ;
    n_fac = n_fac % mod ;
    fac_l [ n ] = n_fac ;
  }
  int [ ] fac_1_l = new int [ n + d_max ] ;
  for ( int i = n + d_max ;
  i < fac_1_l . length ;
  i ++ ) {
    fac_1_l [ i ] = modpow ( fac_l [ i ] , mod - 2 , mod ) ;
  }
  int w = 1 ;
  for ( int dv : d . values ( ) ) {
    w *= fac_l [ n +