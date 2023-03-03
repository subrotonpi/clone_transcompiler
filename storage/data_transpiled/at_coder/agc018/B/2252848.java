public static void main ( String input ) {
  final int n = Integer . parseInt ( input ) ;
  final int m = Integer . parseInt ( input ) ;
  final List < List < Integer >> a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Collections . singletonList ( input . substring ( i , i + 1 ) ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      a . get ( i ) . set ( j , -- i ) ;
    }
  }
  final int [ ] itr = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    itr [ i ] = 0 ;
  }
  final boolean [ ] opend = new boolean [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    opend [ i ] = true ;
  }
  final List < List < Integer >> back = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    back . get ( a . get ( i ) . get ( 0 ) ) . add ( i ) ;
  }
  int ret = 10 * 9 ;
  do {
    int tmp = 0 ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      tmp = Math . max ( tmp , back . get ( i ) . size ( ) ) ;
    }
    ret = Math . min ( ret , tmp ) ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      if ( back . get ( i ) . size ( ) >= ret ) {
        opend [ i ] = false ;
        for ( int j = 0 ;
        j < back . get ( i ) . size ( ) ;
        j ++ ) {
          final int source = back . get ( i ) . get ( j ) ;
          while ( ! opend [ a . get ( source ) . get ( itr [ source ] ) ] ) {
            itr [ source ] ++ ;
            if ( itr [ source ] == m ) {
              System . out . println ( ret ) ;
              System . exit ( 0 ) ;
            }
          }
          back . get ( a . get ( source ) . get ( itr [ source ] ) ) . add ( source ) ;
        }
        back . get ( i ) . clear ( ) ;
      }
    }
  }
  while ( opend [ i ] ) ;
}
