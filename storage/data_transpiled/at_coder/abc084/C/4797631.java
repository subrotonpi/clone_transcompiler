public static int N = Integer . parseInt ( input ) {
  List < Integer > L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) L . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int tmp = 0 ;
    for ( int j = i ;
    j < N - 1 ;
    j ++ ) {
      int c = L . get ( j ) ;
      int s = L . get ( j ) ;
      int f = L . get ( j ) ;
      if ( tmp <= s ) tmp = s + c ;
      else {
        if ( ( tmp - s ) % f == 0 ) tmp += c ;
        else tmp += f - ( tmp - s ) % f + c ;
      }
    }
    System . out . println ( tmp ) ;
  }
  System . out . println ( 0 ) ;
  return 0 ;
}
