def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
    def __getitem__ ( self , key ) :
        self.a = sys.stdin.read ( )
    def count ( self ) :
        l = 0
        while l < N :
            r = l + 1
            while r < N and a [ r ] > a [ r - 1 ] :
                count += r - l
                r += 1
            l = r
        print ( count )
