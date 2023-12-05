public static void print ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > lis = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) lis . add ( new LinkedList < > ( ) ) ;
  int cou = 0 ;
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    if ( lis . get ( k ) . contains ( "." ) ) {
      if ( k != n - 1 ) {
        int num = 0 ;
        for ( int m = 0 ;
        m < n ;
        m ++ ) {
          if ( lis . get ( k ) . charAt ( m ) == '.' ) num = m ;
        }
        lis . get ( k + 1 ) . set ( num , "o" + lis . get ( k + 1 ) . substring ( num ) ) ;
      }
      cou ++ ;
    }
  }
  System . out . println ( cou ) ;
}
