@ VisibleForTesting static int [ ] solve ( int N , int [ ] A ) {
  int [ ] middle = new int [ N ] ;
  int start = 0 , end = 0 ;
  for ( int i = 0 ;
  i < middle . length ;
  i ++ ) {
    if ( start < middle [ i ] ) {
      middle [ i ] = middle [ i ] + 1 ;
    }
  }
  for ( int i = 0 ;
  i < start ;
  i ++ ) {
    middle [ i ] = 1 ;
  }
  for ( int i = 0 ;
  i < ( N - num ) / 2 ;
  i ++ ) {
    middle [ i ] = 2 ;
  }
  int [ ] ans = new int [ N ] ;
  int [ ] A = new int [ N ] ;
  int [ ] ope1 = solve ( N , A , 0 ) ;
  int [ ] ope2 = solve ( N - 1 , A , 1 ) ;
  int [ ] ope2 = new int [ N ] ;
  ope2 [ 0 ] = 1 ;
  if ( ope1 . length > 0 ) {
    System . out . println ( ope1 . length ) ;
    System . out . println ( "\n" ) ;
  }
  else {
    System . out . println ( ope2 . length ) ;
    System . out . println ( "\n" ) ;
  }
  int [ ] dy4 = {
    0 , 1 , 0 , - 1 }
    , dx4 = {
      1 , 0 , 1 , 1 , - 1 , - 1 }
      , {
        1 , 0 , - 1 , 0 , 1 , - 1 }
        ;
        / * ▁ inside ▁ the ▁ first ▁ two ▁ sides ▁ of ▁ the ▁ first ▁ three ▁ sides ▁ of ▁ the ▁ second ▁ three ▁ sides ▁ of ▁ the ▁ second ▁ three ▁ sides ▁ of ▁ the ▁ second ▁ four ▁ sides ▁ of ▁ the ▁ second ▁ four ▁ sides ▁ of ▁ the ▁ second ▁ four ▁ sides ▁ of ▁ the ▁ second ▁ four ▁ sides ▁ of ▁ the ▁ second ▁ four ▁ sides ▁ of ▁ the ▁ second ▁ four ▁ sides ▁ of ▁ the ▁ second ▁ four ▁ sides ▁ of ▁ the ▁ second ▁ four ▁ sides ▁ of ▁ the ▁ second ▁ four ▁ sides ▁ of ▁ the ▁ second ▁ four ▁ sides ▁ of ▁ the ▁ second ▁ four ▁ sides ▁ of ▁ the ▁ second ▁ four ▁ sides ▁ of ▁ the ▁ second ▁ four ▁ sides ▁ of ▁ the ▁ second ▁ four ▁ sides ▁ of ▁ the ▁ second ▁ four ▁ sides ▁ of ▁