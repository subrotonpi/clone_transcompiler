static final Map < String , Integer > lookup = new HashMap < String , Integer > ( ) {
  private static final long serialVersionUID = - 5743705263738203615L ;
  @ Override public int get ( String [ ] vals ) {
    String repr = vals [ 0 ] . toString ( ) ;
    if ( lookup . containsKey ( repr ) ) {
      return lookup . get ( repr ) ;
    }
    else if ( vals . length < 2 ) {
      return 0 ;
    }
    else if ( vals . length == 2 ) {
      return vals [ 0 ] + vals [ 1 ] ;
    }
    else {
      int ans = - 1 ;
      int sum = vals . length - 2 ;
      for ( int val : vals ) sum += val ;
      for ( int i : xrange ( 1 , vals . length ) ) {
        int score = best ( vals , 0 , i ) + best ( vals , i , vals . length ) + sum ;
        if ( score < ans || ans < 0 ) ans = score ;
      }
      lookup . put ( repr , ans ) ;
      return ans ;
    }
  }
  @ Override public int get ( String [ ] vals ) {
    return Integer . parseInt ( vals [ 0 ] ) ;
  }
}
