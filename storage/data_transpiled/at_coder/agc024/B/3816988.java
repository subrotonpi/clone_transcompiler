public static int N = Integer . parseInt ( input ) {
  int [ ] Ps = new int [ N ] ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) Ps [ n ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] counter = new int [ N + 1 ] ;
  for ( int p : Ps ) counter [ p ] = counter [ p ] + 1 ;
  int ans = 0 ;
  for ( int c : counter ) ans = Math . max ( ans , c ) ;
  return ans ;
}
