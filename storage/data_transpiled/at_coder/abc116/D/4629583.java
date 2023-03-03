static final int [ ] maxsushi ( int [ ] sushi_list , Set < Integer > eaten_sushi ) {
  int index = 0 ;
  int [ ] tmp ;
  int max_val = {
    0 , 0 }
    ;
    for ( int i = index ;
    i < sushi_list . length ;
    i ++ ) {
      if ( ( tmp = sushi_list [ i ] ) . intValue ( ) != 0 && ! eaten_sushi . contains ( tmp ) ) {
        tmp = sushi_list [ i ] ;
        max_val = sushi_list [ i ] ;
        index = i ;
        break ;
      }
    }
    return max_val ;
  }
  