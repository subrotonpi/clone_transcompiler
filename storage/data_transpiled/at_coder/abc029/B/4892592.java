public static int ans = 0 ;
for ( int i = 0 ;
i < 12 ;
i ++ ) {
  String S = list ( input ) ;
  if ( ( "r" in S ) . contains ( "a" ) ) {
    ans ++ ;
  }
}
return ans ;
}
