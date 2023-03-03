public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  List < List < Integer >> d = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    d . add ( a ) ;
  }
  Arrays . sort ( a ) ;
  Arrays . sort ( a ) ;
  int ans = a [ Q - 1 ] - a [ 0 ] ;
  while ( true ) {
    List < List < Integer >> dTemp = new LinkedList < > ( ) ;
    List < Integer > subTemp = new LinkedList < > ( ) ;
    for ( List < Integer > sub : d ) {
      for ( int c : sub ) {
        if ( c != a [ 0 ] ) {
          subTemp . add ( c ) ;
        }
        else {
          dTemp . add ( subTemp ) ;
          subTemp = new LinkedList < > ( ) ;
        }
      }
    }
    dTemp . add ( subTemp ) ;
    subTemp = new LinkedList < > ( ) ;
  }
  a = new ArrayList < > ( ) ;
  if ( a . size ( ) < Q ) {
    break ;
  }
  else {
    ans = Math . min ( ans , a [ Q - 1 ] - a [ 0 ] ) ;
  }
  return ans ;
}
