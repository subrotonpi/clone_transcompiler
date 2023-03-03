public static < T > T cached ( Callable < T > f ) {
  final Object notCached = new Object ( ) ;
  final Map < Object , Object > cache = new HashMap < Object , Object > ( ) ;
  return ( T ) Proxy . newProxyInstance ( Thread . currentThread ( ) . getContextClassLoader ( ) , ( Class < T > ) Proxy . newProxyInstance ( Thread . currentThread ( ) . getContextClassLoader ( ) , new Class < ? > [ ] {
    T . class }
    , new InvocationHandler ( ) {
      @ Override public Object invoke ( Object proxy , Method method , Object [ ] args ) throws Throwable {
        Object result = cache . get ( method , notCached ) ;
        if ( result != notCached ) return result ;
        cache . put ( method , result = method . invoke ( proxy , args ) ) ;
        return result ;
      }
    }
    ) ;
  }
  