@ Sys public static int myRound ( int val , int digit ) {
  int p = 10 * digit ;
  return ( val * p * 2 + 1 ) / 2 / p ;
  /* Round the time before the second */
  int tmp = ( int ) ( 10 * myRound ( time * 0.1 , 0 ) ) ;
  if ( time < ( double ) tmp ) tmp -= 5 ;
  /* Round the time after the second */
  if ( String . valueOf ( time ) . substring ( String . valueOf ( time ) . length ( ) - 1 ) . equals ( "5" ) ) time -- ;
  int tmp = ( int ) ( 10 * myRound ( time * 0.1 , 0 ) ) ;
  if ( tmp > ( double ) tmp ) tmp += 40 ;
  return tmp ;
}
