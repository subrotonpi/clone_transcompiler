static final class Calculator {
  private int [ ] arr ;
  public Calculator ( int [ ] arr ) {
    this . arr = arr ;
    calc ( ) ;
  }
  public Calculator ( ) {
    int num = new int [ arr . length ] ;
    for ( int i = 0 ;
    i < num ;
    i ++ ) {
      this . arr [ i ] = arr [ i ] > 0 ;
    }
    return new Calculator ( num ) ;
  }
  public void main ( String [ ] args ) {
    int S = Integer . parseInt ( input ( ) ) ;
    int T = Integer . parseInt ( input ( ) ) ;
    int [ ] arr = new int [ S ] ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      arr [ i ] = arr [ i ] ;
    }
    Calculator calc = new Calculator ( arr ) ;
    System . out . println ( calc . getNum ( ) ) ;
  }
  if ( __name__ == null ) {
    System . exit ( 0 ) ;
  }
  return null ;
}
