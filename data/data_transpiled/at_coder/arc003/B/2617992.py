def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 1
        self.stdin.readline ( )
        self.stdin.readline ( )
        self.data = [ ( s , t ) for s , t in zip ( self.stdin.readline ( ).split ( ) , self.data ) ]
        self.data.sort ( lambda s , t : s.rev )
        self.data.reverse ( )
class Pair ( object ) :
    def __init__ ( self , data ) :
        self.data = data
        self.rev = u''.join ( self.data ).reverse ( )
    def getStr ( self ) :
        return self.data
    def getRev ( self ) :
        return self.rev
