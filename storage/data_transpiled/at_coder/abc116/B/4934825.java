public static void main ( ) {
  int s = Integer . parseInt ( input ( ) ) ;
  ArrayList < Integer > tmp = new ArrayList < Integer > ( ) ;
  while ( ! tmp . contains ( s ) ) {
    tmp . add ( s ) ;
    if ( s % 2 == 0 ) {
      s /= 2 ;
    }
    else {
      s = 3 * s + 1 ;
    }
  }
  System . out . println ( tmp . size ( ) + 1 ) ;
}
