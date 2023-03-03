@ VisibleForTesting static String solve ( List < Pair > combs , List < Pair > opos , List < String > invoke ) throws IOException {
  print >> stderr = combs . stream ( ) . map ( Pair :: new ) . collect ( Collectors . joining ( ", " ) ) ;
  Map < String , String > dcombs = new HashMap < > ( ) ;
  for ( Pair c : combs ) {
    dcombs . put ( c . first + c . second , c . second ) ;
    dcombs . put ( c . second + c . first , c . second ) ;
  }
  print > stderr = dcombs . stream ( ) . map ( Pair :: new ) . collect ( Collectors . joining ( ", " ) ) ;
  Map < String , String > dopos = new HashMap < > ( ) ;
  for ( Pair o : opos ) {
    dopos . put ( o . first , dopos . getOrDefault ( o . first , "" ) + o . second ) ;
    dopos . put ( o . second , dopos . getOrDefault ( o . second , "" ) + o . first ) ;
  }
  print > stderr = dopos . stream ( ) . map ( Pair :: new ) . collect ( Collectors . joining ( ", " ) ) ;
  String cur = "" ;
  for ( String e : invoke ) {
    cur += e ;
    boolean combined = false ;
    while ( cur . length ( ) >= 2 ) {
      String pair = cur . substring ( cur . length ( ) - 2 ) ;
      String res = dcombs . get ( pair ) ;
      if ( res == null ) break ;
      cur = cur . substring ( 0 , cur . length ( ) - 2 ) + res ;
      combined = true ;
    }
    if ( ! combined ) {
      List < String > op = dopos . get ( e ) ;
      if ( op != null ) {
        for ( String oo : op ) {
          if ( cur . contains ( oo ) ) cur = "" ;
        }
      }
    }
    print > stderr = cur ;
  }
  return "[" + new String ( Collections . reverseOrder ( cur ) ) + "]" ;
}
