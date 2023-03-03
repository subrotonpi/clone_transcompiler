public static void input ( ) {
  int C1 = input . nextInt ( ) ;
  int C2 = input . nextInt ( ) ;
  int C1a = C1 [ 2 ] + C1 [ 1 ] + C1 [ 0 ] ;
  int C2a = C2 [ 2 ] + C2 [ 1 ] + C2 [ 0 ] ;
  if ( C1 == C2a && C2 == C1a ) System . out . println ( "YES" ) ;
  else System . out . println ( "NO" ) ;
}
