private static void solve ( ) {
  int n = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  int cap = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  List < Integer > items = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    items . add ( Integer . parseInt ( readLine ( ) . trim ( ) ) ) ;
  }
  int i = 0 ;
  int j = n - 1 ;
  int count = 0 ;
  while ( i < j ) {
    count ++ ;
    if ( items . get ( j ) + items . get ( i ) > cap ) {
      j -- ;
    }
    else {
      j -- ;
      i ++ ;
    }
  }
  if ( i == j ) {
    count ++ ;
  }
}
