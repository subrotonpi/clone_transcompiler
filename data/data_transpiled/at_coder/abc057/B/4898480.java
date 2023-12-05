public static int [ ] [ ] run ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] stud = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    stud [ i ] = new int [ a ] ;
  }
  double [ ] dist = new double [ n ] ;
  int [ ] at = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dist [ i ] = 1e9 ;
  }
  for ( int j = 0 ;
  j < m ;
  j ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int d = Math . abs ( a - stud [ i ] [ 0 ] ) + Math . abs ( b - stud [ i ] [ 1 ] ) ;
      if ( d < dist [ i ] ) {
        dist [ i ] = d ;
        at [ i ] = j + 1 ;
      }
    }
  }
  for ( int i : at ) {
    System . out . println ( i ) ;
  }
  return null ;
}
