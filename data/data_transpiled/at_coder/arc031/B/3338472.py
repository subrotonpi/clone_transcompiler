def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.H = 10
        self.W = 10
        self.o_num = 0
        self.table = [ ]
        for line in open ( self.H ) :
            for c in line :
                if c == 'o' :
                    self.o_num += 1
                self.table.append ( [ c ] )
    for i in range ( self.H ) :
        for j in range ( self.W ) :
            if self.table [ i ] [ j ] == 'o' :
                continue
            self.table [ i ] [ j ] = 'o'
            for a in range ( self.H ) :
                for b in range ( self.W ) :
                    if self.table [ a ] [ b ] == 'x' :
                        continue
                    visited = [ ]
                    dfsRet = self.dfs ( a , b , visited )
                    if dfsRet == self.o_num + 1 :
                        print ( 'YES' )
                        return 0
                    break
            self.table [ i ] [ j ] = 'x'
    print ( 'NO' )
    def dfs ( a , b , visited ) :
        if a < 0 or b < 0 or a >= self.H or b >= self.W or visited [ a ] [ b ] or self.table [ a ] [ b ] == 'x' :
            return 0
        visited [ a ] [ b ] = True
        return self.dfs ( a + 1 , b , visited ) + self.dfs ( a - 1 , b , visited ) + self.dfs ( a , b - 1 , visited ) + self.dfs ( a , b + 1 , visited ) + 1
return Main
