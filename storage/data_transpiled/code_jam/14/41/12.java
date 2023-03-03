public static void main ( Scanner in ) {
  int n = in . nextInt ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Arrays . stream ( in . nextLine ( ) . split ( " " ) ) . map ( N -> Integer . parseInt ( in . nextLine ( ) ) ) . forEach ( X -> {
    }
    ) ;
  }
  List < Integer > disks = new ArrayList < > ( ) ;
  for ( String s : in . nextLine ( ) . split ( " " ) ) {
    disks . add ( Integer . parseInt ( s ) ) ;
  }
  Collections . sort ( disks ) ;
  int answer = 0 ;
  while ( disks . size ( ) > 0 ) {
    if ( disks . size ( ) == 1 ) {
      answer ++ ;
      disks . remove ( disks . size ( ) - 1 ) ;
    }
    else {
      if ( disks . get ( 0 ) + disks . get ( disks . size ( ) - 1 ) <= X ) {
        answer ++ ;
        disks . remove ( 0 ) ;
        disks . remove ( disks . size ( ) - 1 ) ;
      }
      else {
        answer ++ ;
        disks . remove ( disks . size ( ) - 1 ) ;
      }
    }
  }
  System . out . println ( "Case #" + ( i + 1 ) + ": " + answer ) ;
}
