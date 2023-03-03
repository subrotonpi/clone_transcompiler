@ VisibleForTesting static String from ( ) {
  int n = Integer . parseInt ( input ) ;
  String [ ] s = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) s [ i ] = input ;
  Counter c = new Counter ( s ) ;
  String ans = "" ;
  int t = 0 ;
  for ( Entry < String , Integer > x : c . entrySet ( ) ) {
    if ( x . getValue ( ) > t ) {
      t = x . getValue ( ) ;
      ans = x . getKey ( ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
