def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 1
        self.stdin.readline ( )
        self.stdin.readline ( )
        self.data = [ ( x , y ) for x , y in zip ( self.data , self.data ) ]
        self.data.sort ( key = lambda x : x.rev )
class Pair ( object ) :
    def __init__ ( self , data ) :
        self.data = data
        self.rev = u''.join ( self.data ).reverse ( )
    def getStr ( self ) :
        return self.data
    def getRev ( self ) :
        return self.rev
