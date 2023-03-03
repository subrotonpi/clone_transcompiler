public static String S = input ( ) ;
String T = input ( ) ;
for ( int i = 0 ;
i < S . length ( ) ;
i ++ ) {
  if ( S . substring ( i ) + S . substring ( 0 , i ) . equals ( T ) ) {
    System . out . println ( "Yes" ) ;
    exit ( ) ;
  }
}
System . out . println ( "No" ) ;
return T ;
}
