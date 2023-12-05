public static int M = 10 * 9 + 7 ;
int [ ] inv = new int [ 2020 + 1 ] ;
for ( int i = 2 ;
i <= 2020 ;
i ++ ) {
  inv [ i ] = inv [ M % i ] * ( M - M / i ) % M ;
}
{
  int r = 0 ;
  int c = 1 ;
  int c2 = 1 ;
  for ( int i = 1 ;
  i <= k ;
  i ++ ) {
    c *= n + 1 - i ;
    c %= M ;
    c *= inv [ i ] ;
    c %= M ;
    if ( ++ i < k ) {
      c2 *= k + 1 - i ;
      c2 %= M ;
      c2 *= inv [ i - 1 ] ;
      c2 %= M ;
    }
    r += c * c2 ;
    r %= M ;
  }
}
{
  int ans = 1 ;
  int c = 0 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    int ai = a [ i ] ;
    if ( ai == - 1 ) {
      ++ c ;
    }
    else {
      if ( 0 < c ) {
        ans *= calc ( ai - p + 1 , c ) ;
        ans %= M ;
        c = 0 ;
      }
      p = ai ;
    }
  }
  return ans ;
}
public static void main ( String [ ] args ) {
  String n = input ( ) ;
  int n = Integer . parseInt ( n ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  System . out . println ( solve ( n , a ) ) ;
}
}
