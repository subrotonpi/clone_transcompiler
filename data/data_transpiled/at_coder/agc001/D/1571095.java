public static List < List < Integer >> solve ( int n , int m , int [ ] a ) {
  Stack < Integer > odd = new Stack < > ( ) ;
  Stack < Integer > even = new Stack < > ( ) ;
  for ( int aI : a ) {
    if ( aI % 2 == 0 ) {
      even . push ( aI ) ;
    }
    else {
      odd . push ( aI ) ;
    }
  }
  if ( odd . size ( ) >= 3 ) {
    return null ;
  }
  List < Integer > a = new ArrayList < > ( ) , b = new ArrayList < > ( ) ;
  if ( odd . size ( ) > 0 ) {
    int x = odd . pop ( ) ;
    a . add ( x ) ;
    b . add ( x - 1 ) ;
  }
  else {
    int x = even . pop ( ) ;
    a . add ( x ) ;
    b . add ( x - 1 ) ;
  }
  a . addAll ( even ) ;
  b . addAll ( even ) ;
  if ( odd . size ( ) > 0 ) {
    int x = odd . pop ( ) ;
    a . add ( x ) ;
    b . add ( x + 1 ) ;
  }
  else {
    b . add ( 1 ) ;
  }
  return a ;
}
