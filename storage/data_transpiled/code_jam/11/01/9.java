@ inFile ( "A-large.in" ) public static boolean debug = true ;
{
  String [ ] data = inline . split ( " " ) ;
  int N = Integer . parseInt ( data [ 0 ] ) ;
  assert data . length == 1 + N * 2 ;
  int turns [ ] = new int [ N ] ;
  int O_list [ ] = new int [ N ] ;
  int B_list [ ] = new int [ N ] ;
  for ( int ix = xrange ( 1 , data . length , 2 ) ;
  ix < N ;
  ix += 2 ) {
    int bot = data [ ix ] , pos = Integer . parseInt ( data [ ix + 1 ] ) ;
    assert bot == "O" || bot == "B" ;
    turns [ ix ] = bot ;
    if ( bot == "O" ) O_list [ ix ] = pos ;
    if ( bot == "B" ) B_list [ ix ] = pos ;
    O_pos = 1 ;
    B_pos = 1 ;
    int t = 0 ;
    int turn_ix = 0 ;
    int nextTurn = turns [ 0 ] ;
    int O_ix = 0 , B_ix = 0 ;
    int curO = 1 , curB = 1 ;
    int nextO = 1 , nextB = 1 ;
    if ( O_list . length > 0 ) nextO = O_list [ 0 ] ;
    if ( B_list . length > 0 ) nextB = B_list [ 0 ] ;
    while ( turn_ix < turns . length ) {
      t ++ ;
      boolean push = false ;
      if ( nextO != curO ) {
        if ( nextO > curO ) ++ curO ;
        else {
          assert nextO < curO ;
          -- curO ;
        }
      }
      else {
        if ( nextTurn == "O" ) {
          push = true ;
          ++ O_ix ;
          if ( O_ix < O_list . length ) nextO = O_list [ O_ix ] ;
        }
      }
      if ( nextB != curB ) {
        if ( nextB > curB ) ++ curB ;
        else {
          assert nextB < curB ;
          -- curB ;
        }
      }
      else {
        if ( nextTurn == "B" ) {
          push = true ;
          ++ B_ix ;
          if ( B_ix < B_list . length ) nextB = B_list [ B_ix ] ;
        }
      }
      if ( push ) {
        ++ turn_ix ;
        if ( turn_ix == turns . length ) break ;
        nextTurn = turns [ turn_ix ] ;
      }
    }
  }
  return t ;
}
