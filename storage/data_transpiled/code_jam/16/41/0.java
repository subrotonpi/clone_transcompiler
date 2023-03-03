if ( 1 ) {
  @ SuppressWarnings ( "unchecked" ) Iterator < String > xr = xrange . take ( 1 , 1 + input . length ) ;
  int n = xr . hasNext ( ) ? xr . next ( ) : n ;
  int r = xr . hasNext ( ) ? xr . next ( ) : n ;
  int p = xr . hasNext ( ) ? xr . next ( ) : n ;
  int s = xr . hasNext ( ) ? xr . next ( ) : n ;
  System . out . println ( "Case #" + cas + ":" + ( max ( r , p , s ) - min ( r , p , s ) ) + " = " + ( max ( r , p , s ) - min ( r , p , s ) ) ) ;
  return new Iterator < String > ( ) {
    @ Override public boolean hasNext ( ) {
      return xr . hasNext ( ) ;
    }
    @ Override public String next ( ) {
      int cas = xr . next ( ) ;
      int r = xr . hasNext ( ) ? xr . next ( ) : n ;
      int p = xr . next ( ) ;
      int s = xr . next ( ) ;
      System . out . println ( "Case #" + cas + ":" + ( max ( r , p , s ) - min ( r , p , s ) ) + " = " + ( max ( r , p , s ) - min ( r , p , s ) ) ) ;
      return cas ;
    }
    @ Override public String next ( ) {
      return "" ;
    }
    @ Override public String next ( ) {
      if ( before ) System . out . println ( next . getClass ( ) . getName ( ) + "(" + printArgs ( r , p , s ) + ")" ) ;
      int r = xr . hasNext ( ) ? xr . next ( ) : n ;
      if ( after ) System . out . println ( next . getClass ( ) . getName ( ) + "(" + printArgs ( r , p , s ) + ") = " + ( max ( r , p , s ) - min ( r , p , s ) ) ) ;
      return r ;
    }
    @ Override public void remove ( ) {
      throw new UnsupportedOperationException ( ) ;
    }
  }
  ;
}
