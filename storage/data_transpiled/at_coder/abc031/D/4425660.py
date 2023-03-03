def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.K = int ( self.K )
        self.N = int ( self.N )
        v = [ ]
        w = [ ]
        for i in range ( self.N ) :
            v.append ( self.__next__ ( ) )
            w.append ( self.__next__ ( ) )
        d = [ ]
        self.dfs ( d , N , v , w , [ 0 , 0 , 0 ] )
        for i in range ( 1 , K + 1 ) :
            print ( d [ i ] )
    def dfs ( d , N , v , w , pos ) :
        i , j , k = pos
        if i == N :
            return j == 0 and k == 0
        if j == len ( v [ i ] ) and k == len ( w [ i ] ) :
            return self.dfs ( d , N , v , w , [ i + 1 , 0 , 0 ] )
        if j >= len ( v [ i ] ) or k >= len ( w [ i ] ) :
            return False
        while j < len ( v [ i ] ) and k < len ( w [ i ] ) :
            num = v [ i ] [ j ] - '0'
            if num in d :
                j += 1
                k += len ( d [ num ] )
            else :
                break
        if j == len ( v [ i ] ) and k == len ( w [ i ] ) :
            return self.dfs ( d , N , v , w , [ i + 1 , 0 , 0 ] )
        if j >= len ( v [ i ] ) or k >= len ( w [ i ] ) :
            return False
        for l in range ( 1 , 3 + l ) :
            num = v [ i ] - '0'
            if num in d :
                return True
            d [ num ] = None
        return False
return Main
