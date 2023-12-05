public static int [ ] [ ] dpTable ( int ... counts ) {
  if ( counts . length > 0 ) {
    return dpTable ( counts . length > 1 ? Arrays . copyOf ( counts , 1 ) : Arrays . copyOf ( counts , counts . length ) ) ;
  }
  else {
    return null ;
  }
}
