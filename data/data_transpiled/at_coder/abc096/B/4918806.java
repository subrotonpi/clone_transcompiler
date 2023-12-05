@ VisibleForTesting static final LinkedHashMap < Integer , Integer > COMBINED_LIST = new LinkedHashMap < Integer , Integer > ( ) {
  private static final long serialVersionUID = 1L ;
  private static final long INF = 10 * * 18 ;
  private static final long MOD = 10 * * 9 + 7 ;
  @ Override public int [ ] LI ( ) {
    return Arrays . stream ( new String [ ] {
      Integer . parseInt ( System . console ( ) . readLine ( ) ) }
      ) . toArray ( ) ;
    }
    @ Override public float [ ] LF ( ) {
      return Arrays . stream ( new String [ ] {
        Float . parseFloat ( System . console ( ) . readLine ( ) ) }
        ) . toArray ( ) ;
      }
      @ Override public int [ ] LS ( ) {
        return Arrays . stream ( new String [ ] {
          Float . parseFloat ( System . console ( ) . readLine ( ) ) }
          ) . toArray ( ) ;
        }
        @ Override public int [ ] MI ( ) {
          return CollectionUtils . repeat ( Integer . parseInt ( System . console ( ) . readLine ( ) ) , MOD ) ;
        }
        @ Override public int [ ] II ( ) {
          return Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
        }
        @ Override public boolean IS ( ) {
          return input . isInput ( ) ;
        }
        @ Override public int P ( int x ) {
          return print ( x ) ;
        }
        @ Override public int C ( int x ) {
          return Counter . gcd ( x ) ;
        }
        @ Override public int [ ] GCD_LIST ( int [ ] numbers ) {
          return reduce ( numbers , 0 , Math . min ( 2 , Math . max ( 2 , Math . min ( 2 , Math . max ( 2 , Math . min ( 2 , Math . max ( 2 , Math . max ( 2 , Math . min ( 2 , Math . max ( 2 , Math . max ( 2 , Math . max ( 2 , Math . max ( 2 , Math . max ( Math . abs ( Math . abs ( Math . abs ( Math . abs ( Math . abs ( Math . abs ( Math . abs ( Math . abs ( Math . abs ( Math . abs ( Math . abs ( Math . abs ( Math . abs ( Math . abs ( Math . abs ( Math . abs ( Math . abs ( Math . abs ( Math . abs ( Math . abs ( Math . abs ( Math . Math . abs ( Math . Math . Math . Math . abs ( Math . Math . Abs ( Math . abs ( Math . Math . Math ( Math