@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  Iterable < Integer > a = gb ( input . nextLine ( ) ) , b = gb ( input . nextLine ( ) ) ;
  int res = - 1 ;
  Iterator < Integer > it = a . iterator ( ) ;
  while ( it . hasNext ( ) ) {
    int prev = it . next ( ) ;
    if ( res == - 1 ) {
      prev = it . hasNext ( ) ;
      res = 3 * ( 1 + prev ) ;
    }
    else if ( prev != 0 ) {
      prev = it . next ( ) ;
      res *= 2 ;
    }
  }
  return res ;
}
