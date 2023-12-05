private static Map < Integer , Integer > map = new HashMap < Integer , Integer > ( ) {
  private int calc ( int p , int [ ] release ) {
    if ( release . length == 0 ) return 0 ;
    String rstr = StringUtils . join ( release , "," ) ;
    if ( ( p < 0 ) || ( p > 1 ) ) return map . get ( p ) ;
    int res = Math . min ( p - 1 + calc ( r - 1 , Arrays . asList ( release ) ) . size ( ) + calc ( p - r , Arrays . asList ( release ) ) . size ( ) ) ;
    map . put ( p , rstr ) ;
    return res ;
  }
}
