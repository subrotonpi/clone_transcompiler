public static void main ( String l , int h , int n , int ... a ) {
  a = map ( Integer . parseInt , open ( 0 ) . split ( " " ) ) ;
  for ( int i : a ) System . out . println ( [ - ( h < i ) ? l : h - i ] [ l > i ] ) ;
}
