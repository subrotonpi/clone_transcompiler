public static String S = input ( ) ;
if ( S . charAt ( 0 ) == 'A' && S . substring ( 2 , S . length ( ) - 1 ) . indexOf ( 'C' ) == 1 ) {
  if ( S . replace ( 'A' , '' ) . replace ( 'C' , '' ) . isLowerCase ( ) ) {
    System . out . println ( "AC" ) ;
  }
  else {
    System . out . println ( "WA" ) ;
  }
}
else {
  System . out . println ( "WA" ) ;
}
return S ;
}
