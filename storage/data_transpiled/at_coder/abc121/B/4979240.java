public static int [ ] getN ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  int cnt = 0 ;
  List < Integer > B = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A = new int [ N ] ;
    if ( Arrays . binarySearch ( A , B ) + C > 0 ) {
      cnt ++ ;
    }
  }
  System . out . println ( cnt ) ;
  return A ;
}
