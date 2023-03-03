static private final List < Integer > ints = new ArrayList < Integer > ( ) {
  {
    for ( String line : System . console ( ) . readLine ( ) . split ( " " ) ) {
      for ( String word : line . split ( " " ) ) {
        ints . add ( Integer . parseInt ( word ) ) ;
      }
    }
    return ints ;
  }
  public List < Integer > ints ( ) {
    return ints ;
  }
  public List < Double > floats ( ) {
    for ( String line : System . console ( ) . readLine ( ) . split ( " " ) ) {
      for ( String word : line . split ( " " ) ) {
        doubles . add ( Double . parseDouble ( word ) ) ;
      }
    }
    return doubles ;
  }
  public static double up ( double a ) {
    int i = 1 ;
    while ( i < a ) {
      i *= 2 ;
    }
    return 2 * i ;
  }
}
