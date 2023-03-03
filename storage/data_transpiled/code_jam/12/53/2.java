private static long check ( long m , long f , List < Pair > p , long v ) throws IOException {
  long d = m - f * v ;
  long ans = 0 ;
  long last = - 1 ;
  for ( Pair i : p ) {
    if ( ( i . second <= last ) && ( d >= ( i . second - last ) * i . first * v ) ) {
      ans += ( i . second - last ) * v ;
      d -= ( i . second - last ) * i . first * v ;
    }
    else {
      ans += d / i . first ;
      break ;
    }
    last = i . second ;
  }
  /* solve the first */
  p . clear ( ) ;
  for ( int i = 0 ;
  i < p . size ( ) ;
  i ++ ) {
    p . add ( new Pair ( Long . parseLong ( p . get ( i ) . split ( " " ) [ 0 ] ) , Long . parseLong ( p . get ( i ) . split ( " " ) [ 1 ] ) ) ) ;
  }
  Collections . sort ( p ) ;
  long l = 1 ;
  long r = m / f ;
  while ( r - l > 10 ) {
    long f1 = ( 2 * l + r ) / 3 ;
    long f2 = ( l + 2 * r ) / 3 ;
    if ( ( check ( m , f , p , f1 ) > check ( m , f , p , f2 ) ) && ( check ( m , f , p , f2 ) > check ( m , f , p , f2 ) ) ) r = f2 ;
    else l = f1 ;
  }
  long best = 0 ;
  for ( int i = l ;
  i <= r ;
  i ++ ) best = Math . max ( best , check ( m , f , p , i ) ) ;
  /* read input */
  BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  String str = br . readLine ( ) ;
  br . close ( ) ;
  str = str . split ( "\n" ) ;
  int t = Integer . parseInt ( str [ 0 ] ) ;
  str = str . substring ( 1 ) ;
  FileWriter F = new FileWriter ( "output1.txt" ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    long m = Long . parseLong ( str [ 0 ] . split ( " " ) [ 0 ] ) ;
    long f = Long . parseLong ( str [ 0 ] . split ( " " )