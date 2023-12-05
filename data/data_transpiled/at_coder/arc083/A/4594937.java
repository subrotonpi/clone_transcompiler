public static int A = Integer . parseInt ( input ) {
  A = Integer . parseInt ( input . nextLine ( ) ) ;
  B = Integer . parseInt ( input . nextLine ( ) ) ;
  C = Integer . parseInt ( input . nextLine ( ) ) ;
  D = Integer . parseInt ( input . nextLine ( ) ) ;
  E = Integer . parseInt ( input . nextLine ( ) ) ;
  F = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = new int [ A * B ] ;
  for ( int a = 0 ;
  a < 31 ;
  a ++ ) {
    for ( int b = 0 ;
    b < 31 ;
    b ++ ) {
      water = ( a * A + b * B ) * 100 ;
      if ( water > F ) continue ;
      int maxSugar = Math . min ( ( maxSugar - sugar ) / D , F ) ;
    }
  }
  return ans ;
}
