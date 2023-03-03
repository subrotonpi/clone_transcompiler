public static int R ( int x ) {
  return x / Integer . parseInt ( String . valueOf ( x ) ) ;
}
int K = Integer . parseInt ( input . nextLine ( ) ) ;
int D = 0 ;
int l = 0 ;
for ( int i = 0 ;
i < K ;
i ++ ) {
  D += 10 * l ;
  System . out . println ( D ) ;
  if ( 10 * l < R ( D + 10 * l ) ) l ++ ;
}
