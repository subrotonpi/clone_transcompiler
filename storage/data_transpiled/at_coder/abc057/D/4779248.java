public static int N ( String input , int A , int B ) {
  List < Integer > v = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    v . add ( Integer . parseInt ( input . trim ( ) ) ) ;
  }
  /* frac(n) */
  int ret = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    ret *= i ;
  }
  /* combi(n,a) */
  double sm = sum ( v , 0 , A ) ;
  double ave = sm / A ;
  double ans = 0 ;
  int minA = v . get ( A - 1 ) ;
  int ct_mA = v . stream ( ) . filter ( i -> i >= minA ) . count ( ) ;
  int nmA = v . stream ( ) . filter ( i -> i >= minA ) . count ( ) ;
  if ( ave == minA ) {
    int i = 0 ;
    while ( A + i <= B && i <= nmA - ct_mA ) {
      ans += combi ( nmA , i + A ) ;
      i ++ ;
    }
  }
  else {
    ans = combi ( nmA , ct_mA ) ;
  }
  System . out . println ( ave ) ;
  System . out . println ( ans ) ;
  return ans ;
}
