public static boolean judge ( int n , int k ) {
  String s = Integer . parseInt ( input . nextLine ( ) ) ;
  HashMap < String , Integer > dic1 = new HashMap < String , Integer > ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( dic1 . containsKey ( s . charAt ( i ) ) ) dic1 . put ( s . charAt ( i ) , ++ cnt ) ;
    else dic1 . put ( s . charAt ( i ) , 1 ) ;
  }
  {
    int cnt2 = cnt ;
    HashMap < String , Integer > dic2 = dic . clone ( ) ;
    if ( ( j == s . charAt ( i ) ) && ( j == s . charAt ( i ) ) ) cnt2 ++ ;
    dic2 . put ( s . charAt ( j ) , -- cnt ) ;
    HashMap < String , Integer > dic3 = dic1 . clone ( ) ;
    for ( int kk = 0 ;
    kk < s . length ( ) ;
    kk ++ ) dic3 . put ( s . charAt ( kk ) , -- cnt ) ;
    int cnt3 = 0 ;
    for ( String key : Collections . list ( dic3 . keySet ( ) ) ) cnt3 += Math . min ( dic1 . get ( key ) , n ) ;
    String ans = "" ;
    cnt = 0 ;
    HashMap < String , Integer > dic = dic1 . clone ( ) ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      for ( int j : l ) {
        if ( dic . get ( j ) == 0 ) continue ;
        if ( judge ( i , j ) ) {
          ans = ans + dic1 . get ( j ) ;
          dic . get ( j ) -- cnt ;
          if ( ( j == s . charAt ( i ) ) ) cnt ++ ;
          break ;
        }
      }
    }
    System . out . println ( ans ) ;
  }
  return false ;
}
