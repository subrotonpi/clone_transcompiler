public static void for ( int nnn : xrange ( 1 , Integer . parseInt ( readLine ( ) ) ) ) {
  System . out . println ( "Case #" + nnn + ":" ) ;
  int J = Integer . parseInt ( readLine ( ) ) ;
  int P = Integer . parseInt ( readLine ( ) ) ;
  int S = Integer . parseInt ( readLine ( ) ) ;
  int K = Integer . parseInt ( readLine ( ) ) ;
  System . out . println ( min ( J * P * S , J * P * K ) ) ;
  for ( int j : xrange ( J ) ) for ( int p : xrange ( P ) ) for ( int s : xrange ( j + p , Math . min ( j + p + K , j + p + S ) ) ) System . out . println ( j + 1 + " " + p + 1 + " " + ( s % S ) + 1 ) ;
}
