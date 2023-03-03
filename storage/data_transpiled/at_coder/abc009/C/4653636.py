def import _main
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.n = sc.n
        self.k = sc.k
        s = sc.read ( )
        t = s [ : ]
        ans = [ ]
        for i in range ( n ) :
            t.sort ( )
            for j in range ( i , n ) :
                ans.append ( t [ j ] )
                t.append ( t [ i ] )
                diff = _count1 ( s , ans , i + 1 ) + _count2 ( s , t , i + 1 , n )
                if diff <= k :
                    break
                t.append ( ans [ i ] )
        print ( ans )
    def _count1 ( sr , tg , e ) :
        diff = 0
        for i in range ( e ) :
            if sr [ i ] != tg [ i ] :
                diff += 1
        return diff
    def _count1 ( sr , tg , s , e ) :
        diff = e - s
        i = 0
        j = 0
        src = sr [ s : e ]
        tgt = tg [ s : e ]
        src = src [ e : ]
        tgt = tgt [ e : ]
        while i < len ( src ) and j < len ( tgt ) :
            if src [ i ] < tgt [ j ] :
                i += 1
            elif src [ i ] > tgt [ j ] :
                j += 1
            else :
                diff -= 1
                i += 1
                j += 1
        return diff
return Main
