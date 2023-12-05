static final Chart < Integer > Chart = new Chart < Integer > ( ) {
  private int nr ;
  private enemy = new int [ 0 ] ;
  @ Override public boolean isEnemy ( int [ ] ch ) {
    return enemy . contains ( ch [ 0 ] ) ;
  }
  @ Override public String toString ( ) {
    return "Case #" + nr ;
  }
  @ Override public boolean crossing ( int [ ] taba , int [ ] tabb ) {
    if ( taba [ 0 ] > tabb [ 0 ] ) {
      taba = tabb ;
      tabb = taba ;
    }
    for ( int x = 0 ;
    x < taba . length ;
    x ++ ) {
      if ( taba [ x ] >= tabb [ x ] ) {
        return true ;
      }
    }
    return false ;
  }
  @ Override public int run ( int [ ] ch ) {
    if ( ch . length == 0 ) {
      return 0 ;
    }
    if ( ch . length == 1 ) {
      return 1 ;
    }
    int [ ] ret = new int [ ch . length ] ;
    Arrays . fill ( ret , 0 ) ;
    int xx = 0 ;
    int result = 999 ;
    int found = 0 ;
    for ( int x = start ;
    x < ch . length ;
    x ++ ) {
      enemy = false ;
      for ( int i = 0 ;
      i < ret . length ;
      i ++ ) {
        if ( ret [ i ] > ch [ x ] ) {
          enemy = true ;
          break ;
        }
      }
      if ( ! enemy ) {
        ret [ i ] = ch [ x ] ;
        result = Math . min ( xx , result ) ;
        ret [ i ] -- ;
        found ++ ;
        if ( found == 4 ) {
          break ;
        }
      }
    }
    if ( ! found ) {
      result = Math . min ( run ( Arrays . copyOfRange ( ch , 0 , ret . length ) ) , result ) ;
    }
    return result ;
  }
}
