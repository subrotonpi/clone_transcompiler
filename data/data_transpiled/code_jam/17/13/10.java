static final String getFilePath ( ) {
  final String input = "" ;
  final String [ ] lines = input . split ( "\n" ) ;
  final int count = Integer . parseInt ( lines [ 0 ] ) ;
  final String [ ] resultLines = new String [ count ] ;
  int iLine = 1 ;
  boolean multiLineResult = false ;
  for ( int iTry = 0 ;
  iTry < count ;
  iLine ++ ) {
    final int iLastResult = Integer . parseInt ( lines [ iLine ] ) ;
    final int hp0 = hp ;
    queue = new String [ iNext ] ;
    queue [ iNext ] = new String [ iNext ] ;
    queue [ iNext ] = new String [ iNext ] ;
    int index = 0 ;
    checked = new HashSet < String > ( ) ;
    while ( index < queue . length ) {
      final int iNext = Integer . parseInt ( lines [ iNext ] ) ;
      ++ iNext ;
      if ( multiLineResult ) {
        resultLines [ iNext ++ ] = "Case #" + iTry + 1 + ":" ;
        resultLines [ iNext ++ ] = new String ( getResult ( ( String ) null , 0 , iNext ) ) ;
      }
      else {
        resultLines [ iNext ++ ] = "Case #" + iNext + 1 + ": " + getResult ( ( String ) null , 0 , iNext ) ;
      }
    }
    if ( iNext < 0 ) {
      final int iNext = Integer . parseInt ( lines [ iNext ] ) ;
      ++ iNext ;
      if ( iNext < 0 ) {
        return i + 1 ;
      }
      if ( hp - attK <= 0 ) {
        if ( hp - attK1 > 0 ) {
          check ( queue , checked , new String [ ] {
            hp - attK1 , att , hpK , attK1 , i + 1 }
            ) ;
          }
          if ( hp0 - attK > 0 ) {
            check ( queue , checked , new String [ ] {
              hp0 - attK , att , hpK , attK1 , i + 1 }
              ) ;
            }
          }
          else {
            check ( queue , checked , new String [ ] {
              hp - attK , att , hpK - att , attK , i + 1 }
              ) ;
              if ( b > 0 ) {
                check ( queue , checked , new String [ ] {
                  hp - attK , att + b , hpK , attK , i + 1 }
                  ) ;
                }
                if ( d > 0 ) {
                  check ( queue ,