public static int [ ] getM ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , m = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > P = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    P . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Integer > ans = new ArrayList < > ( ) ;
  ans . add ( 0 ) ;
  for ( int a = - 1 ;
  a <= 1 ;
  a ++ ) {
    for ( int b = - 1 ;
    b <= 1 ;
    b ++ ) {
      for ( int c = - 1 ;
      c <= 1 ;
      c ++ ) {
        int res = P . get ( a ) * P . get ( b ) + P . get ( c ) ;
        res . add ( res ) ;
      }
      Collections . sort ( res , reverse ( ) ) ;
      ans . add ( Integer . valueOf ( res ) ) ;
    }
  }
  System . out . println ( Collections . max ( ans ) ) ;
  return ans . toArray ( ) ;
}
