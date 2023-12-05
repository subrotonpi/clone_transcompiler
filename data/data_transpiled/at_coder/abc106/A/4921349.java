public static final class Calculator {
  private int [ ] arr ;
  public Calculator ( int [ ] arr ) {
    this . arr = arr ;
  }
  public int getResult ( ) {
    return ( arr [ 0 ] - 1 ) * ( arr [ 1 ] - 1 ) ;
  }
  public void main ( String [ ] args ) {
    int A = Integer . parseInt ( input ( ) ) ;
    int B = Integer . parseInt ( input ( ) ) ;
    int [ ] arr = new int [ ] {
      A , B }
      ;
      Calculator calc = new Calculator ( arr ) ;
      System . out . println ( calc . getResult ( ) ) ;
    }
    if ( __name__ . equals ( "main" ) ) {
      main ( ) ;
    }
  }
  