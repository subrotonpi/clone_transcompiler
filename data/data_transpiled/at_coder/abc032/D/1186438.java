static final String print ( ) {
  int [ ] a = new int [ 10 ] ;
  int inf = 10 * 20 ;
  int mod = 10 * 9 + 7 ;
  {
    int [ ] [ ] ai1 = new int [ a . length ] [ a . length ] ;
    int [ ] [ ] ai2 = new int [ a . length ] [ a . length ] ;
    {
      int [ ] [ ] [ ] ai3 = new int [ a . length ] [ a . length ] ;
      for ( int i = 0 ;
      i < a . length ;
      i ++ ) ai1 [ i ] = a [ i ] [ 0 ] ;
    }
    {
      int [ ] [ ] ai3 = new int [ a . length ] [ a . length ] ;
      for ( int i = 0 ;
      i < a . length ;
      i ++ ) ai3 [ i ] = a [ i ] [ 1 ] ;
    }
    {
      int [ ] [ ] ai3 = new int [ a . length ] [ a . length ] ;
      for ( int i = 0 ;
      i < a . length ;
      i ++ ) ai3 [ i ] = a [ i ] [ 0 ] ;
    }
    {
      int [ ] [ ] ai4 = new int [ a . length ] [ a . length ] ;
      for ( int i = 0 ;
      i < a . length ;
      i ++ ) ai4 [ i ] = ai3 [ i ] ;
    }
    {
      int [ ] [ ] ai3 = new int [ a . length ] [ a . length ] ;
      for ( int i = 0 ;
      i < a . length ;
      i ++ ) ai3 [ i ] = ai4 [ i ] ;
    }
    {
      int [ ] [ ] ai4 = new int [ a . length ] [ a . length ] ;
      for ( int i = 0 ;
      i < a . length ;
      i ++ ) ai4 [ i ] = ai3 [ i ] ;
    }
    {
      int [ ] [ ] ai3 = new int [ a . length ] [ a . length ] ;
      for ( int i = 0 ;
      i < a . length ;
      i ++ ) ai3 [ i ] = ai4 [ i ] ;
    }
    {
      int [ ] [ ] ai4 = new int [ a . length ] [ a . length ] ;
      for ( int i = 0 ;
      i < a . length ;
      i ++ ) ai4 [ i ] = ai3 [ i ] ;
    }
    {
      int [ ] [ ] ai3 = new int [ a . length ] ;
      