public static int N ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  a = [ Integer . parseInt ( i ) for i in input ( ) . split ( ) ] ;
  return ( sum ( a ) - N ) ;
}
