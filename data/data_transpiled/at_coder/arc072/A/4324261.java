public static void print ( int N ) {
  int [ ] L = Integer . parseInt ( input ( ) ) ;
  int Pnum = 0 ;
  int Psum = 0 ;
  if ( L [ 0 ] >= 1 ) {
    Pnum = L [ 0 ] ;
  }
  else {
    Psum = 1 - L [ 0 ] ;
    Pnum = 1 ;
  }
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( i % 2 == 1 ) {
      if ( Pnum + L [ i ] <= - 1 ) {
        Pnum = Pnum + L [ i ] ;
      }
      else {
        Psum += ( Pnum + L [ i ] + 1 ) ;
        Pnum = - 1 ;
      }
    }
    else {
      if ( Pnum + L [ i ] >= 1 ) {
        Pnum = Pnum + L [ i ] ;
      }
      else {
        Psum += ( 1 - Pnum - L [ i ] ) ;
        Pnum = 1 ;
      }
    }
  }
  int Mnum = 0 ;
  int Msum = 0 ;
  if ( L [ 0 ] <= - 1 ) {
    Mnum = L [ 0 ] ;
  }
  else {
    Msum = L [ 0 ] + 1 ;
    Mnum = - 1 ;
  }
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      if ( Mnum + L [ i ] <= - 1 ) {
        Mnum = Mnum + L [ i ] ;
      }
      else {
        Msum += ( Mnum + L [ i ] + 1 ) ;
        Mnum = - 1 ;
      }
    }
    else {
      if ( Mnum + L [ i ] >= 1 ) {
        Mnum = Mnum + L [ i ] ;
      }
      else {
        Msum += ( 1 - Mnum - L [ i ] ) ;
        Mnum = 1 ;
      }
    }
  }
  System . out . println ( Math . min ( Psum , Msum ) ) ;
}
