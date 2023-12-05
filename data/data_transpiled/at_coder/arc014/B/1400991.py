def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = len ( sys.argv )
    def __init__ ( self ) :
        self.word = [ ]
        self.preW = sys.argv [ 1 ]
        self.word.append ( self.preW )
        lose = 0
        for i in range ( 2 , N + 1 ) :
            s = sys.argv [ 1 ]
            if s in self.word :
                lose = i
                break
            if self.preW [ - 1 ] != s [ 0 ] :
                lose = i
                break
            self.preW = s
            self.word.append ( s )
    ans = ""
    if lose == 0 :
        ans = "DRAW"
    else :
        if lose % 2 == 0 :
            ans = "WIN"
        else :
            ans = "LOSE"
    print ( ans )
