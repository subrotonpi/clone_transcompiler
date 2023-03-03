public static int L = Integer . parseInt ( input ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int A = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( A > H ) {
      System . out . println ( - 1 ) ;
    }
    else if ( A >= L ) {
      System . out . println ( 0 ) ;
    }
    else {
      System . out . println ( L - A ) ;
    }
  }
  return N ;
}
