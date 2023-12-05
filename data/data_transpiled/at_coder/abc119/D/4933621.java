static final int [ ] binarySearch ( int a , int b , int q ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] s_list = new int [ a + b ] ;
  int [ ] t_list = new int [ b + a ] ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) {
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    s_list [ i ] = s ;
  }
  for ( int j = 0 ;
  j < b ;
  j ++ ) {
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    t_list [ i ] = t ;
  }
  s_list [ a ] = 100000000000000000 ;
  t_list [ b ] = 100000000000000000 ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int s_pos = Arrays . binarySearch ( s_list , x ) ;
    int t_pos = Arrays . binarySearch ( t_list , x ) ;
    int s_cand1 = x - s_list [ s_pos - 1 ] ;
    int s_cand2 = s_list [ s_pos ] - x ;
    int t_cand1 = x - t_list [ t_pos - 1 ] ;
    int t_cand2 = t_list [ t_pos ] - x ;
    int dist1 = Math . max ( s_cand1 , t_cand1 ) ;
    int dist2 = Math . max ( s_cand2 , t_cand2 ) ;
    int dist3 = Math . min ( s_cand1 , t_cand2 ) * 2 + Math . max ( s_cand1 , t_cand2 ) ;
    int dist4 = Math . min ( s_cand2 , t_cand1 ) * 2 + Math . max ( s_cand2 , t_cand1 ) ;
    System . out . println ( Math . min ( dist1 , dist2 , dist3 , dist4 ) ) ;
  }
  return s_list ;
}
