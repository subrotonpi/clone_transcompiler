public static final void main ( String [ ] args ) {
  for ( int testcase = 1 ;
  testcase <= Integer . parseInt ( input . nextLine ( ) ) ;
  testcase ++ ) {
    System . out . println ( fString ( "Case #" + testcase + ": " + solve ( ) ) ) ;
  }
  @ SuppressWarnings ( "unused" ) Scanner input = new Scanner ( System . in ) ;
  int n = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int p = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int [ ] rs = Lists . newArrayList ( ) ;
  List < List < Integer >> ingredientss = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ingredientss . add ( new ArrayList < > ( Arrays . asList ( input . nextLine ( ) . trim ( ) . split ( " " ) ) ) ) ;
  }
  int [ ] lows = new int [ n ] ;
  int [ ] higs = new int [ n ] ;
  int ans = 0 ;
  for ( int servingSize = 1 ;
  servingSize < 1000005 ;
  servingSize ++ ) {
    boolean oneEmpty = false ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      List < Integer > amounts = ingredientss . get ( i ) ;
      int low_ = servingSize * rs [ i ] * 9 ;
      int low = low_ / 10 + ( low_ % 10 > 0 ? 1 : 0 ) ;
      int hig = ( servingSize * rs [ i ] * 11 ) / 10 ;
      while ( higs [ i ] < p && amounts . get ( higs [ i ] ) <= hig ) {
        higs [ i ] ++ ;
      }
      while ( lows [ i ] < p && amounts . get ( lows [ i ] ) < low ) {
        lows [ i ] ++ ;
      }
      if ( lows [ i ] >= p ) {
        return ans ;
      }
      if ( lows [ i ] == higs [ i ] ) {
        oneEmpty = true ;
        break ;
      }
    }
    if ( oneEmpty ) {
      continue ;
    }
    while ( true ) {
      boolean canShip = Arrays . binarySearch ( lows , higs ) < 0 ;
      if ( canShip ) {
        ans ++ ;
        for ( int i = 0 ;
        i < n ;
        i ++ ) {
          lows [