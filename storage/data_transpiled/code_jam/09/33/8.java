@ Sys . Sys public static HashMap < Integer , Integer > memo = new HashMap < Integer , Integer > ( ) {
  private int [ ] [ ] splits = new int [ 2 ] [ 2 ] ;
  {
    int a = 0 , b = 0 , rleft = 0 , rright = 0 ;
  }
  @ Override public Integer computeBruteM ( int a , int b , int [ ] releases , int rleft , int rright ) {
    Integer key = new Integer ( a ) ;
    if ( ! memo . containsKey ( key ) ) {
      memo . put ( key , computeBrute ( a , b , releases , rleft , rright ) ) ;
    }
    return memo . get ( key ) ;
  }
  private int computeBrute ( int a , int b , int [ ] releases , int rleft , int rright ) {
    if ( releases . length == 0 ) {
      return 0 ;
    }
    if ( rleft >= rright ) {
      return 0 ;
    }
    assert a < b ;
    List < Integer > pays = new ArrayList < Integer > ( ) ;
    for ( int idx = rleft ;
    idx < rright ;
    idx ++ ) {
      int cell = releases [ idx ] ;
      int pay = b - a - 1 ;
      if ( rleft != idx ) {
        pay += computeBruteM ( a , cell , releases , rleft , idx ) ;
      }
      if ( rright != idx + 1 ) {
        pay += computeBruteM ( cell + 1 , b , releases , idx + 1 , rright ) ;
      }
      pays . add ( pay ) ;
    }
    return Collections . min ( pays ) ;
  }
  private final String nextLine ( ) {
    return "" ;
  }
}
