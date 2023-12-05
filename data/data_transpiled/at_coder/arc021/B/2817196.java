public static void print ( int N ) {
  int [ ] B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) B [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ans = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) ans [ i ] = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) ans [ i ] = ans [ N - 1 ] ^ B [ i ] ;
  if ( ans [ 0 ] != ans [ ans . length - 1 ] ) System . out . println ( - 1 ) ;
  else System . out . print ( ( int ) ans [ 0 ] , "\n" ) ;
}
