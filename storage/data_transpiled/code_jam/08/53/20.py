def import _no_cheating
class NoCheating ( object ) :
    def __init__ ( self ) :
        sc = _no_cheating
        for c in range ( 1 , C + 1 ) :
            M , N = sc.regs [ c ]
            ch = [ ]
            for i in range ( M ) :
                ch.append ( sc.regs [ c ] [ i ] )
            self.memo = [ [ 0 , 0 , 0 , 0 , 0 ] for arr4 in self.memo ]
            for arr2 in self.memo :
                for arr in arr2 :
                    arr.insert ( - 1 , - 1 )
            print ( "Case #%d: %s" % ( c , solve ( 0 , 0 , 0 , 0 , 0 ) ) )
    def __init__ ( self ) :
        self.M , self.N = M , N
    def solve ( self , prevup , prev , r , c , mask ) :
        if c >= N :
            return solve ( 0 , 0 , r + 1 , 0 , mask )
        if r >= M :
            return 0
        if self.memo [ prevup ] [ prev ] [ r ] [ c ] [ mask ] == - 1 :
            res = solve ( self.get ( mask , c ) , 0 , r , c + 1 , self.set ( mask , c , 0 ) )
            if self.ch [ r ] [ c ] == '.' and prevup == 0 and prev == 0 and self.get ( mask , c + 1 ) == 0 :
                res = max ( res , 1 + solve ( self.get ( mask , c ) , 1 , r , c + 1 , self.set ( mask , c , 1 ) ) )
            self.memo [ prevup ] [ prev ] [ r ] [ c ] [ mask ] = res
        return self.memo [ prevup ] [ prev ] [ r ] [ c ] [ mask ]
    def get ( self , mask , i ) :
        return ( mask >> i ) & 1
    def set ( self , mask , i , val ) :
        mask &= ~ ( 1 << i )
        if val == 1 :
            mask |= 1 << i
        return mask
