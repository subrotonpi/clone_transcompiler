public static String [ ] getAlphabet ( int N , int K ) {
  String S = input ( ) ;
  String alpha2num = new String [ N ] ;
  alpha2num . put ( 'a' , 0 ) ;
  alpha2num . put ( 'b' , 1 ) ;
  alpha2num . put ( 'c' , 2 ) ;
  alpha2num . put ( 'd' , 3 ) ;
  alpha2num . put ( 'e' , 4 ) ;
  alpha2num . put ( 'f' , 5 ) ;
  alpha2num . put ( 'g' , 6 ) ;
  alpha2num . put ( 'h' , 7 ) ;
  alpha2num . put ( 'i' , 8 ) ;
  alpha2num . put ( 'j' , 9 ) ;
  alpha2num . put ( 'k' , 10 ) ;
  alpha2num . put ( 'l' , 11 ) ;
  alpha2num . put ( 'm' , 12 ) ;
  alpha2num . put ( 'n' , 13 ) ;
  alpha2num . put ( 'o' , 14 ) ;
  alpha2num . put ( 'p' , 15 ) ;
  alpha2num . put ( 'q' , 16 ) ;
  alpha2num . put ( 'r' , 17 ) ;
  alpha2num . put ( 's' , 18 ) ;
  alpha2num . put ( 't' , 19 ) ;
  alpha2num . put ( 'u' , 20 ) ;
  alpha2num . put ( 'v' , 21 ) ;
  alpha2num . put ( 'w' , 22 ) ;
  alpha2num . put ( 'x' , 23 ) ;
  alpha2num . put ( 'y' , 24 ) ;
  alpha2num . put ( 'z' , 25 ) ;
  String num2alpha = "abcdefghijklmnopqrstuvwxyz" ;
  String [ ] numS = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    numS [ i ] = alpha2num . get ( S . charAt ( i ) ) ;
  }
  List < Integer > sortednumS = new ArrayList < Integer > ( numS ) ;
  Collections . sort ( sortednumS ) ;
  /* tradable */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( sortednumS . contains ( i ) ) {
      sortednumS . remove ( i ) ;
    }
    else {
      K -- ;
    }
  }
  String [ ] smallest