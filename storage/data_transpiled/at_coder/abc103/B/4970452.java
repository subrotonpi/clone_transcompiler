public static String S = list ( input ) ;
String T = list ( input ) ;
int ans = 0 ;
for ( int i = 0 ;
i < S . length ;
i ++ ) {
  S . insert ( 0 , S . peek ( ) ) ;
  S . remove ( S . peek ( ) ) ;
  if ( S . equals ( T ) ) ans ++ ;
}
return ( ans != 0 ? "Yes" : "No" ) ;
}
