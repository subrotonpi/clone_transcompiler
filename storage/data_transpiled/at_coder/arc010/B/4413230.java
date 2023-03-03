private static void days = new boolean [ 1000 ] ;
for ( int i = 0 ;
i < 1000 ;
i ++ ) {
  if ( i % 7 == 0 || i % 7 == 6 ) days [ i ] = true ;
}
/* Convert to days */
int [ ] month = {
  31 , 29 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 }
  ;
  int ret = 0 ;
  for ( int i = 0 ;
  i < m - 1 ;
  i ++ ) {
    ret += month [ i ] ;
  }
  int n = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int m = Integer . parseInt ( input ( ) ) ;
    int d = Integer . parseInt ( input ( ) ) ;
    int c = conv ( m , d ) - 1 ;
    while ( days [ c ] == true ) c ++ ;
    days [ c ] = true ;
  }
  int res = 2 ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < 366 ;
  i ++ ) {
    if ( days [ i ] ) cnt ++ ;
    else {
      res = Math . max ( res , cnt ) ;
      cnt = 0 ;
    }
  }
  System . out . println ( res ) ;
}
