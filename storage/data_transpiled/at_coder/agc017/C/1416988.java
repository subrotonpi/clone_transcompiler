@ VisibleForTesting static String from ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  List < Integer > an = Lists . newArrayList ( ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    an . add ( i ) ;
  }
  Set < Integer > ac_ = new HashSet < > ( an ) ;
  Map < Integer , Integer > ac = new HashMap < > ( ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    ac . put ( i , ac_ . contains ( i ) ? ac_ . get ( i ) : 0 ) ;
  }
  int [ ] ad = new int [ n ] ;
  for ( Map . Entry < Integer , Integer > entry : ac . entrySet ( ) ) {
    ad [ entry . getValue ( ) ] ++ ;
  }
  int ans = ad . length > 0 ? ad [ 0 ] : 0 ;
  String [ ] anss = new String [ m ] ;
  for ( int x = 1 ;
  x <= n ;
  x ++ ) {
    anss [ x ] = x ;
  }
  return anss [ 0 ] ;
}
