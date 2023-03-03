public static String S = input ( ) ;
String T = input ( ) ;
for ( int i = 0 ;
i < S . length ( ) ;
i ++ ) {
  if ( S . charAt ( i ) == T . charAt ( 0 ) ) {
    String new_s = S . substring ( i ) + S . substring ( 0 , i ) ;
    if ( new_s . equals ( T ) ) {
      System . out . println ( "Yes" ) ;
      exit ( ) ;
    }
  }
}
System . out . println ( "No" ) ;
}
