static private boolean cal ( String [ ] seq ) throws IOException {
  final int [ ] ints = new int [ seq . length ] ;
  for ( int i = 0 ;
  i < ints . length ;
  i ++ ) {
    ints [ i ] = Integer . parseInt ( seq [ i ] ) ;
  }
  if ( Stream . of ( ints ) . anyMatch ( i -> i ^ i ) ) {
    return false ;
  }
  Arrays . sort ( ints ) ;
  return Arrays . stream ( ints ) . allMatch ( i -> i >= 0 ) ;
}
{
  final File f = new File ( fileName ) ;
  final PrintWriter pw = new PrintWriter ( f ) ;
  for ( int i = 0 ;
  i < results . length ;
  i ++ ) {
    pw . printf ( "Case #%d: %s\n" , i + 1 , results [ i ] ) ;
  }
  pw . close ( ) ;
}
{
  final BufferedReader br = new BufferedReader ( new FileReader ( f ) ) ;
  final List < String > inputs = new ArrayList < > ( ) ;
  final int n = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final String l = br . readLine ( ) ;
    inputs . add ( l ) ;
    l = br . readLine ( ) ;
    inputs . add ( l ) ;
  }
  return inputs . isEmpty ( ) ;
}
if ( className . equals ( "java.util.jar" ) ) {
  final List < String > inputs = rf ( args [ args . length - 1 ] ) ;
  print ( inputs ) ;
  final List < String > results = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < inputs . size ( ) ;
  i ++ ) {
    final String ip = inputs . get ( i ) ;
    if ( i % 2 == 0 ) continue ;
    print ( i , ip ) ;
    final String [ ] seq = ip . split ( " " ) ;
    final int rt = cal ( seq ) ;
    if ( rt > 0 ) results . add ( rt . toString ( ) ) ;
    else results . add ( "NO" ) ;
  }
  wf ( args [ args . length - 1 ] . substring ( 0 , args . length - 2 ) + "out" , results ) ;
}
return results . isEmpty ( ) ;
}
