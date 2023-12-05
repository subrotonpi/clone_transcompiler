static final void main ( String input ) throws IOException {
  System . in = new BufferedReader ( new FileReader ( input ) ) ;
  System . out = new PrintWriter ( new FileWriter ( input ) ) ;
  for ( int tc = 0 ;
  tc < Integer . parseInt ( input ) ;
  tc ++ ) {
    int n1 = Integer . parseInt ( input ) ;
    int n2 = Integer . parseInt ( input ) ;
    int [ ] s = new int [ n1 + n2 ] ;
    for ( int i = 0 ;
    i < n1 + n2 ;
    i ++ ) {
      int a = Integer . parseInt ( input ) ;
      int b = Integer . parseInt ( input ) ;
      s [ i ] = new int [ ] {
        a , b , i < n1 ? 1 : 2 }
        ;
      }
      Arrays . sort ( s , new Comparator < int [ ] > ( ) {
        public int compare ( int [ ] o1 , int [ ] o2 ) {
          return o1 [ 0 ] - o2 [ 0 ] ;
        }
      }
      ) ;
      int aw = 0 , bw = 0 ;
      double [ ] [ ] t = new double [ 3 ] [ ] ;
      for ( int i = 0 ;
      i < s . length ;
      i ++ ) {
        if ( s [ i ] [ 2 ] == 1 ) aw += s [ i ] [ 1 ] - s [ i ] [ 0 ] ;
        else bw += s [ i ] [ 1 ] - s [ i ] [ 0 ] ;
      }
      int first = s [ 0 ] [ 2 ] , last = s [ s . length - 1 ] [ 2 ] ;
      double dur = 1440 - ( s [ s . length - 1 ] [ 1 ] - s [ 0 ] [ 0 ] ) ;
      if ( first == last ) t [ first ] [ 0 ] = dur ;
      else t [ 0 ] [ 0 ] = dur ;
      for ( int i = 0 ;
      i < s . length - 1 ;
      i ++ ) {
        int x = s [ i ] [ 2 ] , y = s [ i + 1 ] [ 2 ] ;
        dur = s [ i + 1 ] - s [ i ] [ 1 ] ;
        if ( x == y ) t [ x ] [ 0 ] = dur ;
        else t [ 0 ] [ 0 ] = dur ;
      }
      Arrays . sort ( t [ 1 ] , new Comparator < Integer > ( ) {
        public int compare ( Integer x , Integer y ) {
          return - x ;
        }
      }
      ) ;
      t [ 2 ] [ 0 ] = dur ;
    }
  }
  