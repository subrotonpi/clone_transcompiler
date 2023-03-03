public static void IOHandlerObject ( ) {
  String source = "b.in" ;
  String target = "b.out" ;
  RandomAccessFile sfile = null ;
  RandomAccessFile tfile = null ;
  {
    sfile = new RandomAccessFile ( source , "a+" ) ;
    sfile . seek ( 0 ) ;
    tfile = new RandomAccessFile ( target , "rw+" ) ;
  }
  {
    int len = 0 ;
    for ( int i = 0 ;
    i < 30 ;
    i ++ ) {
      int [ ] at = new int [ 3 ] ;
      int [ ] kt = new int [ 3 ] ;
      int tem = 1 ;
      for ( int j = 0 ;
      j < 3 ;
      j ++ ) {
        int ar = at [ j ] ;
        int br = bt [ j ] ;
        int kr = kt [ j ] ;
        tem *= multipliers [ ar + br + kr ] ;
      }
      ct += tem ;
    }
  }
  {
    String inputs = sfile . readLine ( ) . trim ( ) ;
    if ( len == 0 ) {
      return inputs ;
    }
    if ( len == 1 ) {
      return inputs . split ( " " ) ;
    }
    if ( len == 2 ) {
      return Arrays . asList ( inputs . split ( " " ) ) ;
    }
  }
  {
    String s ;
    if ( len == 3 ) {
      s = " " ;
    }
    tfile . write ( s ) ;
  }
  IOHandler = new IOHandlerObject ( ) ;
  Method g = IOHandler . getMethod ( "IOHandler" , String . class ) ;
  BufferedWriter w = IOHandler . getWriteWriter ( ) ;
  final int len = 30 ;
  {
    String s ;
    while ( len > 0 ) {
      s = String . valueOf ( len % 2 ) + s ;
      len /= 2 ;
    }
    s = ( len == 3 ) ? "0" + s : s . substring ( len - 30 ) ;
    StringBuilder res = new StringBuilder ( ) ;
    for ( int i = 0 ;
    i < len ;
    i ++ ) {
      if ( s . charAt ( i ) == '1' ) res . append ( s . substring ( 0 , i ) + "0" + "_" ) ;
    }
    res . append ( s ) ;
    return res . toString ( ) ;
  }
  HashMap < String , Integer > multipliers = new HashMap < String , Integer > ( ) ;
  multipliers . put ( "000" , 1 ) ;
  multipliers . put ( "001" , 0 ) ;
  multipliers . put ( "00_" , 1 ) ;
  multipliers . put ( "010" , 1 ) ;
  multipliers