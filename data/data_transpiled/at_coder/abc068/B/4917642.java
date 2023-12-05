static final Scanner scanner = new Scanner ( System . in ) {
  private final Supplier < String > ns = Supplier . defaultString ( ) ;
  private final Supplier < Integer > ni = Supplier . defaultInteger ( ) ;
  private final Supplier < String > nm = Supplier . defaultString ( ) ;
  private final Supplier < List < String >> nl = Supplier . defaultString ( ) ;
  @ Override public List < String > next ( ) {
    return Collections . singletonList ( nm . get ( ) ) ;
  }
}
