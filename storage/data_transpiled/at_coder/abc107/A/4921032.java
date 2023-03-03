static final class Calculator {
  private int num ;
  public void setNum ( int N , int i ) {
    this . num = 0 ;
  }
  public void calc ( ) {
    this . num = N - i + 1 ;
  }
  public int getNum ( ) {
    return num ;
  }
  public void main ( String [ ] args ) {
    int N = Integer . parseInt ( input ( ) ) ;
    int i = Integer . parseInt ( input ( ) ) ;
    Calculator c = new Calculator ( ) ;
    c . setNum ( N , i ) ;
    c . calc ( ) ;
    int ans = c . getNum ( ) ;
    System . out . println ( ans ) ;
  }
  if ( __name__ . equals ( "main" ) ) {
    main ( ) ;
  }
}
