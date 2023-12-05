private static void s = new HashSet < Integer > ( ) {
  Set < Integer > e = new HashSet < Integer > ( ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( ;
  ;
  ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( a == 1 ) {
      s . add ( b ) ;
    }
    else if ( b == n ) {
      e . add ( a ) ;
    }
  }
}
