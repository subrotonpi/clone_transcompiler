public static int [ ] getNegativeInstances ( ) {
  K = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = K / 50 ;
  int R = K % 50 ;
  int [ ] ans = new int [ 50 ] ;
  for ( int i = 0 ;
  i < 50 ;
  i ++ ) ans [ i ] = 49 + Q ;
  return ans ;
}
