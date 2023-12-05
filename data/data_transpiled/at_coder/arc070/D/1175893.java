static final LinkedHashMap < Integer , String > print = new LinkedHashMap < Integer , String > ( ) {
  private final String p = print ;
  @ Override public boolean ask ( Integer x , Integer y ) {
    p ( '?' , x , y ) ;
    return input . equals ( "Y" ) ;
  }
}
