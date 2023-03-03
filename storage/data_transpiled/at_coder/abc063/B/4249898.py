def main ( ) :
    import sys
    from os import urandom
    import string
    from itertools import islice
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = string
        def __str__ ( self ) :
            return ""
        def __repr__ ( self ) :
            return "<string>"
    s = open ( "/etc/init.d/" , "r" ).read ( )
    c = s.split ( "\n" )
    c.sort ( )
    islice = islice ( c , 1 , len ( c ) )
    if islice :
        islice = islice ( c , 0 , len ( c ) )
    print ( islice ( islice ( c ) , 0 , len ( c ) ) )
