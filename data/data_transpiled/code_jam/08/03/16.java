@ Function public static String [ ] [ ] zip ( ) throws IOException {
  String sample = "5\n" + "0.25 1.0 0.1 0.01 0.5\n" + "0.25 1.0 0.1 0.01 0.9\n" + "0.00001 10000 0.00001 1000\n" + "0.4 10000 0.00001 700\n" + "1 100 1 1 10\n" ;
  Scanner in = new Scanner ( sample . toCharArray ( ) ) ;
  File outfile = new File ( "C-large.in" ) ;
  int N = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    float f = in . nextFloat ( ) ;
    float R = in . nextFloat ( ) ;
    float t = in . nextFloat ( ) ;
    float g = in . nextFloat ( ) ;
    float AA = R - t - f ;
    float dd = 2 * rr + gg ;
    float p = 0 ;
    if ( gg <= 0 || RR <= 0 ) {
      p = 1.0f ;
    }
    else {
      float ii = RR / ( sqrt ( 2 ) * dd ) ;
      float aoh = 0 ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        aoh += ii * gg / 2. ;
        float LL = sqrt ( RR * i + 1 ) * dd - ( i + 1 ) * dd ;
        float k = floor ( LL / 2 ) ;
        float xx = ( i + 1 ) * dd - k * dd ;
        float p4 = x - d ;
        if ( R ( p1 ) >= r ) {
          return 0 ;
        }
        else if ( R ( p2 ) >= r ) {
          float p12 [ ] = {
            sqrt ( r * r * r - ( y - d ) * r ) , y - d }
            ;
            float p14 [ ] = {
              x - d , sqrt ( r * r - ( x - d ) * r ) }
              ;
              float phi = atan ( p14 [ 1 ] / p14 [ 0 ] ) - atan ( p23 [ 1 ] / p23 [ 0 ] ) ;
              float a = ( r * r * phi - r * sin ( phi ) ) / 2. ;
              a += 4 * d * d - ( p3 [ 0 ] - p34 [ 0 ] ) * ( p3 [ 1 ] - p23 [ 1 ] ) / 2. ;
              return a ;
            }
          }
        }
      }
      return null ;
    }
    