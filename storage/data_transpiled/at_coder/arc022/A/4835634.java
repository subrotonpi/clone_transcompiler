private static String s = "ICT" ;
int c = 0 ;
for ( int i = 0 ;
i < input . length ( ) ;
i ++ ) {
  if ( i == s . charAt ( c ) ) {
    c ++ ;
  }
  if ( c == 3 ) {
    System . out . println ( "YES" ) ;
    exit ( ) ;
  }
}
System . out . println ( "NO" ) ;
return s ;
}
