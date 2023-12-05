@ Function public static void ai ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int m = Integer . parseInt ( input ( ) ) ;
  int x = ai ( ) ;
  int y = ai ( ) ;
  int mod = 10 * * 9 + 7 ;
  @ SuppressWarnings ( "unchecked" ) List < Integer > sx = Collections . singletonList ( x ) ;
  List < Integer > ssx = Collections . singletonList ( x ) ;
  @ SuppressWarnings ( "unchecked" ) List < Integer > sy = Collections . singletonList ( y ) ;
  List < Integer > ssy = Collections . singletonList ( y ) ;
  int a = Math . pow ( ssx . get ( i ) - sx . get ( i ) , mod ) ;
  int b = Math . pow ( ssy . get ( i ) - sy . get ( i ) , mod ) ;
  System . out . println ( a * b % mod ) ;
}
