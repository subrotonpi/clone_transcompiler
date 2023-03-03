static final private class Memoize {
  private final Memoize memoize = new Memoize ( ) {
    private final Map < String , Memoize > cache ;
    {
      this . cache = cache ;
    }
    @ Override public Memoize get ( String key ) {
      memoize . cache = this . cache ;
      String key = getKey ( key ) ;
      try {
        return memoize . get ( key ) ;
      }
      catch ( Exception e ) {
        Memoize cachedValue = cache . put ( key , e ) ;
        return cachedValue ;
      }
    }
    private Memoize getKey ( String key ) {
      return key != null ? ( key == null ? new ImmutableMemoize ( ) : key ) : key ;
    }
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize key = getKey ( key ) ;
    private Memoize