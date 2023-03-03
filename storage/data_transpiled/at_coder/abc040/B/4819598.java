public static List < Integer > input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > ans = new ArrayList < > ( ) ;
  if ( n == 1 ) {
    System . out . println ( 0 ) ;
  }
  else {
    for ( int h = 1 ;
    h < n ;
    h ++ ) {
      int w = n / h ;
      int tmp = Math . abs ( h - w ) + ( n - h * w ) ;
      ans . add ( tmp ) ;
    }
  }
  System . out . println ( Collections . min ( ans ) ) ;
  return ans ;
}
