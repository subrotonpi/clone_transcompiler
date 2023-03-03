public static String S , T = input . next ( ) ;
String l = "a t c o d e r" ;
String [ ] list_ = l . split ( " " ) ;
int flag = 0 ;
for ( int i = 0 ;
i <= S . length ( ) ;
i ++ ) {
  if ( S . charAt ( i ) == T . charAt ( i ) ) flag ++ ;
  else {
    if ( ( S . charAt ( i ) == '@' || T . charAt ( i ) == '@' ) && ( list_ [ i ] . contains ( S . charAt ( i ) ) || list_ [ i ] . contains ( T . charAt ( i ) ) ) ) flag ++ ;
  }
}
if ( flag == S . length ( ) ) System . out . println ( "You can win" ) ;
else System . out . println ( "You will lose" ) ;
return null ;
}
