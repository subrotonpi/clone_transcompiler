@ VisibleForTesting static String print ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  final int L = Integer . parseInt ( input . nextLine ( ) ) ;
  final int R = Integer . parseInt ( input . nextLine ( ) ) ;
  final int p = Integer . parseInt ( input . nextLine ( ) ) ;
  final int q = Integer . parseInt ( input . nextLine ( ) ) ;
  final Counter < Integer > c = new Counter < > ( L , R ) ;
  @ SuppressWarnings ( "unused" ) final int c = c . getCount ( ) ;
  return ( c . getCount ( ) > 0 ) ? c . get ( p ) + c . get ( q ) : c . get ( p ) ;
}
