static final int [ ] input ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int L = Integer . parseInt ( input . readLine ( ) ) ;
  ArrayList < Point > a = new ArrayList < > ( ) ;
  for ( String s : ( l . split ( " " ) ) ) {
    a . add ( new Point ( - 1 , 0 ) ) ;
    a . add ( new Point ( 0 , 1 ) ) ;
  }
  a . add ( new Point ( L + 1 , 0 ) ) ;
  a . add ( new Point ( L + 2 , 1 ) ) ;
  int jumps = 0 ;
  int l_rabbit = 0 , r_rabbit = 0 , l_mid = 0 , r_mid = 0 ;
  Iterator < Point > it = a . iterator ( ) ;
  while ( it . hasNext ( ) ) {
    Point current_pos = it . next ( ) ;
    int current_dir = current_pos . x ;
    if ( current_dir == 0 ) {
      l_rabbit ++ ;
      if ( current_dir == next_dir ) {
        jumps += ( next_pos . y - current_pos . y - 1 ) * l_rabbit ;
      }
      else {
        l_mid = current_pos . y ;
        r_mid = next_pos . y ;
      }
    }
    else {
      jumps += current_pos . y - r_mid - r_rabbit ;
      r_rabbit ++ ;
      if ( current_dir != next_dir ) {
        jumps += Math . max ( l_rabbit , r_rabbit ) * ( r_mid - l_mid . y - 1 ) ;
        l_rabbit = 0 ;
        r_rabbit = 0 ;
      }
    }
  }
  System . out . println ( jumps ) ;
  return a . toArray ( ) ;
}
