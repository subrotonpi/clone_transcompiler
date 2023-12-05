public static int ans = 0 ;
for ( int i = 0 ;
i < 12 ;
i ++ ) {
  String hoge = input . nextLine ( ) ;
  if ( ( hoge . indexOf ( "r" ) > 0 ) ) {
    ans ++ ;
  }
}
return ans ;
}
