@ VisibleForTesting static Iterable < String > combinations ( ) {
  final int K = Integer . parseInt ( input . nextLine ( ) ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Pair < String , String >> items = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final String v = input . nextLine ( ) ;
    final String w = input . nextLine ( ) ;
    items . add ( new Pair < > ( v , w ) ) ;
  }
  return new Iterable < String > ( ) {
    @ Override public Iterator < String > iterator ( ) {
      return items . stream ( ) . map ( p -> {
        final Map < Integer , String > result = new HashMap < > ( ) ;
        for ( final Pair < String , String > v : items ) {
          final String w = v . first ;
          int cnt = 0 ;
          for ( final String s : v . second ) {
            final int i = Integer . parseInt ( s ) ;
            if ( result . containsKey ( i ) && result . get ( i ) . equals ( w . substring ( cnt , cnt + pattern [ i - 1 ] ) ) ) {
              return ;
            }
            result . put ( i , w . substring ( cnt , cnt + pattern [ i - 1 ] ) ) ;
            cnt += pattern [ i - 1 ] ;
          }
          if ( cnt != w . length ( ) ) {
            return ;
          }
        }
        final List < Entry < Integer , String >> re = new ArrayList < > ( result . entrySet ( ) ) ;
        for ( final Entry < Integer , String > e : re ) {
          System . out . println ( e . getValue ( ) ) ;
        }
        exit ( ) ;
      }
    }
    ) ;
  }
  ;
}
