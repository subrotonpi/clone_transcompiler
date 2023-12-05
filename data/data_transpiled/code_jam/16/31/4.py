def import _solve
class A ( object ) :
    def __init__ ( self , f ) :
        self.f = f
        self.T = int ( self.T )
        for C in range ( 1 , T + 1 ) :
            print ( "Case #%d:" % C , self.solve ( ) )
    def solve ( self ) :
        out = ""
        n = len ( self.f )
        count = [ ]
        remaining = 0
        for i in range ( n ) :
            count.append ( self.f.get ( i ) )
            remaining += count [ i ]
        while remaining :
            out += " "
            maxIdx = - 1
            for i in range ( n ) :
                if count [ i ] and ( maxIdx == - 1 or count [ i ] > count [ maxIdx ] ) :
                    maxIdx = i
            out += chr ( maxIdx ) + 'A'
            count [ maxIdx ] -= 1
            remaining -= 1
            if remaining <= 0 :
                break
            maxIdx = - 1
            gT0 = 0
            tie = 0
            for i in range ( n ) :
                if count [ i ] > 0 :
                    gT0 += 1
                if count [ i ] and ( maxIdx == - 1 or count [ i ] > count [ maxIdx ] ) :
                    maxIdx = i
                elif count [ i ] and gT0 == 2 and count [ i ] == count [ maxIdx ] :
                    tie = 1
            skip = tie and gT0 == 2
            if not skip :
                out += chr ( maxIdx ) + 'A'
                count [ maxIdx ] -= 1
                remaining -= 1
        return out
return A
