public static int root ( ) {
  int root = Integer . parseInt ( input . nextLine ( ) ) ;
  int inf = root * root ;
  int sup = ( root + 1 ) * root ;
  int tmp1 = sup ;
  int tmp2 = inf ;
  int ans = sup + 1 ;
  int times = 0 ;
  while ( ( tmp1 > 0 ) && ( tmp1 < 100 ) ) {
    tmp1 /= 100 ;
    times ++ ;
    if ( tmp1 * 100 * times >= inf && tmp1 * 100 * times < sup ) {
      ans = Math . min ( ans , tmp1 ) ;
    }
  }
  times = 0 ;
  while ( ( tmp2 > 0 ) && ( tmp2 < 99 ) ) {
    tmp2 = ( tmp2 + 99 ) / 100 ;
    times ++ ;
    if ( tmp2 * 100 * times >= inf && tmp2 * 100 * times < sup ) {
      ans = Math . min ( ans , tmp2 ) ;
    }
    if ( 100 * times > sup ) {
      break ;
    }
  }
  ans = Math . min ( root * root , ans ) ;
  System . out . println ( ans ) ;
  return ans ;
}
