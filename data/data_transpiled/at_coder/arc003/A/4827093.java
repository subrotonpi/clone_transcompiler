public static int N = Integer . parseInt ( input ) {
  String S = input ;
  Map < Character , Integer > D = new HashMap < > ( ) ;
  D . put ( 'A' , 4 ) ;
  D . put ( 'B' , 3 ) ;
  D . put ( 'C' , 2 ) ;
  D . put ( 'D' , 1 ) ;
  D . put ( 'F' , 0 ) ;
  int ans = 0 ;
  for ( char c : S . toCharArray ( ) ) {
    ans += D . get ( c ) ;
  }
  System . out . println ( ans / N ) ;
  return ans ;
}
