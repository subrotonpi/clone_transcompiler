static boolean read ( BufferedReader br ) throws IOException {
  int C = Integer . parseInt ( br . readLine ( ) ) ;
  {
    boolean good = true ;
    int i = 0 ;
    while ( good && i < M ) {
      boolean goodC = false ;
      for ( int ff : ms [ i ] [ 0 ] . keySet ( ) ) {
        if ( ns [ ff - 1 ] == 0 ) {
          goodC = true ;
          break ;
        }
      }
      if ( ! goodC ) {
        for ( int ff : ms [ i ] [ 1 ] . keySet ( ) ) {
          if ( ns [ ff - 1 ] == 1 ) {
            goodC = true ;
            break ;
          }
        }
      }
      if ( ! goodC ) {
        good = false ;
      }
      i ++ ;
    }
    return good ;
  }
  {
    boolean bad = false ;
    List < List < Integer >> mBs = new ArrayList < > ( ) ;
    for ( List < Integer > x : ms ) {
      if ( x . get ( 0 ) . keySet ( ) . size ( ) + x . get ( 1 ) . keySet ( ) . size ( ) <= mB ) {
        bad = false ;
      }
      int i = 0 ;
      while ( ! bad && i < mBs . size ( ) ) {
        boolean goodC = false ;
        for ( int ff : mBs . get ( i ) . get ( 0 ) . keySet ( ) ) {
          if ( ns [ ff - 1 ] == 0 ) {
            goodC = true ;
            break ;
          }
        }
        if ( ! goodC ) {
          for ( int ff : mBs . get ( i ) . get ( 1 ) . keySet ( ) ) {
            if ( ns [ ff - 1 ] == 1 ) {
              goodC = true ;
              break ;
            }
          }
        }
        if ( ! goodC ) {
          bad = true ;
        }
        i ++ ;
      }
    }
    return bad ;
  }
  {
    List < List < Integer >> mBs = new ArrayList < > ( ) ;
    for ( List < Integer > x : ms ) {
      if ( x . get ( 0 ) . keySet ( ) . size ( ) + x . get ( 1 ) . keySet ( ) . size ( ) == mB ) {
        int [ ] fs = new int [ x . size ( ) ] ;
        for ( int j = 0 ;
        j < fs . length ;
        j ++ ) {
          fs [ j ] = Integer . parseInt ( x . get ( j ) ) ;
        }
        for ( int cust = 0 ;
        cust < M ;
        cust ++ ) {
          if ( ns [ cu @ @