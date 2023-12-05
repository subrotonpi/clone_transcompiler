static final Runnable solve = new Runnable ( ) {
  private final Runnable f = ( ) -> Collections . singletonList ( Integer . parseInt ( input . readLine ( ) ) ) ;
  @ Override public void run ( ) {
    if ( "local" . equals ( input ) ) {
      System . in . read ( ) ;
    }
  }
}
