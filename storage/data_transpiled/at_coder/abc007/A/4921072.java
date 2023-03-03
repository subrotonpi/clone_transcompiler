static final class Calculator {
  private void __init__ ( ) {
  }
  public void setNum ( int N ) {
  }
  public void calc ( ) {
  }
  public int num ( ) {
    return N - 1 ;
  }
  public int getNum ( ) {
    return num ;
  }
  public void main ( String [ ] args ) {
    int N = Integer . parseInt ( input ( ) ) ;
    Calculator c = new Calculator ( ) ;
    c . setNum ( N ) ;
    c . calc ( ) ;
    int ans = c . getNum ( ) ;
    System . out . println ( ans ) ;
  }
  if ( __name__ . equals ( "main" ) ) {
    main ( ) ;
  }
}
