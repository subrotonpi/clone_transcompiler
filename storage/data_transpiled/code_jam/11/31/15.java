static final String input = "Enter a line to print out..." ;
/* Print the output to stdout */
final String printe = "Enter a line to print out..." ;
/* Print the output to stdout */
final String replace = System . getProperty ( "line.separator" ) + " " + System . getProperty ( "line.separator" ) + " " + System . getProperty ( "line.separator" ) ;
/* Simulate the printing of a line to print out... */
final int r = Integer . parseInt ( input ) ;
final int c = Integer . parseInt ( input ) ;
final String [ ] t = new String [ r ] ;
for ( int b = 0 ;
b < r ;
b ++ ) {
  t [ b ] = input . substring ( 0 , b ) ;
}
/* Print the output to stdout */
printe ( t ) ;
for ( int y = 0 ;
y < r - 1 ;
y ++ ) {
  int x = 0 ;
  while ( ( x < c - 1 ) && ( t [ y ] . charAt ( x ) == '#' ) ) {
    if ( t [ y ] . charAt ( x + 1 ) == '#' && t [ y + 1 ] . charAt ( x ) == '#' && t [ y + 1 ] . charAt ( x + 1 ) == '#' ) {
      t [ y ] = replace ( t [ y ] , x , '/' ) ;
      t [ y ] = replace ( t [ y ] , x + 1 , "X" ) ;
      t [ y + 1 ] = replace ( t [ y + 1 ] , x , 'X' ) ;
      t [ y + 1 ] = replace ( t [ y + 1 ] , x + 1 , '/' ) ;
      x ++ ;
    }
    else {
      /* Impossible */
    }
  }
  x ++ ;
}
/* Print the output to stdout */
if ( __name__ == "java.lang.String" ) {
  for ( int i = 0 ;
  i < Integer . parseInt ( input ) ;
  i ++ ) {
    System . out . println ( "Case #" + ( i + 1 ) + ":\n" + simulate ( ) ) ;
  }
}
return "\n"