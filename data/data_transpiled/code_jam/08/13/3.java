static final class Memoize extends Callable < String [ ] > callable ( ) {
  private final Memoize cache = new Memoize ( ) {
    private final Map < String , Object > cache ;
    @ Override public Object call ( String name , Object ... args ) throws Exception {
      cache = cache ;
      String key = getKey ( name , args ) ;
      try {
        return cache . get ( key ) ;
      }
      catch ( ExecutionException e ) {
        Object cachedValue = cache . put ( key , e ) ;
        return cachedValue ;
      }
    }
    @ Override public String getKey ( String name , Object ... args ) {
      return args . length > 0 ? ( args [ 0 ] == ImmutableMap . < String , Object > ) ? name : args [ 0 ] . toString ( ) ;
    }
    private Object getKey ( String name , Object ... args ) {
      return args . length > 0 ? new ImmutableMap < String , Object > ( args ) : new ImmutableMap < String , Object > ( ) ;
    }
    private Object getKey ( String name , Object ... args ) {
      return args . length > 0 ? new ImmutableMap < String , Object > ( args ) : new ImmutableMap < String , Object > ( ) ;
    }
    private Object findShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortestShortest @ @