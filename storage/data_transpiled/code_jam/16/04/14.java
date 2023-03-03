static final String os = System . getProperty ( "os.name" ) ;
ljq4j . load ( "D-large.in" ) ;
System . out . println ( "running" ) ;
{
  int k = Integer . parseInt ( System . getProperty ( "line.separator" ) ) ;
  int c = Integer . parseInt ( System . getProperty ( "line.separator" ) ) ;
  int s = Integer . parseInt ( System . getProperty ( "line.separator" ) ) ;
  int [ ] ans = new int [ k ] ;
  for ( int i = 0 ;
  i < ans . length ;
  i ++ ) {
    ans [ i ] = ( i + 1 ) * k * ( c - 1 ) ;
  }
  return StringUtils . join ( ans , " " ) ;
}
