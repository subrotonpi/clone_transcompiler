def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.maxint
        self.y = sys.maxint
    def __init__ ( self ) :
        self.x = sys.maxint
        self.y = sys.maxint
    def __init__ ( self , x , y ) :
        self.x = x
        self.y = y
    a = [ 1 , 3 , 5 , 7 , 8 , 10 , 12 ]
    b = [ 4 , 6 , 9 , 11 ]
    if x == 2 or y == 2 :
        print ( "No" )
        return
    for i in a :
        if x == i :
            for j in range ( len ( a ) ) :
                if y == a [ j ] :
                    print ( "Yes" )
                    return
    for i in b :
        if x == i :
            for j in range ( len ( b ) ) :
                if y == b [ j ] :
                    print ( "Yes" )
                    return
    print ( "No" )
