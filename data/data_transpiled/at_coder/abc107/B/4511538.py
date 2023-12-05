def _import ( ) :
    import sys
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    class Main :
        WHITE = string
        BLACK = string.whitespace
    def process ( H , W , a ) :
        ( removed_blank_rows , transposed ) = a
        compressed_transpose = [ ]
        return string.join ( map ( string.join , transposed ) )
    def keep_row_with_any_black ( row ) :
        return row.chars.any ( string.join ( map ( string.join , transposed ) ) )
    def is_black ( c ) :
        return c == BLACK.codePointAt ( 0 )
    def transpose ( grid ) :
        if not grid :
            return [ ]
        else :
            W = len ( grid [ 0 ] )
            return string.join ( map ( string.join , grid ) )
    def main ( ) :
        sc = string.split ( "\n" )
        H = sc.__next__ ( )
        W = sc.__next__ ( )
        a = string.join ( map ( lambda row : row [ 0 ] , sc.values ( ) ) )
        result = process ( H , W , a )
        result.sort ( )
        return result
    return main
