def _import ( s ) :
    from os import listdir
    import os
    class Main ( object ) :
        def __init__ ( self , s ) :
            self.s = s
        def reverse ( self ) :
            if self.s == "" : return ""
            else : return reverse ( self.s [ 1 : ] ) + self.s [ 0 ]
    def main ( self ) :
        with open ( "/proc/self/" ) as sc :
            N = len ( sc.read ( ) )
        dictionary = [ ]
        for n in range ( N ) :
            dictionary.append ( reverse ( sc.read ( ) ) )
        dictionary.sort ( )
        for n in dictionary :
            print ( reverse ( n ) )
