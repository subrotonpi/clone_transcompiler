private static int N = Integer . parseInt ( input ) {
  int Z = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > As = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) As . add ( i ) ;
  int num = Math . abs ( As . get ( As . size ( ) - 1 ) - W ) ;
  if ( N == 1 ) System . out . println ( num ) ;
  else System . out . println ( Math . max ( num , Math . abs ( As . get ( As . size ( ) - 2 ) - As . get ( As . size ( ) - 1 ) ) ) ) ;
  return num ;
}
