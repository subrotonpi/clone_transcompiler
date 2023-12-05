static final double p ( int r , int y , int m , int a , int b ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  final HashMap < Integer , Double > cache = new HashMap < Integer , Double > ( ) ;
  {
    if ( b > y ) return 1.0 ;
    if ( r == 0 ) return 0.0 ;
    if ( a == m ) return p ( r - 1 , y , m , a , b + 1 ) ;
    if ( b == m ) return p ( r - 1 , y , m , a + 1 , b ) ;
    Integer key = new Integer ( r ) ;
    if ( cache . containsKey ( key ) ) return cache . get ( key ) ;
    double left = p ( r - 1 , y , m , a + 1 , b ) ;
    double right = p ( r - 1 , y , m , a , b + 1 ) ;
    double res = 0.5 * ( left + right ) ;
    cache . put ( key , res ) ;
    return res ;
  }
  private double f ( int n , int x , int y ) {
    x = Math . abs ( x ) ;
    int tmp = 1 ;
    int layer = 1 ;
    while ( true ) {
      int tmp_ = tmp + 2 * layer + 3 ;
      if ( tmp_ > n ) break ;
      tmp = tmp_ ;
      layer += 2 ;
    }
    int h = layer ;
    int remaining = n - tmp ;
    if ( y + x <= h - 1 ) return 1.0 ;
    if ( y + x <= h + 1 ) {
      if ( remaining <= y ) return 0.0 ;
      cache . clear ( ) ;
      return p ( remaining , y , h + 1 , 0 , 0 ) ;
    }
    return 0.0 ;
  }
}
