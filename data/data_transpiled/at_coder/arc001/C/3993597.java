static final class QueenSet {
  private final String [ ] flds ;
  {
    flds = flds . clone ( ) ;
  }
  public boolean setLeastQueen ( ) {
    flds = flds . clone ( ) ;
    if ( isStartEnable ( ) == false ) return false ;
    return true ;
  }
  public void main ( ) {
    StringBuilder sb = new StringBuilder ( "" ) ;
    for ( int i = 0 ;
    i < flds . length ;
    i ++ ) {
      sb . append ( input . charAt ( i ) ) ;
    }
    QueenSet qs = new QueenSet ( sb . toString ( ) ) ;
    if ( qs . setLeastQueen ( ) ) {
      for ( String temp : qs . flds ) {
        System . out . println ( temp ) ;
      }
    }
    else {
      System . out . println ( "No Answer" ) ;
    }
  }
  public boolean setNext ( int x , int setCount ) {
    if ( x < 8 ) {
      for ( int y = 0 ;
      y <= 8 ;
      y ++ ) {
        if ( "Q" . equals ( flds [ x ] ) ) {
          if ( isSetEnable ( x , y ) ) {
            if ( setNext ( x + 1 , setCount + 1 ) ) return true ;
            continue ;
          }
        }
        if ( isSetEnable ( x , y ) ) {
          String orgX = sb . toString ( ) ;
          if ( y == 0 ) {
            sb . append ( "Q" ) . append ( flds [ x ] . substring ( 1 , 8 ) ) ;
          }
          else if ( y == 7 ) {
            sb . append ( flds [ x ] . substring ( 0 , 7 ) ) . append ( "Q" ) ;
          }
          else {
            sb . append ( flds [ x ] . substring ( 0 , y ) ) . append ( "Q" ) . append ( flds [ x ] . substring ( y + 1 , 8 ) ) ;
          }
          if ( setNext ( x + 1 , setCount + 1 ) ) return true ;
          sb . append ( orgX ) ;
        }
      }
    }
    if ( setCount == 8 ) return true ;
    else return false ;
  }
  public boolean isStartEnable ( ) {
    for ( int x = 0 ;
    x <= 8 ;
    x ++ ) {
      if ( "Q" . equals ( flds [ x ] ) ) {
        for ( int y = 0 ;
        y <= 8 ;
        y ++ ) {
          if ( flds [ x ] . charAt ( y ) == 'Q' ) {
            if (