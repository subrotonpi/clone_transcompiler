static final int round ( ) {
  int n = input . nextInt ( ) ;
  int [ ] a = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  double ans = Double . MIN_VALUE ;
  for ( int i : a ) {
    ans = Math . min ( ans , Integer . numberOfTrailingZeros ( i ) - Integer . numberOfLeadingZeros ( i ) - 1 ) ;
  }
  System . out . println ( Math . round ( ans ) ) ;
}
