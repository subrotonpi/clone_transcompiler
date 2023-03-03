static final int N = System . getProperty ( "line.format.input" ) . length ;
/* Find the number of engines that are not specified in the file */
for ( int k = 0 ;
k < queries . length ;
k ++ ) {
  if ( queries [ k ] . equals ( engine ) ) {
    return k - q ;
  }
}
/* Case #*/
int N_Cases = 0 ;
int s = - 1 ;
while ( q < queries . length ) {
  s ++ ;
  int maxUsefulness = 0 ;
  for ( int i = 0 ;
  i < N_Cases ;
  i ++ ) {
    int e = engines [ i ] ;
    int thisUsefulness = engineUsefulness ( e , queries , q ) ;
    if ( thisUsefulness > maxUsefulness ) {
      maxUsefulness = thisUsefulness ;
    }
  }
  q = q + maxUsefulness ;
}
BufferedReader br = new BufferedReader ( new FileReader ( "A-large.in" ) ) ;
int N_Cases = Integer . parseInt ( br . readLine ( ) ) ;
for ( int case = 0 ;
case < N_Cases ;
case ++ ) {
  int N_Engines = Integer . parseInt ( br . readLine ( ) ) ;
  List < String > engines = new ArrayList < String > ( ) ;
  for ( int eng = 0 ;
  eng < N_Engines ;
  eng ++ ) {
    String newEngine = br . readLine ( ) ;
    newEngine = newEngine . substring ( 0 , newEngine . length ( ) - 1 ) ;
    engines . add ( newEngine ) ;
  }
  int N_Queries = Integer . parseInt ( br . readLine ( ) ) ;
  int N_Switches ;
  if ( N_Queries == 0 ) {
    N_Switches = 0 ;
  }
  else {
    List < String > queries = new ArrayList < String > ( ) ;
    for ( int q = 0 ;
    q < N_Queries ;
    q ++ ) {
      String newQuery = br . readLine ( ) ;
      newQuery = newQuery . substring ( 0 , newQuery . length ( ) - 1 ) ;
      queries . add ( newQuery ) ;
    }
    N_Switches = switches ( engines , queries ) ;
  }
  System . out . printf ( "Case #%d: %d%n" , ( case + 1 ) , N_Switches ) ;
}
br . close ( ) ;
return N_Cases ;
}
