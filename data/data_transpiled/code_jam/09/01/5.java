static final String toWordCase ( ) throws IOException {
  String [ ] text = Files . readAllLines ( Paths . get ( "A.in" ) , StandardCharsets . UTF_8 ) ;
  Files . write ( Paths . get ( "A.out" ) , text , StandardCharsets . UTF_8 ) ;
  Files . write ( Paths . get ( "A.out" ) , text , StandardCharsets . UTF_8 ) ;
  int l = Integer . parseInt ( text [ 0 ] ) ;
  int d = Integer . parseInt ( text [ 1 ] ) ;
  int n = Integer . parseInt ( text [ 2 ] ) ;
  List < String > words = Arrays . asList ( text . substring ( 1 , 1 + d ) . split ( "\\s" ) ) ;
  List < String > tests = Arrays . asList ( text . substring ( 1 + d ) . split ( "\\s" ) ) ;
  for ( int ind = 0 ;
  ind < n ;
  ind ++ ) {
    String test = tests . get ( ind ) ;
    List < String > correct = new ArrayList < String > ( ) ;
    for ( String word : words ) {
      if ( word . matches ( test ) ) {
        correct . add ( word ) ;
      }
    }
    System . out . println ( "Case #" + ( ind + 1 ) + ": " + correct . size ( ) ) ;
    Files . write ( Paths . get ( "A.in" ) , correct . toArray ( new String [ correct . size ( ) ] ) ) ;
  }
  return "A.out" ;
}
