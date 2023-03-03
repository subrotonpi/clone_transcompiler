public static void YESNO ( String ans , String yes , String no ) {
  System . out . println ( Arrays . asList ( no , yes ) . get ( ans ) ) ;
  II = new II ( ) {
    @ Override public int getInt ( ) {
      return Integer . parseInt ( input ( ) ) ;
    }
  }
  ;
  MI = new CollectionUtils ( ) {
    @ Override public int getInt ( ) {
      return Integer . parseInt ( input ( ) ) ;
    }
  }
  ;
  MIL = new CollectionUtils ( ) {
    @ Override public List < Integer > getList ( ) {
      return Collections . singletonList ( MI ) ;
    }
  }
  ;
  MIS = new CollectionUtils ( ) {
    @ Override public List < String > getMIS ( ) {
      return Collections . singletonList ( input ( ) ) ;
    }
  }
  ;
  {
    if ( "" . equals ( s ) ) {
      return true ;
    }
    if ( "dream" . equals ( s . substring ( 0 , 5 ) ) || "erase" . equals ( s . substring ( 5 , 6 ) ) ) {
      return true ;
    }
    return false ;
  }
  public boolean check ( String s ) {
    String S = input ( ) ;
    int i = 0 ;
    int l = S . length ( ) ;
    while ( i < l ) {
      if ( S . substring ( i , i + 7 ) . equals ( "dreamer" ) && check ( S . substring ( i + 7 ) ) ) {
        i += 7 ;
      }
      else if ( S . substring ( i , i + 6 ) . equals ( "eraser" ) && check ( S . substring ( i + 6 ) ) ) {
        i += 6 ;
      }
      else if ( check ( S . substring ( i ) ) ) {
        i += 5 ;
      }
      else {
        return false ;
      }
    }
    return true ;
  }
}
