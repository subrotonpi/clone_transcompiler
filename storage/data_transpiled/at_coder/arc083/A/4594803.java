@ GwtIncompatible ( "fractions.gcd" ) public static void solve ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int E = Integer . parseInt ( input . nextLine ( ) ) ;
  int F = Integer . parseInt ( input . nextLine ( ) ) ;
  HashMap < String , Integer > ans = new HashMap < > ( ) ;
  ans . put ( "w" , A * 100 ) ;
  ans . put ( "s" , 0 ) ;
  /* Density of water */
  int water = 100 * sugar / ( water + sugar ) ;
  int G = gcd ( C , D ) ;
  for ( int a = 0 ;
  a < 31 ;
  a ++ ) {
    for ( int b = 0 ;
    b < 31 ;
    b ++ ) {
      water = ( a * A + b * B ) * 100 ;
      if ( water > F ) continue ;
      int maxSugar = Math . min ( ( a * A + b * B ) * E , F - water ) ;
      sugar = ( int ) ( G * ( maxSugar / G ) ) ;
      if ( sugar < Math . min ( C , D ) ) continue ;
      if ( water + sugar == 0 ) continue ;
      if ( density ( water , sugar ) > density ( ans . get ( "w" ) , ans . get ( "s" ) ) ) {
        ans . put ( "w" , water ) ;
        ans . put ( "s" , sugar ) ;
      }
    }
  }
  System . out . println ( ans . get ( "w" ) + ans . get ( "s" ) + " " + ans . get ( "s" ) ) ;
}
