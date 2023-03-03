public static void setCalculator ( ) {
  class Calculator {
    private void __init__ ( ) {
    }
    public void setNum ( int x ) {
      this . x = x ;
    }
    public boolean getJudgement ( ) {
      judge = false ;
      if ( "3" . equals ( String . valueOf ( x ) ) || x % 3 == 0 ) {
        judge = true ;
      }
      return judge ;
    }
  }
  if ( __name__ . equals ( "__main__" ) ) {
    int n = Integer . parseInt ( input ( ) ) ;
    Calculator c = new Calculator ( ) ;
    c . setNum ( n ) ;
    if ( c . getJudgement ( ) ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
  }
}
