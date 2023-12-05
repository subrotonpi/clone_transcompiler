public static void aI ( int a_i , int a_o , int a_t , int a_j , int a_l , int a_s , int a_z ) {
  int tri_use = Math . min ( a_j , a_l , a_i ) ;
  int p1 = tri_use * 3 ;
  int j_ex = a_j - tri_use ;
  int l_ex = a_l - tri_use ;
  int i_ex = a_i - tri_use ;
  int p2 = j_ex / 2 * 2 + l_ex / 2 * 2 + i_ex / 2 * 2 ;
  int extra = j_ex % 2 + l_ex % 2 + i_ex % 2 ;
  int p3 = 0 ;
  if ( tri_use >= 1 ) {
    if ( extra == 2 ) p3 = 1 ;
    else if ( extra == 3 ) p3 = 3 ;
  }
  System . out . println ( p1 + p2 + p3 + a_o ) ;
}
