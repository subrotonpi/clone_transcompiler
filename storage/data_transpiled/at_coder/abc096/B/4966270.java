public static List < Integer > A = new ArrayList < > ( ) {
  {
    for ( int j : input . split ( " " ) ) {
    }
  }
  ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    A . sort ( ) ;
    A . set ( 2 , A . get ( 2 ) * 2 ) ;
  }
  System . out . println ( sum ( A ) ) ;
  return A ;
}
