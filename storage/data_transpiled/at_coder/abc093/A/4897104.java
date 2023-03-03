public static String s ( ) {
  s = list ( input ( ) ) ;
  s . sort ( ) ;
  return ( 'Yes' if '' . join ( s ) == 'abc' else 'No' ) ;
}
