@ Nonnull public static Iterable < Integer > tri ( @ Nonnull final Iterable < Integer > o ) {
  return o . iterator ( ) . next ( ) . map ( o ) . map ( o :: iterator ) ;
}
