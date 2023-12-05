static String s = list ( new HashSet < String > ( Collections . singletonList ( input ) ) ) ;
return s . count ( 'N' ) == s . count ( 'S' ) && s . count ( 'E' ) == s . count ( 'W' ) ? "Yes" : "No" ;
}
