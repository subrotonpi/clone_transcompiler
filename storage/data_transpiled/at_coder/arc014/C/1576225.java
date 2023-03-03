@ VisibleForTesting static void from ( LinkedHashMap < String , Integer > counter ) {
  int N = Integer . parseInt ( input ( ) ) ;
  String S = input ( ) ;
  counter . put ( S ) ;
  int ans = 0 ;
  ans += counter . get ( 'R' ) % 2 ;
  ans += counter . get ( 'G' ) % 2 ;
  ans += counter . get ( 'B' ) % 2 ;
  System . out . println ( ans ) ;
}
