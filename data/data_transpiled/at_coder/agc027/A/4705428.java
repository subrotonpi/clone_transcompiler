public static int N ( ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) , N ;
  List < Integer > A = new LinkedList < Integer > ( ) ;
  for ( int a : A ) {
    if ( X - a < 0 ) break ;
    X -= a ;
    N ++ ;
  }
  return N ;
}
