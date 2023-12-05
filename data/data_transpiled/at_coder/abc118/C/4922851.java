public static int gcd ( int a , int b ) {
  if ( a >= b ) {
    if ( a % b == 0 ) {
      return b ;
    }
    else {
      return gcd ( a % b , b ) ;
    }
  }
  else {
    if ( b % a == 0 ) {
      return a ;
    }
    else {
      return gcd ( a , b % a ) ;
    }
  }
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] HP = new int [ N ] ;
  for ( int i = 0 ;
  i < HP . length ;
  i ++ ) {
    HP [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int ans = HP [ 0 ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    ans = gcd ( ans , HP [ i ] ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
