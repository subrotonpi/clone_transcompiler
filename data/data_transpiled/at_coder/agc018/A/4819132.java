static final private fractions . Fraction gcd ( ) {
  int n , k ;
  int max = Integer . parseInt ( input . nextLine ( ) ) ;
  a = list . remainder ( n ) ;
  int g = gcd ( a ) ;
  System . out . println ( ( k >= max ) || ( max >= k && ( g == 1 || k % g == 0 ) ) ? "POSSIBLE" : "IMPOSSIBLE" ) ;
}
