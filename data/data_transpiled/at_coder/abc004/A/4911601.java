public static void main ( String [ ] args ) {
  class Calculator {
    int num ;
    public Calculator ( int n ) {
      this . num = n ;
    }
    public double getAns ( ) {
      return this . num * 2 ;
    }
  }
  if ( __name__ . equals ( "main" ) ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    Calculator c = new Calculator ( n ) ;
    System . out . println ( c . getAns ( ) ) ;
  }
}
