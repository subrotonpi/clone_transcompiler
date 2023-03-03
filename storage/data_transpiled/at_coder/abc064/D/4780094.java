public static String insertion ( @ Nonnegative int N , @ Nonnegative String S ) {
  int bra = 0 , ket = 0 ;
  for ( char c : S . toCharArray ( ) ) {
    if ( c == '(' ) bra ++ ;
    else {
      if ( bra > 0 ) bra -- ;
      else ket ++ ;
    }
  }
  String ret = ( String ) ( '(' ) . charAt ( ket ) + S . toCharArray ( ) ) ;
  bra = 0 ;
  ket = 0 ;
  for ( char c : new String ( S . toCharArray ( ) ) ) {
    if ( c == ')' ) ket ++ ;
    else {
      if ( ket > 0 ) ket -- ;
      else bra ++ ;
    }
  }
  ret = ret + ( String ) ( ')' . charAt ( bra ) ;
  return ret ;
}
