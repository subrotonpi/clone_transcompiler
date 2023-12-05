static int N , int M , List < List < String >> A = null , null , null ;
{
  int [ ] start = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      if ( A . get ( i ) . get ( j ) . contains ( ch ) ) {
        res [ i ] = new Integer ( i ) ;
      }
    }
  }
  Q = new HashMap < > ( ) ;
  Q . put ( start , 0 ) ;
  boolean solved = false ;
  while ( Q . size ( ) > 0 ) {
    List < String > head = Q . subList ( 0 , Q . size ( ) ) ;
    if ( head . size ( ) == 0 ) {
      System . out . println ( "No solution found" ) ;
    }
    int [ ] di = new int [ ] {
      - 1 , + 1 , 0 , 0 }
      ;
      int [ ] dj = new int [ ] {
        0 , 0 , - 1 , + 1 }
        ;
        int [ ] dk = new int [ ] {
          1 , 0 , 3 , 2 }
          ;
          /* move to the head */
          int ii , jj ;
          int [ ] next ;
          if ( other == null ) continue ;
          next = new Integer [ ] {
            ii , jj }
            ;
            if ( ! isStable && ! isStable ) {
              continue ;
            }
            if ( code ( next ) ) {
              continue ;
            }
            dist [ code ( next ) ] = dist [ code ( head ) ] + 1 ;
            Q . add ( next ) ;
          }
          if ( ! solved ) {
            System . out . println ( - 1 ) ;
          }
          /* make sure we can move to the right position */
          int [ ] x = move ( i , j , d ) ;
          if ( x == null ) return 0 ;
          ii = x [ 0 ] ;
          jj = x [ 1 ] ;
          int [ ] y = move ( i , j , dk [ d ] ) ;
          if ( y == null ) return 0 ;
          int iii = y [ 0 ] ;
          int jjj = y [ 1 ] ;
          if ( A . get ( ii ) . get ( jj ) != null || A . get ( iii ) . get ( jjj ) != null ) return 0 ;
          if ( ( ii == jj ) || ( iii == jjj ) ) return 0 ;
        }
        