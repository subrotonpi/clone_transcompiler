static final Map < Integer , Integer > cache = new HashMap < Integer , Integer > ( ) {
  private int n = 0 ;
  private int [ ] a ;
  private int [ ] cache = new int [ n ] ;
  private int [ ] run ( int [ ] a , int idx , int count , int level ) {
    if ( level == n ) {
      if ( a [ idx ] >= count ) {
        return 0 ;
      }
      return null ;
    }
    int [ ] a1 = run ( a , idx * 2 + 1 , count , level + 1 ) ;
    int [ ] a2 = run ( a , idx * 2 + 2 , count , level + 1 ) ;
    int [ ] a3 ;
    if ( a1 == null || a2 == null ) {
      a3 = null ;
    }
    else {
      a3 = a1 . clone ( ) ;
    }
    else {
      a3 = a1 . clone ( ) ;
    }
    a1 = run ( a , idx * 2 + 1 , count + 1 , level + 1 ) ;
    a2 = run ( a , idx * 2 + 2 , count + 1 , level + 1 ) ;
    int [ ] a4 ;
    if ( a1 == null || a2 == null ) {
      a4 = null ;
    }
    else {
      a4 = a1 . clone ( ) ;
    }
    if ( a3 == null ) {
      return a4 ;
    }
    if ( a4 == null ) {
      return a3 ;
    }
    return Math . min ( a3 , a4 ) ;
  }
  private int [ ] run ( int [ ] a , int idx , int count , int level ) {
    if ( ( idx < 0 ) || ( idx >= count ) ) {
      cache . put ( new Integer ( idx ) , run2 ( a , idx , count , level ) ) ;
    }
    return cache . get ( new Integer ( idx ) ) ;
  }
  private int [ ] foo ( BufferedReader iReader ) throws IOException {
    n = Integer . parseInt ( iReader . readLine ( ) ) ;
    int [ ] a = new int [ n + 1 ] ;
    cache . clear ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a [ i ] = Integer . parseInt ( iReader . readLine ( ) ) ;
    }
    a = a . clone ( ) ;
    return run ( a , 0 , 0 , 0 ) ;
  }
  private int [ ] run ( int [ ] a , int idx , int count , int level ) {
    n = Integer . parseInt ( iReader . readLine ( ) ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      System . out