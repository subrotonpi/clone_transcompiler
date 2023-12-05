def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys.stdin
        self.N = self.sys.maxsize
        self.K = self.sys.maxsize
        self.t = [ ]
        for i in range ( self.N ) :
            self.t.append ( self.sys.stdin.readline ( ) )
        self.a = [ ]
        flag = False
        index = - 1
        for i in range ( self.N - 2 ) :
            self.a.append ( self.t [ i ] + self.t [ i + 1 ] + self.t [ i + 2 ] )
            if self.a [ i ] < self.K :
                flag = True
                index = i + 2
                break
        if flag :
            print ( self.index + 1 )
        else :
            print ( - 1 )
