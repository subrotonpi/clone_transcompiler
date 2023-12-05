private static char alphabet [ ] = 'abcdefghijklmnopqrstuvwxyz' ;
String S = input ( ) ;
/* find abc */
for ( char i : alphabet ) {
  if ( ! S . contains ( i ) ) return i ;
}
