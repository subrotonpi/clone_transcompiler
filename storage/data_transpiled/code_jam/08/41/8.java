static int min_changes ( int index , int des , int M , int [ ] [ ] tree ) throws IOException {
  int res ;
  int cres ;
  int i ;
  int l ;
  int r ;
  int n ;
  if ( ( isLeaf ( index , M ) ) ) {
    if ( ( des != tree [ index ] [ 0 ] ) ) return - 1 ;
    else return 0 ;
  }
  else {
    res = - 1 ;
  }
  /* isLeaf(i,M) */
  {
    int i = Integer . parseInt ( tree [ index ] [ 1 ] ) ;
    if ( ( i = tree [ index ] [ 0 ] ) == 1 ) {
      l = Integer . parseInt ( tree [ index ] [ 0 ] ) ;
      r = Integer . parseInt ( tree [ index ] [ 1 ] ) ;
      nodes [ i ] = - 1 ;
    }
    else {
      l = min_changes ( 2 * index , 1 , M , tree ) ;
      r = min_changes ( 2 * index + 1 , 1 , M , tree ) ;
      if ( ( l != - 1 ) && ( r != - 1 ) ) {
        res = l + r ;
      }
      else if ( ( r != - 1 ) ) {
        res = - 1 ;
      }
      else {
        res = - 1 ;
      }
    }
    else {
      if ( ( des == 0 ) ) {
        l = min_changes ( 2 * index , 0 , M , tree ) ;
        r = min_changes ( 2 * index + 1 , 0 , M , tree ) ;
        if ( ( l != - 1 ) && ( r != - 1 ) ) {
          cres = l + r ;
        }
        else if ( ( r != - 1 ) ) {
          cres = r ;
        }
        else {
          cres = - 1 ;
        }
      }
      else {
        l = min_changes ( 2 * index , 0 , M , tree ) ;
        r = min_changes ( 2 * index + 1 , 1 , M , tree ) ;
        if ( ( l != - 1 ) && ( r != - 1 ) ) {
          cres = l + r ;
        }
        else if ( ( r != - 1 ) ) {
          cres = r ;
        }
        else if ( ( l != - 1 ) && ( r != - 1 ) ) {
          cres = l + r ;
        }
        else if ( ( r != - 1 ) ) {
          cres = r ;
        }
        else {
          cres = - 1 ;
        }
      }
    }
  }
  