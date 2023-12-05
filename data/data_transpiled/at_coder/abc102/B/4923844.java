public static int N ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  list = [ int . parseInt ( i ) for i in input ( ) . split ( " " ) ] ;
  return N - ( max ( list ) - min ( list ) ) ;
}
