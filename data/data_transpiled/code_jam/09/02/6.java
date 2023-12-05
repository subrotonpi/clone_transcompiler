public static void nextCell ( char [ ] [ ] m , int x , int y ) throws Exception {
  int w = m . length ;
  int h = m [ 0 ] . length ;
  {
    boolean isValid = false ;
    for ( int a = 0 ;
    a < W && a < h ;
    a ++ ) {
      int n = nextCell ( m , x , y ) ;
      if ( n != 0 ) {
        m2 [ x ] [ y ] . next = m2 [ n ] [ 0 ] [ n ] ;
      }
    }
    String [ ] letters = new String [ H ] ;
    for ( int y = x , x2 = x , y2 = y - 1 ;
    y < W ;
    y ++ ) {
      if ( m [ x ] [ y ] . get ( ) == '!' ) {
        next = new Character ( ( char ) x2 ) ;
        next . set ( letters [ y ] . charAt ( 0 ) ) ;
      }
      System . out . println ( ) ;
    }
    int off = x + 1 ;
    int H = y ;
    for ( int x = x ;
    x < H ;
    x ++ , y2 ++ ) {
      if ( m [ x ] [ y ] . get ( ) == '!' ) {
        next = new Character ( ( char ) x2 ) ;
        next . set ( letters [ y ] . charAt ( 0 ) ) ;
      }
      System . out . println ( ) ;
    }
    off = x + 1 ;
  }
  final String [ ] data = Arrays . copyOfRange ( Character . toChars ( 'abcdefghijklmnopqrstuvwxyz' ) , x , x + 1 ) ;
  final int T = Integer . parseInt ( data [ 0 ] ) ;
  off = 1 ;
  class LetterRef {
    char letter = null ;
    char next = null ;
    public void set ( char l ) {
      if ( next != null ) {
        next . set ( l ) ;
      }
      else {
        letter = l ;
      }
    }
    public Character get ( ) {
      if ( next != null ) {
        return next ;
      }
      if ( letter != null ) {
        return letter ;
      }
      return '!' ;
    }
  }
  for ( int x = 0 ;
  x < T ;
  x ++ ) {
    System . out . println ( "Case #" + ( x + 1 ) + ":" ) ;
    int H = Integer . parseInt ( data [ off ++ ] ) ;
    int W = Integer . parseInt ( data [ off ++ ] ) ;
    m = new char [ W ] [ ] {
      null }
      ;
      for ( int y = 0 ;
      y < W ;
      y ++