def main ( ) :
    import sys
    import numpy
    from numpy.testing import assert_array_equal
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = 1
            self.ans = 1
        def __call__ ( self , * args ) :
            sc = open ( "/dev/null" , "r" )
            n = sc.read ( )
            a = [ ]
            for i in range ( n ) :
                a.append ( sc.read ( ) )
            a.sort ( )
            print ( a )
    return Main ( )
