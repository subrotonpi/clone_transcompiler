public static int [ ] [ ] getSortedList ( int n , int k , int q ) {
  int [ ] a = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  List < List < Integer >> d = new ArrayList < > ( ) ;
  d . add ( a ) ;
  Collections . sort ( a ) ;
  int ans = a [ q - 1 ] - a [ 0 ] ;
  do {
    List < List < Integer >> newd = new LinkedList < > ( ) ;
    List < Integer > li = new LinkedList < > ( ) ;
    for ( List < Integer > sub : d ) {
      for ( int c : sub ) {
        if ( c != a [ 0 ] ) {
          li . add ( c ) ;
        }
        else {
          newd . add ( li ) ;
          li = new LinkedList < > ( ) ;
        }
      }
    }
    newd . add ( li ) ;
    li = new LinkedList < > ( ) ;
  }
  while ( true ) ;
  d . add ( d ) ;
  a = new ArrayList < > ( ) ;
  for ( List < Integer > li : newd ) {
    if ( li . size ( ) < k ) {
      continue ;
    }
    else {
      d . add ( li ) ;
    }
  }
  a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a . add ( li ) ;
  }
  return a ;
}
