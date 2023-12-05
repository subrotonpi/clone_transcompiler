public static String S = input ( ) ;
if ( S . charAt ( 0 ) == 'A' && S . substring ( 2 , S . length ( ) - 1 ) . indexOf ( 'C' ) == 1 ) {
  int c = S . indexOf ( 'C' ) ;
  if ( Character . isLowerCase ( S . charAt ( 1 ) ) && Character . isLowerCase ( S . charAt ( c + 1 ) ) ) {
    System . out . println ( "AC" ) ;
    exit ( ) ;
  }
}
System . out . println ( "WA" ) ;
return S ;
}
