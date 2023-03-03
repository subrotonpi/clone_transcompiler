public static String S = input ( ) + '!' ;
for ( int i = 0 ;
i < S . length ( ) ;
i ++ ) {
  if ( S . charAt ( i ) == 'I' || S . charAt ( i ) == 'i' ) {
    for ( int j = i + 1 ;
    j < S . length ( ) ;
    j ++ ) {
      if ( S . charAt ( j ) == 'C' || S . charAt ( j ) == 'c' ) {
        for ( int k = j + 1 ;
        k < S . length ( ) ;
        k ++ ) {
          if ( S . charAt ( k ) == 'T' || S . charAt ( k ) == 't' ) {
            System . out . println ( "YES" ) ;
            exit ( ) ;
          }
        }
      }
    }
  }
}
System . out . println ( "NO" ) ;
return S ;
}
