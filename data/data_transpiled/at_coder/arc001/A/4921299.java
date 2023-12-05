public static final Class < ? extends Comparable > class Calculator {
  private int [ ] arr ;
  {
    this . arr = arr ;
  }
  public void calc ( ) {
    this . minNum = 9999 ;
    this . maxNum = 0 ;
    for ( int i = 1 ;
    i <= 5 ;
    i ++ ) {
      sum = new Integer ( arr [ i ] == i ) ;
      minNum = Math . min ( minNum , sum ) ;
      maxNum = Math . max ( maxNum , sum ) ;
    }
  }
  public int getMax ( ) {
    return this . maxNum ;
  }
  public int getMin ( ) {
    return this . minNum ;
  }
  public void main ( String [ ] args ) {
    int N = Integer . parseInt ( input ( ) ) ;
    int [ ] c = Lists . newArrayList ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      c [ i ] = Integer . parseInt ( input ( ) ) ;
    }
    int [ ] arr = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      arr [ i ] = c [ i ] ;
    }
    Calculator calc = new Calculator ( arr ) ;
    calc . calc ( ) ;
    System . out . println ( calc . getMax ( ) + " " + calc . getMin ( ) ) ;
  }
  if ( __name__ . equals ( "main" ) ) {
    main ( ) ;
  }
}
