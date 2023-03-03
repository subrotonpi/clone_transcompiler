@ VisibleForTesting static String from ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  Counter counter = ( int ) ( n / 2 ) ;
  return counter . getCount ( ) <= n / 4 || counter . getCount ( ) == 2 && counter . getCount ( ) == 4 + 1 ? "Yes" : "No" ;
}
