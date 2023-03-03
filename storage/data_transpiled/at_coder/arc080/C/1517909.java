@ Nonnull public static < T > List < T > asList ( final int [ ] a , final int [ ] add ) {
  final Class < ? extends T > clazz = T . class ;
  final List < T > queue = new ArrayList < T > ( ) ;
  final int eleSize = a . length ;
  final int add = add . length ;
  queue . add ( new Consumer < T > ( ) {
    int [ ] a = new int [ eleSize ] ;
    @ Override public void accept ( T a ) {
      int realSize = a . length ;
      queue . add ( a [ 0 ] ) ;
      add ++ ;
      if ( l2 != r2 ) {
        queue . add ( get2 ( l2 , r2 ) ^ 1 ) ;
      }
      if ( l3 < r3 ) {
        queue . add ( get1 ( l3 , r3 ) ) ;
      }
    }
  }
  ) ;
  System . out . println ( Arrays . toString ( result ) ) ;
  Arrays . sort ( result ) ;
  final int [ ] tree = result . toArray ( ) ;
  for ( int i = eleSize - 1 ;
  i > 0 ;
  i -- ) {
    final int left = tree [ i << 1 ] , right = tree [ ( i << 1 ) + 1 ] ;
    tree [ i ] = left < right ? left : right ;
  }
  return result ;
}
