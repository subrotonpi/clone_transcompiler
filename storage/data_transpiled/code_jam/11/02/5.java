private static BufferedReader reader = new BufferedReader ( new FileReader ( "magicka.in" ) ) {
  public String readLine ( ) {
    return readLine ( ) ;
  }
  public String readLine ( ) {
    return readLine ( ) ;
  }
  public PrintWriter fo ( ) throws IOException {
    return new PrintWriter ( new BufferedWriter ( new FileWriter ( "magicka.out" ) ) ) ;
  }
  public boolean cancombine ( String string , List < String > lis ) {
    for ( String i : lis ) {
      if ( string . contains ( i . substring ( 0 , 2 ) ) || string . contains ( i . substring ( 0 , 2 ) ) ) return true ;
    }
    return false ;
  }
  public String ccombine ( String string , List < String > lis ) {
    for ( String i : lis ) {
      if ( string . contains ( i . substring ( 0 , 2 ) ) || string . contains ( i . substring ( 0 , 2 ) ) ) return i . substring ( 2 ) ;
    }
    return "" ;
  }
  public boolean canremove ( String s , char ch , List < String > oppose ) {
    for ( String i : oppose ) {
      if ( ch == i . charAt ( 0 ) && s . contains ( i . substring ( 1 ) ) ) return true ;
      if ( ch == i . charAt ( 1 ) && s . contains ( i . charAt ( 0 ) ) ) return true ;
    }
    return false ;
  }
  public String remove ( String s , char ch ) {
    String t = "" ;
    for ( String i : s . split ( " " ) ) {
      if ( i != ch ) t += i ;
    }
    return t ;
  }
  public int t ( ) {
    for ( int i = 1 ;
    i <= t ;
    i ++ ) {
      List < String > combine = new ArrayList < String > ( ) ;
      List < String > oppose = new ArrayList < String > ( ) ;
      String [ ] line = input . readLine ( ) . trim ( ) . split ( "\\s+" ) ;
      int pos = 0 ;
      int c = Integer . parseInt ( line [ pos ++ ] ) ;
      for ( int j = pos ;
      j <= pos + c ;
      j ++ ) combine . add ( line [ j ] ) ;
      pos += c ;
      int d = Integer . parseInt ( line [ pos ++ ] ) ;
      for ( int j = pos ;
      j <= pos + d ;
      j ++ ) oppose . add ( line [ j ] ) ;
      pos += d ;
      int l = Integer . parseInt ( line