public static int atoi ( String a ) {
  switch ( a ) {
    case "a" : return 0 ;
    case "b" : return 1 ;
    case "c" : return 2 ;
    case "d" : return 3 ;
    case "e" : return 4 ;
    case "f" : return 5 ;
    case "g" : return 6 ;
    case "h" : return 7 ;
    case "i" : return 8 ;
    case "j" : return 9 ;
    case "k" : return 10 ;
    case "l" : return 11 ;
    case "m" : return 12 ;
    case "n" : return 13 ;
    case "o" : return 14 ;
    case "p" : return 15 ;
    case "q" : return 16 ;
    case "r" : return 17 ;
    case "s" : return 18 ;
    case "t" : return 19 ;
    case "u" : return 20 ;
    case "v" : return 21 ;
    case "w" : return 22 ;
    case "x" : return 23 ;
    case "y" : return 24 ;
    case "z" : return 25 ;
  }
  /* print(ans); */
  int n = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s . add ( input ( ) ) ;
  }
  int [ ] [ ] d = new int [ 26 ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < s [ i ] . length ;
    j ++ ) {
      d [ atoi ( s [ i ] [ j ] ) ] [ i ] ++ ;
    }
  }
  String ans = "" ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    ans += itoa ( i ) * Math . min ( d [ i ] ) ;
  }
  System . out . println ( ans ) ;
  return ans . length ( ) ;
}
