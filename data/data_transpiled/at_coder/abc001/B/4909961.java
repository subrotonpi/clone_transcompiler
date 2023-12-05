public static int hi = Integer . parseInt ( input ) {
  int hi ;
  if ( ( hi < 100 ) && ( hi > 0 ) ) {
    System . out . println ( 0 + "" ) ;
  }
  else if ( ( hi >= 100 ) && ( hi <= 5000 ) ) {
    System . out . println ( ( int ) ( hi / 100 ) + "" ) ;
  }
  else if ( ( hi >= 6000 ) && ( hi <= 30000 ) ) {
    System . out . println ( ( int ) ( hi / 1000 + 50 ) + "" ) ;
  }
  else if ( ( hi >= 35000 ) && ( hi <= 70000 ) ) {
    System . out . println ( ( int ) ( ( hi / 1000 - 30 ) / 5 + 80 ) + "" ) ;
  }
  else if ( ( hi > 70000 ) ) {
    System . out . println ( 89 + "" ) ;
  }
  return hi ;
}
