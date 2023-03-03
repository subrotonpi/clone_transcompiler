static final Scanner IO = new Scanner ( System . in ) {
  File fin = null ;
  File fout = null ;
  {
    int n = num ( ) ;
    List < Integer > a = nums ( ) ;
    int res = 0 ;
    while ( a . size ( ) > 0 ) {
      int t = min ( a ) ;
      int idx = a . indexOf ( t ) ;
      res += min ( idx , a . size ( ) - idx - 1 ) ;
      a . remove ( t ) ;
    }
    return res ;
  }
  {
    String fname = "a.in" ;
    if ( args . length > 0 ) fname = args [ 0 ] ;
    FileReader fin ;
    BufferedReader br = new FileReader ( fname ) ;
    FileWriter fout = new FileWriter ( fname + ".txt" ) ;
    Date t0 = new Date ( ) ;
    int t = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int i = 0 ;
    i < t ;
    i ++ ) {
      fout . write ( "Case #" + ( i + 1 ) + ": " ) ;
      fout . write ( solve ( ) . toString ( ) + "\n" ) ;
    }
    System . out . println ( "Time = " + ( new Date ( ) . getTime ( ) - t0 . getTime ( ) ) ) ;
    fin . close ( ) ;
    fout . close ( ) ;
  }
  {
    int [ ] nums = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) nums [ i ] = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) fnums [ i ] = Float . parseFloat ( br . readLine ( ) ) ;
    int num = Integer . parseInt ( br . readLine ( ) ) ;
    int sstrip = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) strs [ i ] = br . readLine ( ) . split ( " " ) ;
    String arrstr = Arrays . toString ( a . toArray ( ) ) ;
    if ( __name__ . equals ( "java.util.Scanner" ) ) {
      return new Scanner ( fout ) ;
    }
  }
}
