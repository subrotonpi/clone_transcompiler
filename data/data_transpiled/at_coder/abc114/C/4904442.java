static final int [ ] getDigits ( ) {
  int ans = 0 ;
  List < String > nums = new ArrayList < > ( ) ;
  int N = Integer . parseInt ( input ( ) ) ;
  for ( int k = 1 ;
  k <= 10 ;
  k ++ ) {
    Iterable < String > s = new Sequence < > ( ) ;
    s . add ( "3" ) ;
    s . add ( "5" ) ;
    s . add ( "7" ) ;
    for ( String seq : s ) {
      String num = StringUtils . trim ( seq ) ;
      nums . add ( num ) ;
    }
  }
  for ( String num : nums ) {
    if ( num . contains ( "3" ) && num . contains ( "5" ) && num . contains ( "7" ) && Integer . parseInt ( num ) <= N ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
  return nums . toArray ( ) ;
}
