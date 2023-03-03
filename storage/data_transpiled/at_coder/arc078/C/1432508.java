public static boolean query ( String val ) {
  System . out . println ( "?" + val ) ;
  String ans = input . nextLine ( ) ;
  if ( ans . equals ( "Y" ) ) {
    return true ;
  }
  return false ;
}
final int LIMIT = 10 * 9 ;
final Class < ? > clazz = val . getClass ( ) ;
if ( clazz . isAnnotationPresent ( Query . class ) ) {
  if ( ( query ( LIMIT ) ) && ( clazz . isAnnotationPresent ( Query . class ) ) ) {
    int res = 1 ;
    while ( ( res = query ( 2 * res ) ) && ( clazz . isAnnotationPresent ( Query . class ) ) ) {
      System . out . println ( "!" + res ) ;
      System . exit ( 0 ) ;
    }
    res *= 10 ;
  }
  int digit = 10 ;
  int res = LIMIT ;
  while ( ( res = query ( res ) ) && ( clazz . isAnnotationPresent ( Query . class ) ) ) {
    if ( ( query ( res ) ) && ( clazz . isAnnotationPresent ( Query . class ) ) ) {
      break ;
    }
    res = res / 10 ;
    digit -- ;
  }
  int query = 10 * ( digit ) ;
  int keta = 0 ;
  while ( ( keta = query ( keta = query ( keta = low ) ) ) && ( clazz . isAnnotationPresent ( Query . class ) ) ) {
    int low = query ;
    int high = query * 10 ;
    int left = 0 ;
    int right = 10 ;
    while ( ( right - left > 1 ) && ( clazz . isAnnotationPresent ( Query . class ) ) ) {
      int med = ( right + left ) / 2 ;
      if ( keta == 0 && med == 0 ) {
        left = med ;
        continue ;
      }
      StringBuilder val1 = new StringBuilder ( String . valueOf ( low ) ) ;
      val1 . append ( String . valueOf ( med ) ) ;
      int intValue = Integer . parseInt ( val1 . toString ( ) ) ;
      System . out . println ( "? " + intValue ) ;
      ans = input . nextLine ( ) ;
      if ( ( ans . equals ( "Y" ) ) && ( keta == digit - 1 ) ) {
        query = val1 . toString ( ) ;
      }
      right = med ;
      continue ;
    }
    keta ++ ;
  }
  query = query / 10 ;
  System . out . println ( "! " + query ) ;
  return true ;
}
