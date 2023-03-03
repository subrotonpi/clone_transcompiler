def import import math
class Main ( object ) :
    def __init__ ( self ) :
        self.data = sys.stdin.read ( )
    def __str__ ( self ) :
        return self.data
data = open ( '../data/' ).read ( )
DN = [ ]
cont = 0
for x in data.split ( ) :
    DN.append ( int ( x ) )
    cont += 1
if DN [ 1 ] != 100 :
    print ( int ( math.pow ( 100 , DN [ 0 ] ) * DN [ 1 ] ) )
else :
    print ( int ( math.pow ( 100 , DN [ 0 ] ) * ( DN [ 1 ] + 1 ) ) )
