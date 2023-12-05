def _import ( ) :
    from itertools import repeat
    class D ( object ) :
        def __init__ ( self ) :
            self.T = self.T
            for i in range ( 1 , T + 1 ) :
                print ( "Case #%d: " % i , end = "" )
                print ( self.solve ( ) )
        def solve ( self ) :
            self.N = self.T
            g = [ ]
            for i in range ( self.N ) :
                row = self.next ( )
                for j in range ( self.N ) :
                    if self.g [ i ] [ j ] == '1' :
                        self.N += 1
    def rec ( self , used_p , used_m , map ) :
        ans = 0
        for i in range ( self.N ) :
            for j in range ( self.N ) :
                if self.g [ i ] [ j ] == '1' :
                    self.N += 1
                if not self.g [ i ] [ j ] == '0' :
                    return 1000000
        for i in range ( self.N ) :
            if self.used_p [ i ] :
                continue
            for j in range ( self.N ) :
                if self.used_m [ j ] :
                    continue
                nmap = [ ]
                for k in range ( self.N ) :
                    nmap.append ( map [ k ] [ i ] )
                for k in range ( self.N ) :
                    if k != self.j :
                        nmap.append ( False )
                    if k != self.i :
                        nmap.append ( False )
                used_p [ i ] = True
                used_m [ j ] = True
                ans = min ( ans , rec ( self , used_p , nmap ) )
                used_m [ i ] = False
                used_m [ j ] = False
    return ans
