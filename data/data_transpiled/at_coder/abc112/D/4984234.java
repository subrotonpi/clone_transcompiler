static final int [ ] getDivisors ( int n , int m ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  /* List<Integer> ret = new ArrayList<>();
  for (int i = 1; i <= (int) Math.sqrt(n); i++) {
  if (n % i == 0) {
  ret.add(i);
  if (n / i != i) {
  ret.add(n / i);
  }
  }
  }*/
  List < Integer > divs = getDivisors ( m ) ;
  Collections . sort ( divs , Collections . reverseOrder ( ) ) ;
  for ( int d : divs ) {
    if ( d * n <= m ) {
      System . out . println ( d ) ;
      break ;
    }
  }
  return divs . toArray ( new Integer [ 0 ] ) ;
}
