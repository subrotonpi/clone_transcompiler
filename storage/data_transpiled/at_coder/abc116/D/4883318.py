def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.__next__ ( )
        K = sc.__next__ ( )
        t = [ ]
        d = [ ]
        for i in range ( N ) :
            t.append ( sc.__next__ ( ) )
            d.append ( sc.__next__ ( ) )
        def __init__ ( self , t , d ) :
            self.t = t
        def __lt__ ( self , other ) :
            return self.d - self.d
    Note :._main.uses.py.Note : Recompile.with - Xlint.details :
    def solve ( N , K , t , d ) :
        sushis = [ ( t , d ) for t in t ]
        abc116DSolve = _main.ABC116DSolveWork ( sushis , K )
        return abc116DSolve.solve ( )
    class ABC116DSolveWork ( object ) :
        def __init__ ( self , sushis , K ) :
            self.sushis = sushis
            self.K = K
            self.sort ( )
        def solve ( self ) :
            return self.search_ans ( )
        def search_ans ( self ) :
            point = 0
            size = 0
            types = set ( )
            chohukus = [ ]
            kouho = [ ]
            for sushi in self.sushis :
                point += sushi.d
                if sushi.t in types :
                    chohukus.append ( sushi )
                else :
                    types.add ( sushi.t )
                    size += 1
            ans = point + size * size
            for sushi in self.sushis :
                if sushi.t not in types :
                    chohukus.append ( sushi )
                else :
                    kouho.append ( sushi )
            return ans
    return Main ( )
