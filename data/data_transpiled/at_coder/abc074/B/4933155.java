public static int [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] ans = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int dx_a = Math . abs ( x [ i ] - 0 ) ;
    int dx_b = Math . abs ( x [ i ] - K ) ;
    ans [ i ] = Math . min ( dx_a , dx_b ) * 2 ;
  }
  System . out . println ( Arrays . toString ( ans ) ) ;
  return ans ;
}
