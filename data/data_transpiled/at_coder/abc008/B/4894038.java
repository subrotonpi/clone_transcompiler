public static void main ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  S = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) S [ i ] = input ( ) ;
  @ SuppressWarnings ( "unchecked" ) Counter < String > dic = ( Counter < String > ) s . getValue ( ) ;
  System . out . println ( dic . getMostSignificantBits ( 1 ) [ 0 ] [ 0 ] ) ;
}
