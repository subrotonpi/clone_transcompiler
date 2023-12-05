public static int [ ] getM ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  Stack < Integer > w = new Stack < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    w . push ( i ) ;
  }
  int [ ] m = new int [ n ] ;
  return m ;
}
