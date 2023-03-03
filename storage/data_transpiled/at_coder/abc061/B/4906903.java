static final Scanner getScanner ( ) {
  final Scanner ns = new Scanner ( System . in ) ;
  final Scanner ni = new Scanner ( ns ) ;
  final Function < String , Integer > nm = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String s ) {
      return Integer . parseInt ( ns . next ( ) ) ;
    }
  }
  ;
  final Function < String , List < Integer >> nl = new Function < String , List < Integer >> ( ) {
    @ Override public List < Integer > apply ( String s ) {
      return Collections . singletonList ( n ) ;
    }
  }
  ;
  final int n = nm . nextInt ( ) ;
  final int m = nm . nextInt ( ) ;
  final List < Integer > ab = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    ab . add ( nl . apply ( s ) ) ;
  }
  final int [ ] ans = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans [ ab . get ( i ) . intValue ( ) - 1 ] ++ ;
    ans [ ab . get ( i ) . intValue ( ) - 1 ] ++ ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( ans [ i ] ) ;
  }
  return ni ;
}
