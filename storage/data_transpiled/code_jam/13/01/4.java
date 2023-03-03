public static String filename = "A-large.in" ;
Scanner FILE = new Scanner ( new FileReader ( filename ) ) ;
int T = Integer . parseInt ( FILE . nextLine ( ) ) ;
/* get the column of the array */
char [ ] [ ] array = new char [ T ] [ ] ;
/* find the column of the array */
for ( int i = 0 ;
i < array . length ;
i ++ ) {
  array [ i ] = array [ i ] [ i ] ;
}
/* find the column of the array */
for ( int i = 0 ;
i < T ;
i ++ ) {
  char [ ] line = array [ i ] ;
  for ( int j = 0 ;
  j < line . length ;
  j ++ ) {
    if ( line [ j ] == 'T' ) {
      /* find the column of the array */
      char elem = line [ j ] ;
      if ( elem == 'T' ) {
        /* find the column of the array */
      }
      /* find the column of the array */
      int [ ] dupArray = new int [ 4 ] ;
      Iterator < String > iterator = array . iterator ( ) ;
      while ( iterator . hasNext ( ) ) {
        dupArray [ i ] = new char [ 4 ] ;
        int j = iterator . next ( ) . length ( ) ;
        if ( array [ i ] [ j ] == 'T' ) {
          /* find the column of the array */
          for ( int j = 0 ;
          j < 4 ;
          j ++ ) {
            char elem = iterator . next ( ) . charAt ( j ) ;
            if ( array [ i ] [ j ] == 'T' ) {
              /* find the column of the array */
              if ( getCol ( dupArray , i ) == new char [ 4 ] ) {
                /* find the column of the array */
              }
            }
          }
        }
      }
      /* find the column of the array */
      if ( dupArray [ 3 - i ] == 'O' ) {
        /* find the column of the array */
        for ( int j = 0 ;
        j < 4 ;
        j ++ ) {
          if ( dupArray [ j ] == 'T' ) {
            / * ▁ find ▁