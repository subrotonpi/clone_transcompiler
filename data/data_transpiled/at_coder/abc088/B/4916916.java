public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i += 2 ) {
    a . add ( i ) ;
  }
  List < Integer > bob = Arrays . asList ( ) ;
  for ( int i = 1 ;
  i < n ;
  i += 2 ) {
    bob . add ( a . get ( i ) ) ;
  }
  System . out . println ( Arrays . toString ( alice ) - Arrays . toString ( bob ) ) ;
}
