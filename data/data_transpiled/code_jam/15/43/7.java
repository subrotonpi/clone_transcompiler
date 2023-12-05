static private Graph < String > createGraph ( ) {
  final Iterator < String > data = IOUtils . readLines ( new File ( "C-large.in" ) ) . iterator ( ) ;
  final int cases = Integer . parseInt ( ( String ) data . next ( ) ) ;
  return new Graph < String > ( ) {
    private final Graph g = new Graph < String > ( ) {
      @ Override public String [ ] buildGraph ( List < String > sentances ) {
        return sentances . toArray ( new String [ sentances . size ( ) ] ) ;
      }
    }
    ;
  }
  ;
}
