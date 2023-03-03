@ VisibleForTesting static void from ( LinkedHashMap < String , Integer > input ) {
  int N = Integer . parseInt ( input . next ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( String s : input . next ( ) . split ( " " ) ) {
    A . add ( Integer . parseInt ( s ) ) ;
  }
  Map < String , Integer > R = new HashMap < > ( ) ;
  R . put ( "gray" , 0 ) ;
  R . put ( "brown" , 0 ) ;
  R . put ( "green" , 0 ) ;
  R . put ( "light" , 0 ) ;
  R . put ( "blue" , 0 ) ;
  R . put ( "yellow" , 0 ) ;
  R . put ( "orange" , 0 ) ;
  R . put ( "red" , 0 ) ;
}
