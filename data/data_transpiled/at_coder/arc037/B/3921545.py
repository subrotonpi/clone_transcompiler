def import _main
class Main ( object ) :
    def __init__ ( self , argv ) :
        BaumTest.__init__ ( self )
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.m = int ( self.m )
        self.vertex = [ False ] * n
        self.edge = [ False ] * n
        for i in range ( self.n ) :
            self.vertex [ i ] = True
            [ edge [ i ] ] = False
        for i in range ( self.m ) :
            u , v = self.vertex [ i ] - 1 , self.edge [ i ] - 1
            self.edge [ u ] [ v ] = edge [ v ] [ u ] = True
        count = 0
        for i in range ( self.n ) :
            if self.dfs ( i ) :
                count += 1
        print ( count )
    def dfs ( v ) :
        if self.vertex [ v ] :
            return False
        self.vertex [ v ] = True
        for i in range ( self.n ) :
            if self.edge [ v ] [ i ] :
                self.edge [ i ] [ v ] = False
                flag = self.dfs ( i )
                self.edge [ i ] [ v ] = True
                if not flag :
                    return False
        return True
return Main
