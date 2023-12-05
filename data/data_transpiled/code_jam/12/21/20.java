public static String solve ( ) {
  int [ ] a = ArrayUtil . toIntArray ( new Scanner ( System . in ) . nextLine ( ) . split ( " " ) ) ;
  int n = a [ 0 ] ;
  a = Arrays . copyOf ( a , a . length ) ;
  float s = sum ( a ) ;
  StringBuilder res = new StringBuilder ( n ) ;
  TreeSet < Integer > b = new TreeSet < Integer > ( a ) ;
  for ( int x : a ) {
    float l = 0f , r = 1f ;
    while ( r - l > 1e-10 ) {
      float c = ( l + r ) * .5 ;
      float z = 0f ;
      float t = x + c * s ;
      for ( int y : b ) {
        if ( y >= t ) break ;
        z += t - y ;
      }
      if ( z < s ) l = c ;
      else r = c ;
      res . append ( l * 100 ) ;
    }
    return res . toString ( ) ;
  }
  int t = input . nextInt ( ) ;
  for ( int i : xrange ( t ) ) {
    System . out . println ( "Case #" + ( i + 1 ) + ": " + solve ( ) ) ;
  }
  return solve ( ) ;
}
