def import _Counter
from collections import Counter
class Counter ( Counter ) :
    def __init__ ( self ) :
        Counter.__init__ ( self )
    def get ( self , elm ) :
        return self.getOrDefault ( elm , 0 )
    def add ( self , elm ) :
        self.put ( elm , self.get ( elm ) + 1 )
class Pair ( E , F ) :
    def __init__ ( self , first , second ) :
        self.first = first
        self.second = second
    def __repr__ ( self ) :
        return "<%s,%s>" % ( self.first , self.second )
    def __hash__ ( self ) :
        return self.first * 30011 + self.second + 2
    def __eq__ ( self , other ) :
        if self == other : return True
        if not isinstance ( other , tuple ) : return False
        if __class__ ( other ) != type ( other ) : return False
        another = other [ 0 ]
        return self.first == another [ 0 ] and self.second == another [ 1 ]
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
    H , W , N = next ( )
    count = Counter ( )
    for n in range ( N ) :
        A , B = next ( )
        for a in range ( A - 1 , A + 1 ) :
            for b in range ( B - 1 , B + 1 ) :
                if a >= 2 and a <= H - 1 and b >= 2 and b <= W - 1 :
                    count.add ( ( a , b ) )
    ans = [ ( H - 2 ) * ( W - 2 ) ]
    for p in count.keys ( ) :
        ans [ count [ p ] ] += 1
        ans [ 0 ] -= 1
    for i in ans :
        print ( ans [ i ] )
