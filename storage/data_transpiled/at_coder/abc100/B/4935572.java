public static int D = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N == 100 ) N = 101 ;
  if ( D == 0 ) System . out . println ( N ) ;
  else if ( D == 1 ) System . out . println ( N * 100 ) ;
  else System . out . println ( N * 10000 ) ;
  return N ;
}
