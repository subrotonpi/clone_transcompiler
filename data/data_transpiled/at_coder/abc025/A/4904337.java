public static void input ( Scanner s ) {
  int n = Integer . parseInt ( s . nextLine ( ) ) ;
  String s1 = s ;
  HashMap < Integer , String > dic = new HashMap < Integer , String > ( ) ;
  int cnt = 1 ;
  for ( int i = 0 ;
  i < 5 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 5 ;
    j ++ ) {
      dic . put ( cnt , s . charAt ( i ) + s . charAt ( j ) ) ;
      cnt ++ ;
    }
  }
  System . out . println ( dic . get ( n ) ) ;
}
