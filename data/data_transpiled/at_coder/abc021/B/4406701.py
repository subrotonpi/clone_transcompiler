def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
    def __init__ ( self ) :
        self.nums = [ ]
        self.nums.append ( a )
        for i in range ( self.nums.length - 2 ) :
            self.nums.append ( self.nums [ i + 1 ] )
        self.nums.append ( b )
        self.nums.sort ( )
        tmp = None
        for c in self.nums :
            if tmp == c :
                self.print ( "NO" )
                return
            tmp = c
        self.print ( "YES" )
