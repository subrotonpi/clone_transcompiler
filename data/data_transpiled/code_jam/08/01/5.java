static final void main ( String [ ] args ) throws Exception {
  psyco . full ( ) ;
  final int N = Integer . parseInt ( args [ 0 ] ) ;
  final Class < T > clazz = T . class ;
  final int N = Integer . parseInt ( args [ 1 ] ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int S = Integer . parseInt ( args [ 2 ] ) ;
    final String [ ] names = new String [ S ] ;
    for ( int j = 0 ;
    j < S ;
    j ++ ) {
      names [ j ] = args [ 3 + j ] ;
    }
    final int Q = Integer . parseInt ( args [ 2 ] ) ;
    final int [ ] queries = new int [ Q ] ;
    for ( int j = 0 ;
    j < Q ;
    j ++ ) {
      final String q = args [ 3 + j ] ;
      queries [ j ] = names [ q ] ;
    }
    final List < T > todo = new ArrayList < T > ( ) ;
    todo . add ( clazz . newInstance ( 0 , 0 , 1 ) ) ;
    int R ;
    if ( Q == 0 ) {
      R = 0 ;
    }
    else {
      boolean goOn = true ;
      while ( goOn ) {
        try {
          T t = todo . remove ( ) ;
          for ( int n = 0 ;
          n < S ;
          n ++ ) {
            int q = t . done ;
            if ( queries [ q ] != n ) {
              while ( q < Q && queries [ q ] != n ) {
                q ++ ;
              }
              if ( q == Q ) {
                R = t . switch ;
                goOn = false ;
                break ;
              }
              else {
                todo . add ( clazz . newInstance ( q , t . switch + 1 , Q - q ) ) ;
              }
            }
          }
          Collections . sort ( todo , clazz . newInstance ( 0 , 0 , 1 ) ) ;
        }
        catch ( Exception e ) {
          print ( S , names , queries ) ;
          print ( Q , queries , todo ) ;
          print ( t , q , R , i + 1 ) ;
          throw e ;
        }
      }
    }
    print ( "Case #" + ( i + 1 ) + ":" , R ) ;
  }
}
