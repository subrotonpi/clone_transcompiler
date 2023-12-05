public static List < Integer > solve ( ) {
  List < Integer > A = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int a = A . get ( 0 ) ;
  int b = A . get ( 1 ) ;
  int c = A . get ( 2 ) ;
  int [ ] ans = new int [ 3 ] ;
  Arrays . sort ( A , Collections . reverseOrder ( ) ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    if ( a == A . get ( i ) ) {
      ans [ 0 ] = i + 1 ;
    }
    else if ( b == A . get ( i ) ) {
      ans [ 1 ] = i + 1 ;
    }
    else if ( c == A . get ( i ) ) {
      ans [ 2 ] = i + 1 ;
    }
  }
  for ( int i : ans ) {
    System . out . println ( i ) ;
  }
  return A ;
}
