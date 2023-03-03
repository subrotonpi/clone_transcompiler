public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> a = Lists . newArrayList ( ) ;
  List < List < Integer >> d = new ArrayList < > ( ) ;
  d . add ( a ) ;
  a = new ArrayList < > ( a ) ;
  Collections . sort ( a ) ;
  int ans = a . get ( Q - 1 ) - a . get ( 0 ) ;
  while ( true ) {
    List < List < Integer >> dTemp = Lists . newArrayList ( ) ;
    List < Integer > subTemp = Lists . newArrayList ( ) ;
    for ( List < Integer > sub : d ) {
      for ( int c : sub ) {
        if ( c != a . get ( 0 ) ) {
          subTemp . add ( c ) ;
        }
        else {
          dTemp . add ( subTemp ) ;
          subTemp = Lists . newArrayList ( ) ;
        }
      }
    }
    dTemp . add ( subTemp ) ;
    subTemp = Lists . newArrayList ( ) ;
  }
  d = Lists . newArrayList ( ) ;
  a = Lists . newArrayList ( ) ;
  for ( List < Integer > sub : dTemp ) {
    if ( sub . size ( ) < K ) {
      continue ;
    }
    else {
      d . add ( sub ) ;
      sub = new ArrayList < > ( sub ) ;
      a . addAll ( sub . subList ( 0 , sub . size ( ) - K + 1 ) ) ;
    }
  }
  Collections . sort ( a ) ;
  if ( a . size ( ) < Q ) {
    break ;
  }
  else {
    ans = Math . min ( ans , a . get ( Q - 1 ) - a . get ( 0 ) ) ;
  }
  return ans ;
}
