public static int N = Integer . parseInt ( input ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  HashMap < String , Integer > dic = new HashMap < > ( ) ;
  for ( String a : A ) {
    dic . put ( a , dic . get ( a ) + 1 ) ;
  }
  int [ ] [ ] C = new int [ N ] [ K ] ;
  for ( int k = 0 ;
  k < A . length ;
  k ++ ) {
    C [ k ] = new int [ ] {
      k , dic . get ( A [ k ] ) }
      ;
    }
    Arrays . sort ( C , new Comparator < int [ ] > ( ) {
      @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
        return o2 [ 1 ] - o1 [ 0 ] ;
      }
    }
    ) ;
    if ( C . length <= K ) {
      System . out . println ( 0 ) ;
    }
    else {
      System . out . println ( Arrays . toString ( C ) ) ;
    }
    return C . length ;
  }
  