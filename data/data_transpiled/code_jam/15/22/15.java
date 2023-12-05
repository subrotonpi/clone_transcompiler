@ System . out . println ( "Case #" + ( t + 1 ) + ":" ) ;
System . out . println ( "solve R,C,N" ) ;
if ( R == 1 || C == 1 ) {
  int L = R * C ;
  if ( L % 2 == 1 ) {
    return Math . max ( N - L / 2 - 1 , 0 ) * 2 ;
  }
  else {
    if ( N <= L / 2 ) {
      return 0 ;
    }
    else {
      return 1 + ( N - L / 2 - 1 ) * 2 ;
    }
  }
  int inner , edge , conner ;
  if ( ( R * C ) % 2 == 0 ) {
    if ( N <= R * C / 2 ) return 0 ;
    inner = ( R - 2 ) * ( C - 2 ) / 2 ;
    edge = R + C - 4 ;
    conner = 2 ;
  }
  else {
    if ( N <= ( R * C + 1 ) / 2 ) return 0 ;
    if ( N <= ( R * C + 1 ) / 2 + 1 ) return 3 ;
    inner = ( ( R - 2 ) * ( C - 2 ) + 1 ) / 2 ;
    edge = R + C - 6 ;
    conner = 4 ;
  }
  int ret = ( R - 1 ) * C + ( C - 1 ) * R ;
  int n = R * C - N ;
  if ( n <= inner ) return ret - n * 4 ;
  ret -= inner * 4 ;
  n -= inner ;
  if ( n <= edge ) return ret - n * 3 ;
  ret -= edge * 3 ;
  n -= edge ;
  return ret - n * 2 ;
}
