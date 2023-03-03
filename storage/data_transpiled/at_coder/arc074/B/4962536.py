def _import ( ) :
    from collections import deque
    from time import time
    import sys
    class Main ( object ) :
        class SumedQueue ( deque ) :
            def __init__ ( self , maxSize , isReversed ) :
                self.maxSize = maxSize
                self.sum = 0
                self.queue = None
            def append ( self , n ) :
                self.queue.append ( n )
                self.sum += n
                if len ( self.queue ) > self.maxSize :
                    out = self.queue.pop ( )
                    self.sum -= out
            def total ( self ) :
                return self.sum
        def solve ( self ) :
            f = open ( "/proc/sys/stdin" , "r" )
            N = len ( f.readlines ( ) )
            left = SumedQueue ( N , False )
            right = SumedQueue ( N , True )
            middle = [ i for i in f.readlines ( ) if i.isdigit ( ) ]
            for i in range ( N ) :
                left.append ( f.read ( ) )
            for i in range ( N ) :
                middle [ i ] = f.read ( )
            for i in range ( N ) :
                right.append ( f.read ( ) )
            f.close ( )
            sums = [ left.total ( ) ] + [ left.total ( ) ] + [ right.total ( ) ]
            for i in range ( N - 1 , - 1 , - 1 ) :
                right.append ( middle [ i ] )
                sums [ i ] -= right.total ( )
            max = time ( )
            for i in range ( len ( sums ) ) :
                if sums [ i ] > max :
                    max = sums [ i ]
            print ( max )
    return Main
