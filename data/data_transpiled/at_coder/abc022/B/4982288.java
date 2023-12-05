public static void print ( int n ) {
  Set < Integer > s = new HashSet < > ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( ! s . contains ( a ) ) {
      s . add ( a ) ;
    }
    else {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
