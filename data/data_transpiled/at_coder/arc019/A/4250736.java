public static String S = String . valueOf ( input ) ;
int len = S . length ( ) ;
for ( int i = 0 ;
i < len ;
i ++ ) {
  switch ( S . charAt ( i ) ) {
    case 'O' : case 'D' : S [ i ] = '0' ;
    break ;
    case 'I' : S [ i ] = '1' ;
    break ;
    case 'Z' : S [ i ] = '2' ;
    break ;
    case 'S' : S [ i ] = '5' ;
    break ;
    case 'B' : S [ i ] = '8' ;
    break ;
  }
}
String ans = "" ;
for ( int i = 0 ;
i < len ;
i ++ ) {
  ans += S . charAt ( i ) ;
}
System . out . println ( ans ) ;
return ans ;
}
