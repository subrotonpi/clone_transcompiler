public static int [ ] inpl ( ) {
  return Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int A = inpl ( ) ;
    int B = inpl ( ) ;
    int c = ( int ) ( - ( - ( A * B ) * 0.5 / 1 ) - 1 ) ;
    int ans = A - 1 + Math . max ( 0 , c - A ) + ( - ( ( - A * B ) / ( c + 1 ) ) - 1 ) ;
    System . out . println ( ans ) ;
  }
  return new int [ ] {
  }
  ;
}
