@ Function public static void input ( ) {
  String s = input ( ) ;
  int n = s . length ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String si = s . substring ( i , i + 1 ) ;
    if ( si . equals ( "U" ) ) {
      ans += n - ( i + 1 ) ;
      ans += i * 2 ;
    }
    else {
      ans += ( n - ( i + 1 ) ) * 2 ;
      ans += i ;
    }
  }
  System . out . println ( ans ) ;
}
