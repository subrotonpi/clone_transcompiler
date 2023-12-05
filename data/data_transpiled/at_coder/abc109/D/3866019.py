def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.h = sys.stdin.read ( )
        self.w = sys.stdin.read ( )
        self.place = [ [ ] for j in range ( self.h ) ]
    i = 0
    j = 0
    ni = 0
    nj = 0
    count = 0
    lines = [ ]
    while 1 :
        if j % 2 == 0 :
            if i == self.w - 1 :
                ni = i
                nj = j + 1
                if nj == self.h :
                    break
            else :
                ni = i + 1
                nj = j
        else :
            if i == 0 :
                ni = i
                nj = j + 1
                if nj == self.h :
                    break
            else :
                ni = i - 1
                nj = j
        if place [ i ] [ j ] % 2 != 0 :
            lines.append ( "%d %d %d %d\n" % ( j + 1 , i + 1 , nj + 1 , ni + 1 ) )
            place [ i ] [ j ] -= 1
            place [ ni ] [ nj ] += 1
            count += 1
        i = ni
        j = nj
    print ( count )
    print ( lines , end = '' )
