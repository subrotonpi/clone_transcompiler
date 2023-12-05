static final double phi = ( 1 + Math . sqrt ( 5 ) ) / 2 ;
for ( int t : xrange ( Integer . parseInt ( readLine ( ) ) ) ) {
  int A1 = Integer . parseInt ( readLine ( ) ) ;
  int A2 = Integer . parseInt ( readLine ( ) ) ;
  int B1 = Integer . parseInt ( readLine ( ) ) ;
  int B2 = Integer . parseInt ( readLine ( ) ) ;
  int c = 0 ;
  for ( int a : xrange ( A1 , A2 + 1 ) ) {
    int start = ( int ) Math . ceil ( a / phi ) ;
    int end = ( int ) Math . floor ( a * phi ) + 1 ;
    int istart = Math . max ( B1 , start ) ;
    int iend = Math . min ( B2 + 1 , end ) ;
    int dist = iend - istart ;
    c += dist > 0 ? dist : 0 ;
  }
  c = ( A2 - A1 + 1 ) * ( B2 - B1 + 1 ) - c ;
  System . out . println ( "Case #" + ( t + 1 ) + ": " + c ) ;
}
