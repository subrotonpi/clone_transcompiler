public static int N ( int x ) {
  int an = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 0 ;
  ArrayList < Integer > san = new ArrayList < Integer > ( an ) ;
  for ( Integer a : san ) {
    x -= a ;
    if ( x < 0 ) break ;
    count ++ ;
  }
  if ( x > 0 ) count -- ;
  return count ;
}
