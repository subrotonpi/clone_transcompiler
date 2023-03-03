def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sys.stdin
        self.twocol = False
        self.size = 0
    def dfs ( v , c , col , adj ) :
        col [ v ] = c
        self.size += 1
        for u in col [ : - 1 ] :
            adj [ u ] = [ v ]
            adj [ v ].append ( u )
        col = [ ]
        self.numNonTwoCol = 0
        self.numTwoCol = 0
        self.numSizeOne = 0
        sizes = [ ]
        twoC = [ ]
        for i in range ( n ) :
            if col [ i ] == 0 :
                twocol = True
                self.size = 0
                self.dfs ( i , 1 , col , adj )
                sizes.append ( size )
                twoC.append ( twocol )
                if size == 1 :
                    self.numSizeOne += 1
                elif twocol :
                    self.numTwoCol += 1
                else :
                    self.numNonTwoCol += 1
        ans = 0
        for size , tc in zip ( sizes , twoC ) :
            if size == 1 :
                ans += n
                continue
            if tc :
                ans += self.numNonTwoCol + self.numSizeOne * size + 2 * self.numTwoCol
            else :
                ans += self.numNonTwoCol + self.numSizeOne * size + self.numTwoCol
        print ( ans )
    def dfs ( v , c , col , adj ) :
        col [ v ] = c
        self.size += 1
        for u in adj [ v ] :
            if col [ u ] == 0 :
                self.dfs ( u , 3 - c , col , adj )
            elif col [ u ] != 3 - c :
                self.twoCol = False
    Note :./ Main.py.uses.unsafe.operations.Note : with - Xlint :
        for details in range ( 1 , n ) :
            for u in adj [ v ] :
                if adj [ u ] == 0 :
                    self.dfs ( u , 3 - c , col , adj )
                elif adj [ u ] ==