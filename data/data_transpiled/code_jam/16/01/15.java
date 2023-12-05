static private String sheep ( int N ) {
  if ( N == 0 ) return "INSOMNIA" ;
  long d = 0 ;
  int t = N ;
  do {
    for ( String s : Long . toString ( t ) . split ( " " ) ) d |= 1L << Integer . parseInt ( s ) ;
    if ( d == 1023 ) return t ;
    t += N ;
  }
  while ( t < N ) ;
  int case = 0 ;
  for ( String s : System . console ( ) . readLine ( ) . split ( " " ) ) {
    if ( case > 0 ) {
      N = Integer . parseInt ( s . trim ( ) ) ;
      System . out . println ( "Case #" + case + ":" + sheep ( N ) ) ;
    }
    case ++ ;
  }
  return s ;
}
