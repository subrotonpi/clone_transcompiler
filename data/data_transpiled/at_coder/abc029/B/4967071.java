[ ] ;
for ( int i = 0 ;
i < 12 ;
i ++ ) {
  s [ i ] = list ( input ) ;
}
int ans = 0 ;
for ( int i = 0 ;
i < s . length ;
i ++ ) {
  if ( s [ i ] . indexOf ( "r" ) > 0 ) {
    ans ++ ;
  }
}
System . out . println ( ans ) ;
}
