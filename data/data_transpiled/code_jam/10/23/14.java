static final HashMap < Integer , HashMap < Integer , Long >> memo = new HashMap < Integer , HashMap < Integer , Long >> ( ) {
  private static final long serialVersionUID = - 5743705263738203615L ;
  {
    if ( n < 0 ) return 0 ;
    if ( n == 0 ) return 1 ;
    if ( memo . containsKey ( n ) && memo . get ( n ) . containsKey ( m ) ) return memo . get ( n ) . get ( m ) ;
    long s = 0 ;
    for ( int i = 1 ;
    i <= m ;
    i ++ ) s += f ( n - i , m ) ;
    if ( ! memo . containsKey ( n ) ) memo . put ( n , new HashMap < Integer , Long > ( ) ) ;
  }
  private static long serialVersionUID = 1L ;
}
