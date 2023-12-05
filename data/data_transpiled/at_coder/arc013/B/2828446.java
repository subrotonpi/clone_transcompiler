public static void main ( String input ) {
  int c = Integer . parseInt ( input ) ;
  List < List < Integer >> t = new ArrayList < > ( ) ;
  int n = 0 , m = 0 , l = 0 ;
  for ( int i = 0 ;
  i < c ;
  i ++ ) {
    List < Integer > temp = Lists . newArrayList ( ) ;
    temp . add ( Integer . parseInt ( input ) ) ;
    t . add ( temp ) ;
  }
  for ( int i = 0 ;
  i < t . size ( ) ;
  i ++ ) {
    n = Math . max ( n , t . get ( i ) ) ;
    m = Math . max ( m , t . get ( i ) ) ;
    l = Math . max ( l , t . get ( i ) ) ;
  }
  System . out . println ( n * m * l ) ;
}
