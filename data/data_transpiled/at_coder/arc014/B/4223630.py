def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = len ( sys.argv )
        last = '0'
        loser = 0
        seen = set ( )
        for i , s in enumerate ( sys.argv [ 1 : ] ) :
            if i != 0 :
                if s [ 0 ] != last or s in seen :
                    loser = i
                    break
            last = s [ - 1 ]
            seen.add ( s )
        if loser == 0 :
            print ( "DRAW" )
        elif loser % 2 == 0 :
            print ( "LOSE" )
        else :
            print ( "WIN" )
