public static int n ( int x ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > alist = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) alist . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  if ( Integer . parseInt ( alist . get ( i ) ) == x ) {
    System . out . println ( n ) ;
  }
  else {
    int suma = 0 ;
    int k = 0 ;
    for ( int a : alist ) {
      if ( suma <= x ) {
        suma += a ;
        k ++ ;
      }
    }
    System . out . println ( k - 1 ) ;
  }
  return n ;
}
