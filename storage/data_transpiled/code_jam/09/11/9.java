static final private Callable < String > memoize = new Callable < String > ( ) {
  private final Memoize cache = new Memoize ( ) {
    private final Map < String , Memoize > cache = new HashMap < > ( ) ;
    private String key ;
    @ Override public String call ( ) {
      return key ;
    }
    @ Override public String call ( ) {
      return key ;
    }
    @ Override public String call ( ) {
      try {
        return cache . get ( key ) ;
      }
      catch ( ExecutionException e ) {
        String cachedValue = cache . put ( key , e . getMessage ( ) ) ;
        return cachedValue ;
      }
    }
    @ Override public String call ( ) {
      return key != null ? key : immutableToString ( key ) ;
    }
  }
  ;
  @ Override public boolean isHappy ( int n , int base , Set < Integer > possiblyUnhappy ) {
    if ( possiblyUnhappy . contains ( n ) ) return false ;
    if ( n == 1 ) return true ;
    int nv = nextVal ( n , base ) ;
    Set < Integer > possiblyUnhappy = possiblyUnhappy . stream ( ) . map ( n -> n ) . collect ( toSet ( ) ) ;
    return isHappy ( nv , base , possiblyUnhappy ) ;
  }
  @ Override public int nextVal ( int v , int base ) {
    if ( v == 0 ) return 0 ;
    int t = v % base ;
    return t * t + nextVal ( v / base , base ) ;
  }
  @ Override public String call ( ) {
    assert nextVal ( 10 , 10 ) == 1 ;
    assert nextVal ( 9 , 10 ) == 81 ;
    assert nextVal ( 19 , 10 ) == 82 ;
    assert nextVal ( 4 , 2 ) == 1 ;
    assert isHappy ( 3 , 2 ) ;
    assert isHappy ( 3 , 3 ) ;
    assert isHappy ( 143 , 2 ) ;
    assert isHappy ( 143 , 3 ) ;
    assert isHappy ( 143 , 7 ) ;
    assert ! isHappy ( 142 , 7 ) ;
    return "" ;
  }
}
