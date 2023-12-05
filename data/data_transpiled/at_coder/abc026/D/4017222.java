static final void loop ( ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  System . setIn ( stdin ) ;
  {
    final int li = Integer . parseInt ( stdin . readLine ( ) ) ;
    final int li_ = Integer . parseInt ( stdin . readLine ( ) ) - 1 ;
    final float lf = Float . parseFloat ( stdin . readLine ( ) ) ;
    final int ls = stdin . read ( ) ;
    final String ns = stdin . readLine ( ) . replaceAll ( "\\s+" , "" ) ;
    final int lc = Collections . nCopies ( ns , 0 ) ;
    final int ni = Integer . parseInt ( stdin . readLine ( ) ) ;
    final int nf = Float . parseFloat ( stdin . readLine ( ) ) ;
    @ SuppressWarnings ( "unused" ) final double ev = Math . sin ( pi * c * t ) ;
    final double a = li ;
    final double b = li ;
    final double c = li ;
    double prev = 0 ;
    while ( prev + ( 1 / 2 * c ) < ( 100 - b ) / a ) {
      prev ++ ;
    }
    double cur = prev + 1 / ( 2 * c ) ;
    while ( ( 100 - ev ( a , b , c , prev ) ) * ( 100 - ev ( a , b , c , cur ) ) > 0 ) {
      prev ++ ;
      cur ++ ;
    }
    int left = prev ;
    int right = cur ;
    boolean pl = true ;
    if ( ev ( a , b , c , left ) < ev ( a , b , c , right ) ) {
      pl = true ;
    }
    else {
      pl = false ;
    }
    final double eps = 1 / ( 10 * 10 ) ;
    while ( right - left > eps ) {
      final int mid = ( right + left ) / 2 ;
      if ( ev ( a , b , c , mid ) > 100 ) {
        if ( pl ) {
          right = mid ;
        }
        else {
          left = mid ;
        }
      }
      else {
        if ( pl ) {
          left = mid ;
        }
        else {
          right = mid ;
        }
      }
    }
    System . out . println ( mid ) ;
  }
}
