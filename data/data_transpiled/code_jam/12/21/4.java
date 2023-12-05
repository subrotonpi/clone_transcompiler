static final int RES = 10 * - 9 ;
{
  int this = x + score ;
  int left = 1 - x ;
  for ( int o : others ) {
    if ( o < this ) left -= ( this - o ) ;
  }
  if ( left < 0 ) return true ;
  else return false ;
}
private static double findMin ( double score , int [ ] others ) {
  double top = 1.0 ;
  double bottom = 0.0 ;
  double current = 0.5 ;
  while ( top - bottom > RES ) {
    if ( isSufficient ( current , score , others ) ) {
      top = current ;
      current = ( current + bottom ) / 2 ;
    }
    else {
      bottom = current ;
      current = ( current + top ) / 2 ;
    }
  }
  public static String mySol ( String [ ] params ) {
    int nConts = params [ 0 ] . length ( ) ;
    String [ ] scores = Arrays . copyOfRange ( params , 1 , params . length ) ;
    double sumScores = ( double ) sum ( scores ) ;
    if ( scores . length != nConts ) throw new Exception ( "bad parsing" ) ;
    if ( scores . length == 1 ) return 0 ;
    Arrays . sort ( scores ) ;
    double [ ] res = new double [ nConts ] ;
    for ( int i : xrange ( scores . length ) ) {
      double score = scores [ i ] ;
      String [ ] others = Arrays . copyOfRange ( scores , 0 , i ) ;
      res [ i ] = findMin ( score , others ) ;
    }
    String resStr = StringUtils . format ( "%10f" , 100 * scores ) ;
    return resStr ;
  }
}
