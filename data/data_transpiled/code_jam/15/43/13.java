private static double solve ( ) {
  int n = Integer . parseInt ( readLine ( ) ) ;
  String [ ] text = Arrays . stream ( readLine ( ) . split ( " " ) ) . map ( String :: trim ) . toArray ( String [ ] :: new ) ;
  Set < Set < String >> base = Arrays . asList ( new HashSet < String > ( Arrays . asList ( text [ 0 ] ) ) , new HashSet < String > ( Arrays . asList ( text [ 1 ] ) ) ) ;
  double baseRes = base . get ( 0 ) . stream ( ) . filter ( base :: contains ) . count ( ) ;
  if ( n == 2 ) return baseRes ;
  double res = 1e9 ;
  for ( int i : xrange ( 2 * ( n - 2 ) ) ) {
    Set < Set < String >> added = Arrays . asList ( new HashSet < String > ( ) , new HashSet < String > ( ) ) ;
    for ( int j : xrange ( n - 2 ) ) {
      int lang = ( ( i >> j ) & 1 ) ;
      for ( String word : text [ j + 2 ] . split ( " " ) ) {
        if ( ! word . equals ( "" ) ) added . get ( lang ) . add ( word ) ;
      }
    }
    double r = added . get ( 0 ) . stream ( ) . filter ( base :: contains ) . count ( ) + added . get ( 1 ) . stream ( ) . filter ( base :: contains ) . count ( ) + added . get ( 0 ) . stream ( ) . filter ( base :: contains ) . count ( ) + added . get ( 1 ) . count ( ) ;
    res = Math . min ( res , baseRes + r ) ;
  }
  return res ;
}
