public static void main ( String argv [ ] ) throws Exception {
  if ( argv . length < 1 ) {
    System . err . println ( "Usage: java -jar TestMain.jar <file>" ) ;
    System . exit ( 1 ) ;
  }
  BufferedReader br = new BufferedReader ( new FileReader ( argv [ 0 ] ) ) ;
  int T = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int t = xrange ( T ) ;
  t < T ;
  t ++ ) {
    int R = Integer . parseInt ( br . readLine ( ) ) ;
    int k = Integer . parseInt ( br . readLine ( ) ) ;
    int N = Integer . parseInt ( br . readLine ( ) ) ;
    int [ ] groups = ArrayUtil . toIntArray ( br . readLine ( ) ) ;
    int [ ] next = new int [ N ] ;
    int [ ] earnt = new int [ N ] ;
    {
      int start = 0 ;
      int end = 0 ;
      int group = start ;
      int earnings = 0 ;
      int length = 0 ;
      do {
        earnings += earnt [ group ] ;
        group = next [ group ] ;
        length ++ ;
      }
      while ( group == end ) ;
      next [ group ] = null ;
      earnt [ group ] = earnings ;
    }
    int lastGroup = 0 ;
    do {
      if ( earnt [ group ] != 0 ) break ;
      lastGroup = group ;
      int placesUsed = 0 ;
      while ( placesUsed + groups [ group ] <= k ) {
        placesUsed += groups [ group ] ;
        group = ( group + 1 ) % N ;
        if ( group == lastGroup ) break ;
        next [ lastGroup ] = group ;
        earnt [ lastGroup ] = placesUsed ;
      }
      int startupLength = lastGroup != 0 ? lengthEarningsFromTo ( 0 , lastGroup ) : ( 0 , 0 ) ;
      int startupEarnings = lastGroup != 0 ? lengthEarningsFromTo ( lastGroup , lastGroup ) : ( 0 , 0 ) ;
      int cycleLength = lastGroup != 0 ? lengthEarningsFromTo ( lastGroup , lastGroup ) : ( 0 , 0 ) ;
      int cycleEarnings = lastGroup != 0 ? lengthEarningsFromTo ( lastGroup , lastGroup ) : ( 0 , 0 ) ;
      group = lastGroup ;
    }
    while ( R -- > 0 ) ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + earnings )