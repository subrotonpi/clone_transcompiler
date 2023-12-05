def import _main
class B ( object ) :
    def __init__ ( self , a ) :
        self.n , self.m = a
    def str ( self ) :
        return self.n
    def good ( self , idx , lidx , cidx ) :
        with open ( '../' + str ( self.lidx ) , 'r' ) as f :
            self.n = int ( self.n )
            self.m = int ( self.m )
            self.d = [ f.read ( ) for f in f.readlines ( ) ]
            self.l = [ f.read ( ) for f in f.readlines ( ) ]
        print ( 'Case #%d:' % ( ca + 1 ) , end = ' ' )
        for i in range ( self.m ) :
            besti = - 999999
            bests = None
            for j in range ( self.n ) :
                idx = 0
                guess = [ ]
                correct = 0
                points = 0
                for k in range ( self.n ) :
                    c = self.l [ j ] [ k ]
                    idx = 0
                    while idx < self.n and not good ( self , guess , idx , i , k ) :
                        idx += 1
                    if idx == self.n :
                        continue
                    good = False
                    for ii in range ( self.n ) :
                        if self.d [ ii ] == c :
                            good = True
                            self.guess [ ii ] = c
                            correct += 1
                    if not good :
                        points += 1
                    if correct == self.n :
                        break
                if points > besti :
                    besti = points
                    bests = self.d [ j ]
            print ( )
    def good ( self , guess , idx , lidx , cidx ) :
        c = self.l [ lidx ] [ cidx ]
        if len ( self.d [ idx ] ) != len ( guess ) :
            return False
        if len ( self.d [ idx ] ) == 0 :
            return False
        return True
    return B
