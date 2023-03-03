static final String solve ( ) throws IOException {
  final BufferedReader fin = null ;
  final String s ;
  final String res ;
  {
    s = sstrip ( ) ;
    res = "" ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      res = Math . max ( s . charAt ( i ) + res , res + s . charAt ( i ) ) ;
    }
    return res ;
  }
  {
    String fname = "a.in" ;
    if ( args . length > 0 ) fname = args [ 0 ] ;
    fin = new BufferedReader ( new FileReader ( fname ) ) ;
    fout = new PrintWriter ( new FileWriter ( fname + ".out" ) ) ;
    final Date t0 = new Date ( ) ;
    final int t = Integer . parseInt ( fin . readLine ( ) ) ;
    for ( int i = 0 ;
    i < t ;
    i ++ ) {
      fout . printf ( "Case #%d: " , i + 1 ) ;
      fout . printf ( "%s\n" , solve ( ) ) ;
    }
    System . out . println ( "Time = %s" , new Date ( ) . getTime ( ) - t0 . getTime ( ) ) ;
    fin . close ( ) ;
    fout . close ( ) ;
  }
  {
    final int [ ] nums = new int [ s . length ( ) ] ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      nums [ i ] = Integer . parseInt ( fin . readLine ( ) ) ;
    }
    final float [ ] fnums = new float [ s . length ( ) ] ;
    for ( int i = 0 ;
    i < fnums . length ;
    i ++ ) {
      fnums [ i ] = Float . parseFloat ( fin . readLine ( ) ) ;
    }
    final int num = Integer . parseInt ( fin . readLine ( ) ) ;
    final String sstrip = fin . readLine ( ) . trim ( ) ;
    final String strs [ ] = fin . readLine ( ) . split ( " " ) ;
    final String arrstr = strs [ a . length ( ) ] ;
    if ( className . equals ( "java.util.Scanner" ) ) {
      return arrstr ;
    }
  }
}
