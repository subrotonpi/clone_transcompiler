public static String run ( ) {
  int N = Integer . parseInt ( readLine ( ) ) ;
  int Pd = Integer . parseInt ( readLine ( ) ) ;
  int Pg = Integer . parseInt ( readLine ( ) ) ;
  if ( Pg == 0 && Pd > 0 ) return "Broken" ;
  if ( Pg == 100 && Pd < 100 ) return "Broken" ;
  for ( int i : xrange ( 1 , Math . min ( N , 100 ) + 1 ) ) {
    if ( ( Pd * i ) % 100 == 0 ) return "Possible" ;
  }
  return "Broken" ;
}
