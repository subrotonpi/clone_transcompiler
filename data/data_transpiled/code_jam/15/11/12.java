static final int NCASE = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
for ( int testCase = 1 ;
testCase <= NCASE ;
testCase ++ ) {
  int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int [ ] a = ArrayUtil . split ( System . console ( ) . readLine ( ) . split ( " " ) ) ;
  int y = ArrayUtil . max ( ArrayUtil . max ( a [ i - 1 ] - a [ i ] , 0 ) , ArrayUtil . max ( a [ i ] , 0 ) ) ;
  int mx = ArrayUtil . max ( ArrayUtil . max ( a [ i - 1 ] - a [ i ] , 0 ) , ArrayUtil . max ( a [ i ] , 0 ) ) ;
  int z = ArrayUtil . min ( ArrayUtil . max ( a , mx ) , ArrayUtil . max ( a [ i - 1 ] , 0 ) ) ;
  System . out . printf ( "Case #%d: %d %d%n" , testCase , y , z ) ;
}
