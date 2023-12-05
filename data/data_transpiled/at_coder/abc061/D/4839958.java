public static double inf = Double . POSITIVE_INFINITY ;
int n = Integer . parseInt ( input ) ;
int m = Integer . parseInt ( input ) ;
List < List < Integer >> abc = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < m ;
i ++ ) {
  abc . add ( Collections . singletonList ( input ) ) ;
}
int [ ] [ ] d = new int [ n ] [ n ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  for ( List < Integer > abci : abc ) {
    if ( d [ abci . get ( 1 ) ] > d [ abci . get ( 0 ) ] + abci . get ( 2 ) ) {
      flag = true ;
      d [ abci . get ( 1 ) ] = d [ abci . get ( 0 ) ] + abci . get ( 2 ) ;
      if ( i == n - 1 && abci . get ( 1 ) == n - 1 ) {
        System . out . println ( "inf" ) ;
        exit ( ) ;
      }
    }
  }
}
System . out . println ( - d [ n - 1 ] ) ;
return d [ n ] ;
}
