def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.K = int ( self.K )
        self.T = [ ]
        for i in range ( self.N ) :
            for j in range ( self.K ) :
                self.T.append ( [ i , j ] )
    flag = False
    cnt = 0
    if _find_bug ( cnt , flag , self.T , 0 ) :
        print ( "Found" )
    else :
        print ( "Nothing" )
    def _find_bug ( cnt , flag , self.T , num ) :
        if cnt == self.N :
            if num == 0 :
                flag = True
            return flag
        for i in range ( self.K ) :
            if cnt == 0 :
                num = self.T [ 0 ] [ i ]
                flag = _find_bug ( cnt + 1 , flag , self.T , num )
            else :
                if cnt < self.N :
                    flag = _find_bug ( cnt + 1 , flag , self.T , num ^ self.T [ cnt ] [ i ] )
        return flag
