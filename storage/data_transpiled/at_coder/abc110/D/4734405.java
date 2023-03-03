public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int P = 10 * 9 + 7 ;
  {
    for ( int i = 2 ;
    i <= 1 + ( int ) ( M * 0.5 ) ;
    i ++ ) {
      if ( M % i == 0 ) {
        return Arrays . asList ( i ) . hashCode ( ) + getSoinsu ( M / i ) ;
      }
    }
    {
    }
  }
  HashMap < Integer , Integer > soinsu = new HashMap < > ( ) ;
  for ( int n : getSoinsu ( M ) ) {
    soinsu . put ( n , 1 + soinsu . getOrDefault ( n , 0 ) ) ;
  }
  {
    int tmp1 = ( 1 ) , tmp2 = ( 1 ) ;
    for ( int i = n - r + 1 ;
    i <= n ;
    i ++ ) {
      tmp1 *= i ;
    }
    for ( int i = 2 ;
    i <= r ;
    i ++ ) {
      tmp2 *= i ;
    }
    return ( tmp1 / tmp2 ) % P ;
  }
  int out = 1 ;
  soinsu . remove ( 1 ) ;
  for ( int n : soinsu . values ( ) ) {
    out *= combi ( N - 1 + n , n ) ;
    out %= P ;
  }
  System . out . println ( out ) ;
  return out ;
}
