private static int cache = new HashMap < Integer , Integer > ( ) {
  private static final long serialVersionUID = - 569974699L ;
  @ Override public Integer get ( int n ) {
    if ( cache . get ( n ) != null ) return cache . get ( n ) ;
    if ( n == 1 || n == 2 ) return 1 ;
    return 0 ;
  }
}
