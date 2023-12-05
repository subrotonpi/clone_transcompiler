static final HashMap < String , Integer > engines = new HashMap < String , Integer > ( ) ;
queries = new ArrayList < String > ( ) ;
{
  int numTrainA = 0 ;
  int numTrainB = 0 ;
  int n = 0 ;
  boolean bNew = true ;
  while ( n < ( numA + numB ) ) {
    if ( tt [ n ] [ 2 ] == 0 ) {
      if ( bNew ) {
        int nBackup = n ;
        tt [ n ] [ 2 ] = 1 ;
        int time = tt [ n ] [ 1 ] ;
        if ( tt [ n ] [ 3 ] == 1 ) {
          numTrainA ++ ;
          int type = 2 ;
        }
        else {
          numTrainB ++ ;
          type = 1 ;
        }
        bNew = false ;
      }
      else if ( tt [ n ] [ 3 ] == type ) {
        if ( tt [ n ] [ 0 ] >= time ) {
          tt [ n ] [ 2 ] = 1 ;
          time = tt [ n ] [ 1 ] ;
          if ( type == 1 ) type = 2 ;
          else type = 1 ;
        }
      }
      n ++ ;
      if ( n >= ( numA + numB ) && bNew != true ) {
        bNew = true ;
        n = nBackup ;
      }
    }
    for ( ;
    n < tt . length ;
    n ++ ) {
      System . out . println ( tt [ n ] ) ;
    }
  }
  {
    String a = str . substring ( 0 , n ) ;
    String b = str . substring ( n + 1 ) ;
    String aH = a . substring ( n + 1 ) ;
    String aM = a . substring ( n + 1 ) ;
    String bH = b . substring ( n + 1 ) ;
    String bM = b . substring ( n + 1 ) ;
    int aRet = Integer . parseInt ( aH ) * 60 + Integer . parseInt ( aM ) ;
    int bRet = Integer . parseInt ( bH ) * 60 + Integer . parseInt ( bM ) ;
    return engines ;
  }
}
