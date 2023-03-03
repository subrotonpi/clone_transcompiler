def import import sys
class a ( object ) :
    def __init__ ( self ) :
        self.input = sys.stdin
    T = len ( sys.stdin )
    for t in range ( T ) :
        print ( "Case #%d: " % ( t + 1 ) , end = "" )
        a = sys.stdin.read ( ) - 1
        possible = [ False ] * 17
        count = 0
        for i in range ( 4 ) :
            for cur in sys.stdin.read ( ) :
                if i == a : possible [ cur ] = True
        poss2 = [ False ] * 17
        b = sys.stdin.read ( ) - 1
        for i in range ( 4 ) :
            for cur in sys.stdin.read ( ) :
                if i == b and possible [ cur ] :
                    poss2 [ cur ] = True
                    count += 1
        if count > 1 :
            print ( "Bad magician!" )
        elif count == 0 :
            print ( "Volunteer cheated!" )
        else :
            res = 0
            for i in range ( 1 , 17 ) :
                if poss2 [ i ] :
                    res = i
                print ( res )
