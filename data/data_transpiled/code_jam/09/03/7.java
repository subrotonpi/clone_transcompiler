static final String getPattern ( ) {
  final int N = 10000 ;
  class Memoize implements Memoize {
    private final Memoize ( final Memoize function ) {
      private final Memoize . Cache cache ;
      private final Memoize . Memoize memoize = function ;
      @ Override public Object invoke ( final Object ... args ) {
        final Memoize . Cache cache = this . cache ;
        final Object key = getKey ( args ) ;
        try {
          return cache . get ( key ) ;
        }
        catch ( final Memoize . CacheException e ) {
          final Object cachedValue = cache . put ( key , e ) ;
          return cachedValue ;
        }
      }
      private final Memoize . CacheException e = new Memoize . CacheException ( ) {
        @ Override public Object invoke ( final Object ... args ) {
          return args . length > 0 ? ( args [ 0 ] == null ? ImmutableBiMap . < String , Object > of ( ) : args [ 0 ] ) : args [ 0 ] ;
        }
      }
      ;
    }
    @ Override public int findSubset ( String textToFind , String textToSearch ) {
      if ( textToFind . length ( ) == 0 ) return 1 ;
      if ( textToSearch . length ( ) == 0 ) return 0 ;
      if ( textToFind . charAt ( 0 ) == textToSearch . charAt ( 0 ) ) {
        return ( findSubset ( textToFind . substring ( 1 ) , textToSearch . substring ( 1 ) ) + findSubset ( textToFind , textToSearch . substring ( 1 ) ) ) % 10000 ;
      }
      return findSubset ( textToFind , textToSearch . substring ( 1 ) ) ;
    }
  }
  final BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int N = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    textToFind = "welcome to code jam" ;
    final String T = br . readLine ( ) . substring ( 0 , in . read ( ) - 1 ) ;
    int r = findSubset ( textToFind , T ) ;
    System . out . printf ( "Case #%d: %04d%n" , i + 1 , r ) ;
  }
  return null ;
}
