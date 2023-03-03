static final Scanner lin = new Scanner ( System . in ) {
  @ Override public String nextLine ( ) {
    return System . in . nextLine ( ) ;
  }
  @ Override public int [ ] ints ( ) {
    return Arrays . stream ( lin . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  }
  @ Override public int [ ] nums ( int a , int B1 , int B2 ) {
    if ( B1 <= a && a < B2 ) return nums ( a , B1 , a ) + nums ( a , a + 1 , B2 ) ;
    assert a <= B1 || B1 <= B2 && B2 <= a ;
    if ( B1 >= a ) return Math . max ( 0 , B2 + 1 - Math . max ( B1 , ( int ) Math . floor ( a * phi ) + 1 ) ) ;
    if ( B2 <= a ) return Math . max ( 0 , 1 + Math . min ( B2 , ( int ) Math . floor ( a / phi ) ) - B1 ) ;
    assert false ;
    return null ;
  }
}
