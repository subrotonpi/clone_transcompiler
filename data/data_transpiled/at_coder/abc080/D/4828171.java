@ VisibleForTesting static int N = Integer . parseInt ( input ) {
  Map < Integer , List < Integer >> cannel = new HashMap < > ( ) ;
  for ( int i = 1 ;
  i <= 1 + C ;
  i ++ ) {
    cannel . put ( i , new ArrayList < > ( ) ) ;
  }
  List < Tuple < Integer , Integer >> check = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    check . add ( new Tuple < > ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  Collections . sort ( check , new Comparator < Tuple < Integer , Integer >> ( ) {
    @ Override public int compare ( Tuple < Integer , Integer > o1 , Tuple < Integer , Integer > o2 ) {
      return o2 . compareTo ( o1 ) ;
    }
  }
  ) ;
  for ( Tuple < Integer , Integer > x : check ) {
    int s = x . first ;
    int t = x . second ;
    int c = x . third ;
    if ( cannel . get ( c ) . isEmpty ( ) ) {
      cannel . get ( c ) . add ( new Tuple < > ( Math . max ( 0 , s - 1 ) , t ) ) ;
    }
    else if ( s - cannel . get ( c ) . get ( c ) . intValue ( ) <= 1 ) {
      cannel . get ( c ) . add ( new Tuple < > ( cannel . get ( c ) . get ( c ) . intValue ( ) , t ) ) ;
    }
    else {
      cannel . get ( c ) . add ( new Tuple < > ( Math . max ( 0 , s - 1 ) , t ) ) ;
    }
  }
  int ans = 0 ;
  int now = 0 ;
  for ( int i = 0 ;
  i < 10 * 5 + 1 ;
  i ++ ) {
    now += start [ i ] - end [ i ] ;
    ans = Math . max ( ans , now ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
