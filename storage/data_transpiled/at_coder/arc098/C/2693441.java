public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  List < List < Integer >> d = new ArrayList < > ( ) ;
  d . add ( a ) ;
  Arrays . sort ( a ) ;
  int ans = a [ Q - 1 ] - a [ 0 ] ;
  while ( true ) {
    List < List < Integer >> d_temp = new LinkedList < > ( ) ;
    List < Integer > sub_temp = new LinkedList < > ( ) ;
    for ( List < Integer > sub : d ) {
      for ( int c : sub ) {
        if ( c != a [ 0 ] ) {
          sub_temp . add ( c ) ;
        }
        else {
          d_temp . add ( sub_temp ) ;
          sub_temp = new LinkedList < > ( ) ;
        }
      }
      d_temp . add ( sub_temp ) ;
      sub_temp = new LinkedList < > ( ) ;
    }
    d . clear ( ) ;
    a = new LinkedList < > ( ) ;
    for ( List < Integer > sub : d_temp ) {
      if ( sub . size ( ) < K ) {
        continue ;
      }
      else {
        d . add ( sub ) ;
        sub = new ArrayList < > ( sub ) ;
        a . addAll ( sub . subList ( 0 , sub . size ( ) - K + 1 ) ) ;
      }
    }
    a = new ArrayList < > ( a ) ;
    if ( a . size ( ) < Q ) {
      break ;
    }
    else {
      ans = Math . min ( ans , a [ Q - 1 ] - a [ 0 ] ) ;
    }
  }
  System . out . println ( ans ) ;
}
