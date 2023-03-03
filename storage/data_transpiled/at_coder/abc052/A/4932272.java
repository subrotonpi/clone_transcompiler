@ GwtIncompatible ( "java.lang.Long" ) public static long times ( long a , long b , long c , long d ) {
  long a = Long . parseLong ( in ) ;
  long b = Long . parseLong ( in ) ;
  long c = Long . parseLong ( in ) ;
  long d = Long . parseLong ( in ) ;
  if ( a * b >= c * d ) {
    System . out . println ( a * b ) ;
  }
  else {
    System . out . println ( c * d ) ;
  }
  return a * b ;
}
