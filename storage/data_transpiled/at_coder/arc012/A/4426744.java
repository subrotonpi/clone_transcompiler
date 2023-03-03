{
  l = new ArrayList < > ( ) ;
  l . add ( Calendar . SUNDAY ) ;
  l . add ( Calendar . MONDAY ) ;
  l . add ( Calendar . TUESDAY ) ;
  l . add ( Calendar . WEDNESDAY ) ;
  l . add ( Calendar . TUESDAY ) ;
  l . add ( Calendar . WEDNESDAY ) ;
  l . add ( Calendar . THURSDAY ) ;
  String s = input . readLine ( ) ;
  if ( s . equals ( Calendar . SUNDAY ) ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( l . indexOf ( s ) ) ;
  }
}
