public static void input ( int n , int k ) {
  List < List < Integer >> XY = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    XY . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  Collections . sort ( XY ) ;
  double ans = Double . MIN_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      double x = XY . get ( j ) . get ( 0 ) - XY . get ( i ) . get ( 0 ) ;
      List < Integer > T = new ArrayList < > ( ) ;
      for ( int Z : XY . subList ( i , j + 1 ) ) {
        T . add ( Z . get ( 1 ) ) ;
      }
      for ( int u = 0 ;
      u < T . size ( ) ;
      u ++ ) {
        ans = Math . min ( ans , x * ( v - u ) ) ;
      }
    }
  }
  System . out . println ( ans ) ;
}
