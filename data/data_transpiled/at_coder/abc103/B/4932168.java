public static String S = input ( ) ;
String T = input ( ) ;
for ( int i = 0 ;
i < S . length ( ) ;
i ++ ) {
  String last = S . substring ( S . length ( ) - 1 ) ;
  S = last + S . substring ( 0 , S . length ( ) - 1 ) ;
  if ( S . equals ( T ) ) {
    System . out . println ( "Yes" ) ;
    break ;
  }
}
else {
  System . out . println ( "No" ) ;
}
return S ;
}
