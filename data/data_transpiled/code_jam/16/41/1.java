static void initialize ( ) {
}
{
  return ;
}
{
  int totalCases = ( int ) read ( 0 ) ;
  for ( int i = 1 ;
  i <= totalCases ;
  i ++ ) {
    write ( outputFormat . replace ( "%d" , Integer . toString ( i ) ) ) ;
  }
}
{
  int n = 0 ;
  int r = read ( 0 ) ;
  int p = read ( 0 ) ;
  int s = read ( 0 ) ;
  int k = 2 * n / 3 ;
  if ( r != k && r != k + 1 ) {
    write ( "IMPOSSIBLE" ) ;
    return ;
  }
  if ( p != k && p != k + 1 ) {
    write ( "IMPOSSIBLE" ) ;
    return ;
  }
  if ( s != k && s != k + 1 ) {
    write ( "IMPOSSIBLE" ) ;
    return ;
  }
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    int [ ] res = generate ( n , i ) ;
    if ( Arrays . equals ( res , "P" ) != p ) continue ;
    if ( Arrays . equals ( res , "R" ) != r ) continue ;
    break ;
    for ( int level = 0 ;
    level < n ;
    level ++ ) {
      for ( int i = 0 ;
      i < res . length / 2 ;
      i ++ ) {
        if ( res [ 2 * i ] > res [ 2 * i + 1 ] ) {
          res [ 2 * i ] = res [ 2 * i + 1 ] ;
        }
      }
      Arrays . sort ( res ) ;
    }
    write ( res [ 0 ] ) ;
  }
  outputFormat = "Case #%d: " ;
  String filename = input . nextLine ( ) . trim ( ) ;
  BufferedReader sreader = null ;
  BufferedReader treader = null ;
  if ( filename != "" ) {
    sreader = new BufferedReader ( new FileReader ( filename + ".in" ) ) ;
    sreader . mark ( 0 ) ;
    treader = new BufferedReader ( new FileReader ( filename + ".out" ) ) ;
  }
  {
    String inputLine ;
    if ( sreader . ready ( ) ) inputLine = sreader . readLine ( ) . trim ( ) ;
    else inputLine = input . nextLine ( ) ;
    if ( mode == 0 ) return inputLine ;
    if ( mode == 1 ) return inputLine . split ( " " ) ;
    if ( mode == 2 ) return Collections . singletonList ( inputLine ) ;
  }
}
