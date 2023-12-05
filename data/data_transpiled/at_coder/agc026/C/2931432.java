public static void run ( int n , String s ) {
  String sl = s . substring ( 0 , n ) ;
  String sr = s . substring ( n , 2 * n ) . substring ( 0 , s . length ( ) - 1 ) ;
  String [ ] keys1 = new String [ comb . size ( sl ) ] ;
  String [ ] keys2 = new String [ comb . size ( sr ) ] ;
  for ( int i = 0 ;
  i < keys1 . length ;
  i ++ ) keys1 [ i ] = comb . get ( sl [ i ] ) + "-" + comb . get ( sr [ i ] ) ;
  Map < String , Integer > map = new HashMap < String , Integer > ( ) ;
  for ( String key1 : keys1 ) {
    if ( map . containsKey ( key1 ) ) map . put ( key1 , 1 ) ;
    else map . put ( key1 , 1 ) ;
  }
  int cnt = 0 ;
  for ( String key2 : keys2 ) {
    if ( map . containsKey ( key2 ) ) cnt += map . get ( key2 ) ;
  }
  new comb . OneTuple < String , Integer > ( ) {
    @ Override public Integer [ ] apply ( String s ) {
      if ( s . length ( ) == 1 ) {
        return new Integer [ ] {
          new Integer ( s ) , new Integer ( "" ) }
          ;
        }
        else {
          int [ ] ret = new int [ 2 ] ;
          for ( int i = 0 ;
          i < s . length ( ) - 1 ;
          i ++ ) {
            ret [ i ] = new Integer ( s . charAt ( i ) + s . charAt ( i ) ) ;
            ret [ i ] = new Integer ( s . charAt ( i + 1 ) ) ;
            ret [ i ] = new Integer ( s . charAt ( i + 1 ) ) ;
          }
          return ret ;
        }
      }
    }
    . readLine ( ) ;
    n = Integer . parseInt ( input ( ) ) ;
    s = input ( ) ;
    new Main ( ) {
      @ Override public int run ( int n , String s ) {
        n = n ;
        s = s . substring ( n , 2 * n ) ;
        System . out . println ( run ( n , s ) ) ;
      }
    }
    . run ( ) ;
  }
  